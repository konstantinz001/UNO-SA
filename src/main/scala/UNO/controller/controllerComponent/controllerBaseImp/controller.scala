package UNO.controller.controllerComponent.controllerBaseImp



import UNO.UnoGameModule
import UNO.aview.gui.SwingGui
import UNO.controller.GameStatus._
import UNO.controller.controllerComponent._
import UNO.model.GameState
import UNO.model.PlayerComponent.playerBaseImp.Player
import UNO.model.cardComponent.cardBaseImp.Card
import UNO.model.stackComponent.stackBaseImp.Stack
import UNO.util.{State, UndoManager, instructionEvent}
import UNO.model.fileIOComponent.FileIOTrait
import com.google.inject.Guice
import net.codingwell.scalaguice.InjectorExtensions.ScalaInjector

import scala.swing.Publisher


class controller extends controllerInterface with Publisher{
//TODO Asking for Playername
  var gameStatus: GameStatus = IDLE
  var playername1 = "Konstantin"
  var playername2 = "Soni"
  private val undoManager = new UndoManager ////COMPONENT NOT SURE
  val injector = Guice.createInjector(new UnoGameModule)
//TODO Game runs, but Stack should init again for more Cards
  var stackCard = Stack(List(new Card("",""))).initStack()
  /*(1 to 100).foreach((i)=>{
    stackCard = stackCard.shuffleCards()
  })*/
  var playerList = createPlayer()
  var playStack2 = initPlayStack()
  var colorSet = ""
  var unoCall = false
  val fileIo = injector.instance[FileIOTrait]
  var gameState: GameState = new GameState(playerList, playStack2)
  val gui = new SwingGui(this)
  this.publish(new updateStates)
  publish(new updateStates)
  gui.open()

  def newGame() : Unit = {
    gameStatus = IDLE
    playername1 = "Konstantin"
    playername2 = "Soni"
    //TODO Game runs, but Stack should init again for more Cards
    stackCard = Stack(List(new Card("",""))).initStack()
    /*(1 to 100).foreach((i)=>{
      stackCard = stackCard.shuffleCards()
    })*/
    playerList = createPlayer()
    playStack2 = initPlayStack()
    colorSet = ""
    unoCall = false
    gameState = new GameState(playerList, playStack2)
    this.publish(new updateStates)
    publish(new updateStates)
  }

  //Methods to init PlayerList and Stacks
  def initPlayStack() : List[Card] = {

    while (stackCard.getCardFromStack().color == "black") {
      stackCard = stackCard.pullCards(List(stackCard.getCardFromStack()))
      stackCard = stackCard.removeCard()
    }
    return List(stackCard.getCardFromStack())
  }

  def stackEmpty(): Stack = {
    if (stackCard.stackCards.length <= 5) {
      stackCard = stackCard.reversePullCards(playStack2).shuffleCards()
      (1 to 100).foreach((i)=>{
        stackCard = stackCard.shuffleCards()
      })
    }
    return stackCard
  }

  def createPlayer(): List[Player] = {
    return List(Player(playername1,startHand()),Player(playername2,startHand()))
  }

  def startHand(): List[Card] = {
    var starthand = List(Card("",""))
    (1 to 7).foreach((i)=>{
      starthand = stackCard.getCardFromStack() :: starthand
      stackCard = stackCard.removeCard()
    })
    return starthand.init.reverse
  }

//TODO Problems with Card <-->!!!!!!!!!!!!!!!!!
  //////////////////////////////////////////////////////////////////////////////////////////////////////////////
  def getCard(): Unit = {
    stackCard = stackEmpty()
    undoManager.doStep(new SetCommand(this))
    publish(new updateStates)
  }
  def removeCard(handindex: Int) {
    stackCard = stackEmpty()
    undoManager.doStep(new RemoveCommand(handindex:Int, this))
    unoCall = false
    publish(new updateStates)
  }
  def undoGet: Unit = {
    undoManager.undoStep
    publish(new updateStates)
  }

  def redoGet: Unit = {
    undoManager.redoStep
    publish(new updateStates)
  }

  override def save: Unit = {
    fileIo.save(GameState(playerList, playStack2))
  }

  override def load: Unit = {
    gameState = fileIo.load
    playerList = gameState.playerList
    stackCard = gameState.getstackCard()
    playStack2 = gameState.playStack
    publish(new updateStates)
  }
}
