package UNO.controller.controllerComponent.controllerStuckImp

import UNO.aview.gui.SwingGui
import UNO.controller.controllerComponent.controllerInterface
import UNO.model.PlayerComponent.playerBaseImp.Player
import UNO.model.cardComponent.cardBaseImp.Card
import UNO.model.stackComponent.stackBaseImp.Stack


abstract class Controller extends controllerInterface{

  override val playername1 = "Konstantin"
  override val playername2 = "Soni"

  override val stackCard: Stack = Stack(List(new Card("",""))).initStack()

  override val playerList: List[Player] = List(Player("Testy",List(Card("","red"))))

  override val playStack2: List[Card] = List(Card("","blue"))

  override val colorSet: String = "yellow"

  override val unoCall: Boolean = false

  override def initPlayStack(): List[Card] = List(Card("","blue"))

  override def initPlayerList(): List[Player] = List(Player("Testy",List(Card("","red"))))

  override def getCard(): Unit = {}

  override def removeCard(handindex: Int): Unit = {}

  override def undoGet: Unit = {}

  override def redoGet: Unit = {}

  override def stackEmpty(): Stack = stackCard

  override def save: Unit = {}

  override def load: Unit = {}

  override def setDefault(): Unit = {}

  override def initStackCard() : Stack = Stack(List(new Card("",""))).initStack()

}