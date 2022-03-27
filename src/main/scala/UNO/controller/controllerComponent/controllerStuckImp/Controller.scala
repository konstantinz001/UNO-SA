package UNO.controller.controllerComponent.controllerStuckImp

import UNO.aview.gui.SwingGui
import UNO.controller.controllerComponent.controllerInterface
import UNO.model.PlayerComponent.playerBaseImp.Player
import UNO.model.cardComponent.cardBaseImp.Card
import UNO.model.stackComponent.stackBaseImp.Stack


abstract class Controller extends controllerInterface:

  override val playername1 = "Konstantin"
  override val playername2 = "Soni"

  override val stackCard: Stack = Stack(List(Card("",""))).initStack()

  override val playerList: List[Player] = List(Player("Testy",List(Card("","red"))))

  override val playStack2: List[Card] = List(Card("","blue"))

  override val colorSet: String = "yellow"

  override val unoCall: Boolean = false

  override def initPlayStack(): List[Card] = List(Card("","blue"))

  override def initPlayerList(): List[Player] = List(Player("Testy",List(Card("","red"))))

  override def getCard(): Unit = Option

  override def removeCard(handindex: Int): Unit = Option

  override def undoGet: Unit = Option

  override def redoGet: Unit = Option

  override def stackEmpty(): Stack = stackCard

  override def save: Unit = Option

  override def load: Unit = Option

  override def setDefault(): Unit = Option

  override def initStackCard() : Stack = Stack(List(Card("",""))).initStack()