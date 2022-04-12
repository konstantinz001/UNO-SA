package UNO.controller.controllerComponent.controllerStuckImp

import UNO.aview.gui.SwingGui
import UNO.controller.controllerComponent.controllerInterface
import UnoPlayer.playerBaseImp.Player
import UnoCards.cardBaseImp.Card
import UnoStack.stackBaseImp.Stack


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

  override def getCard(): Unit = null

  override def removeCard(handindex: Int): Unit = null

  override def undoGet: Unit = null

  override def redoGet: Unit = null

  override def stackEmpty(): Stack = stackCard

  override def save: Unit = null

  override def load: Unit = null

  override def setDefault(): Unit = null

  override def initStackCard() : Stack = Stack(List(Card("",""))).initStack()