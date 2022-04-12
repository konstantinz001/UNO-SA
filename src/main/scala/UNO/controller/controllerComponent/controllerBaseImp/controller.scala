package UNO.controller.controllerComponent.controllerBaseImp

import UNO.UnoGameModule
import UNO.aview.gui.SwingGui
import UNO.controller.controllerComponent.*
import UNO.controller.controllerComponent.GameStatus._
import UnoGameState.GameState
import UnoPlayer.playerBaseImp.Player
import UnoCards.cardBaseImp.Card
import UnoStack.stackBaseImp.Stack
import UNO.util.UndoManager
import UnoFileIO.FileIOTrait
import UnoFileIO.fileIOJsonImp.FileIO
import com.google.inject.{Guice, Inject}
import net.codingwell.scalaguice.InjectorExtensions.ScalaInjector

import scala.swing.Publisher
import scala.util.{Failure, Success}



class controller @Inject() extends controllerInterface with Publisher:
  var playername1 = "1"
  var playername2 = "2"
  var stackCard = initStackCard()
  var playerList = initPlayerList()
  var playStack2 = initPlayStack()
  var colorSet = ""
  var unoCall = false
  val five = 5
  val rangeIncl = Range.inclusive(1,100)
  var gameStatus: GameStatus = IDLE

  private val undoManager =new UndoManager
  var gameState: GameState = GameState(returnplayerList(), playStack2)
  def Controller = Guice.createInjector(new UnoGameModule).getInstance(classOf[controllerInterface])
  val injector = Guice.createInjector(new UnoGameModule)
  val fileIo: FileIO = injector.getInstance(classOf[FileIO])

  def setDefault(): Unit =
    stackCard = initStackCard()
    playerList = initPlayerList()
    playStack2 = initPlayStack()
    publish(new newgameStates)
  
  def returnplayerList():List[Player] =
    playerList

  def initStackCard() : Stack =
    var stackCards =Stack(List(Card("",""))).initStack()
    val rangeIncl = Range.inclusive(1,100)
    for(i <- rangeIncl)
      stackCards = stackCards.shuffleCards()
    stackCards
    

  def initPlayStack() : List[Card] =
    while stackCard.getCardFromStack().color == "black"
    do
      stackCard = stackCard.pullCards(List(stackCard.getCardFromStack()))
      stackCard = stackCard.removeCard()
    List(stackCard.getCardFromStack())

  def stackEmpty(): Stack =
    if stackCard.stackCards.length <= five then
      stackCard = stackCard.reversePullCards(playStack2).shuffleCards()
      val rangeIncl = Range.inclusive(1,100)
      for (i <- rangeIncl)
        stackCard = stackCard.shuffleCards()
    stackCard
    
    
  def initPlayerList():List[Player] =
    var starthand = List(Card("",""))
    def startHand(): List[Card] =
      var starthand = List(Card("",""))
      for(i <- (1 to 7))
        starthand = stackCard.getCardFromStack() :: starthand
        stackCard = stackCard.removeCard()
      starthand.init.reverse
    List(Player("1",startHand()),Player("2",startHand()))
  
  
  //////////////////////////////////////////////////////////////////////////////////////////////////////////////
  def getCard(): Unit =
    stackCard = stackEmpty()
    undoManager.doStep(SetCommand(this))
    publish(new updateStates)

  def removeCard(handindex: Int) =
    stackCard = stackEmpty()
    undoManager.doStep(new RemoveCommand(handindex:Int, this))
    unoCall = false
    publish(new updateStates)


  def undoGet:Unit = undoredget(true)
  def redoGet:Unit = undoredget(false)

  
  def undoredget(value:Boolean):Unit=
    if(value == true)
      undoManager.undoStep()
      gameStatus = UNDO
      publish(new undoStates)
    else
      undoManager.redoStep()
      gameStatus = REDO
      publish(new redoStates)


  override def save: Unit =
    fileIo.save(GameState(playerList, playStack2))
    gameStatus = SAVED
    publish(new saveStates)

  override def load:Unit=
    val gameState = fileIo.load
    gameState match {
      case Success(option) =>
        option.match {
          case Some(things) =>
            val(playerliste,playstackonthefield) = things
            playerList = playerliste
            playStack2 = playstackonthefield
            gameStatus = LOADED
            publish(new loadStates)
          case None=>
        }
      case Failure(e) =>
        gameStatus = COULD_NOT_LOAD
        publish(new failureStates)
    }
