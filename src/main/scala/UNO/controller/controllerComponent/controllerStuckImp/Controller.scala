package UNO.controller.controllerComponent.controllerStuckImp

import UNO.aview.gui.SwingGui
import UNO.controller.GameStatus.{GameStatus, IDLE}
import UNO.controller.controllerComponent.controllerInterface
import UNO.model.PlayerComponent.playerBaseImp.Player
import UNO.model.cardComponent.cardBaseImp.Card
import UNO.model.stackComponent.stackBaseImp.Stack

//TODO STUB


class Controller extends controllerInterface{
  override var gameStatus: GameStatus = IDLE

  override var playername1: String = "Player1"

  override var playername2: String = "Player2"

  override var stackCard: Stack = Stack(List(new Card("",""))).initStack()

  override var playerList: List[Player] = List(Player(playername1,List(Card("","red"))))

  override var playStack2: List[Card] = List(Card("","blue"))

  override var colorSet: String = "yellow"

  override var unoCall: Boolean = false

  override def initPlayStack(): List[Card] = List(Card("","blue"))

  override def createPlayer(): List[Player] = List(Player(playername1,List(Card("","red"))))

  override def startHand(): List[Card] = List(Card("","blue"))

  override def getCard(): Unit = {}

  override def removeCard(handindex: Int): Unit = {}

  override def undoGet: Unit = {}

  override def redoGet: Unit = {}

  override def stackEmpty(): Stack = stackCard

  override def save: Unit = {}

  override def load: Unit = {}

  override val gui: SwingGui = new SwingGui(this)

  override def newGame(): Unit = {}
}