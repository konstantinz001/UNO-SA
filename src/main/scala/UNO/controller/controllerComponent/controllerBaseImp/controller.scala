package UNO.controller.controllerComponent.controllerBaseImp

import UNO.UnoGameModule
import UNO.aview.gui.{NameGui, SwingGui}
import UNO.controller.GameStatus._
import UNO.controller.controllerComponent._
import UNO.model.GameState
import UNO.model.PlayerComponent.playerBaseImp.Player
import UNO.model.cardComponent.cardBaseImp.Card
import UNO.model.stackComponent.stackBaseImp.Stack
import UNO.util.UndoManager
import UNO.model.fileIOComponent.FileIOTrait
import com.google.inject.{Guice, Inject}
import net.codingwell.scalaguice.InjectorExtensions.ScalaInjector

import scala.io.StdIn.readLine
import scala.swing.Publisher


class controller @Inject() extends controllerInterface with Publisher{

  var gameStatus: GameStatus = IDLE
  var playername1 = ""
  var playername2 = ""
  initPlayerName()
  var stackCard = initStackCard()
  var playerList = initPlayerList()
  var playStack2 = initPlayStack()
  var colorSet = ""
  var unoCall = false

  private val undoManager = new UndoManager
  var gameState: GameState = new GameState(playerList, playStack2)
  val gui = new SwingGui(this)
  val injector = Guice.createInjector(new UnoGameModule)
  val fileIo = injector.instance[FileIOTrait]
  publish(new welcomeStates)
  gui.open()

  def setDefault(): Unit = {
    stackCard = initStackCard()
    playerList = initPlayerList()
    playStack2 = initPlayStack()
    publish(new updateStates)
  }

  def initStackCard() : Stack = {
    var stackCards =Stack(List(new Card("",""))).initStack()
    /*(1 to 100).foreach((i)=>{
      stackCard = stackCard.shuffleCards()
    })*/
    stackCards
  }

  def initPlayStack() : List[Card] = {

    while (stackCard.getCardFromStack().color == "black") {
      stackCard = stackCard.pullCards(List(stackCard.getCardFromStack()))
      stackCard = stackCard.removeCard()
    }
    List(stackCard.getCardFromStack())
  }

  def stackEmpty(): Stack = {
    if (stackCard.stackCards.length <= 5) {
      stackCard = stackCard.reversePullCards(playStack2).shuffleCards()
      (1 to 100).foreach((i)=>{
        stackCard = stackCard.shuffleCards()
      })
    }
    stackCard
  }

  def initPlayerList(): List[Player] = {
    def startHand(): List[Card] = {
      var starthand = List(Card("",""))
      (1 to 7).foreach((i)=>{
        starthand = stackCard.getCardFromStack() :: starthand
        stackCard = stackCard.removeCard()
      })
      starthand.init.reverse
    }
    List(Player(playername1,startHand()),Player(playername2,startHand()))
  }

  def initPlayerName(): Unit = {
    val gui1 = new NameGui(this)

    while (playername1.length == 0 && playername2.length == 0) {
      var input = readLine("\nPlay an UNO-Game?\nEnter any Key: ")
      val is: Array[String] = input.split(" ")
      is(0) match {

        case _ => {
          playername1 = readLine("Player1: Please Enter your Name\n")
          playername2 = readLine("Player2: Please Enter your Name\n")
        }
      }
      gui1.open()
    }
    gui1.close()
  }

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
