package UNO.model.stackComponent.stackBaseImp

import UNO.model.cardComponent.cardBaseImp.Card
import UNO.model.stackComponent.StackInterface

import scala.util.Random

case class Stack(stackCards: List[Card]) extends StackInterface {
  def initStack(): Stack = {

    val green = List(Card("0", "green"), Card("1", "green"), Card("2", "green"), Card("3", "green"),
      Card("4", "green"), Card("5", "green"), Card("6", "green"), Card("7", "green"), Card("8", "green"),
      Card("9", "green"), Card("+2", "green"), Card("<-->", "green"), Card("Ø", "green"))

    val red = List(Card("0", "red"), Card("1", "red"), Card("2", "red"), Card("3", "red"),
      Card("4", "red"), Card("5", "red"), Card("6", "red"), Card("7", "red"), Card("8", "red"),
      Card("9", "red"), Card("+2", "red"), Card("<-->", "red"), Card("Ø", "red"))

    val blue = List(Card("0", "blue"), Card("1", "blue"), Card("2", "blue"), Card("3", "blue"),
      Card("4", "blue"), Card("5", "blue"), Card("6", "blue"), Card("7", "blue"), Card("8", "blue"),
      Card("9", "blue"), Card("+2", "blue"), Card("<-->", "blue"), Card("Ø", "blue"))

    val yellow = List(Card("0", "yellow"), Card("1", "yellow"), Card("2", "yellow"), Card("3", "yellow"),
      Card("4", "yellow"), Card("5", "yellow"), Card("6", "yellow"), Card("7", "yellow"), Card("8", "yellow"),
      Card("9", "yellow"), Card("+2", "yellow"), Card("<-->", "yellow"), Card("Ø", "yellow"))

    val black = List(Card("ColorSwitch", "black"), Card("4+ ColorSwitch", "black"))

    copy(green ::: green ::: red ::: red ::: blue ::: blue ::: yellow ::: yellow ::: black ::: black ::: Nil)
  }

  def shuffleCards(): Stack = {
    copy(Random.shuffle(stackCards))
  }

  def removeCard(): Stack = {
    copy(stackCards.tail)
  }

  def pullCards(playerStack: List[Card]): Stack = {
    copy(stackCards ::: playerStack)
  }

  def reversePullCards(playerStack: List[Card]): Stack = {
    copy((stackCards.reverse ::: playerStack).reverse)
  }

  def getCardFromStack(): Card = {
    stackCards(0)
  }
}