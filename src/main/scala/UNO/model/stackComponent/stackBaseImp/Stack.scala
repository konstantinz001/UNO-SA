package UNO.model.stackComponent.stackBaseImp

import UNO.model.cardComponent.cardBaseImp.Card
import UNO.model.stackComponent.StackInterface

import scala.util.Random

case class Stack(stackCards: List[Card]) extends StackInterface:
  enum Color (val name:String):
    case Green extends Color("green")
    case Blue extends Color("blue")
    case Red extends Color("red")
    case Yellow extends Color("yellow")
    case Black extends Color("black")


  def initStack(): Stack =
    val green = List(Card("0", Color.Green.name), Card("1", Color.Green.name), Card("2", Color.Green.name), Card("3", Color.Green.name),
      Card("4", Color.Green.name), Card("5", Color.Green.name), Card("6", Color.Green.name), Card("7", Color.Green.name), Card("8", Color.Green.name),
      Card("9", Color.Green.name), Card("+2", Color.Green.name), Card("<-->", Color.Green.name), Card("Ø", Color.Green.name))
    val red = List(Card("0", Color.Red.name), Card("1", Color.Red.name), Card("2", Color.Red.name), Card("3", Color.Red.name),
      Card("4", Color.Red.name), Card("5", Color.Red.name), Card("6", Color.Red.name), Card("7", Color.Red.name), Card("8", Color.Red.name),
      Card("9", Color.Red.name), Card("+2", Color.Red.name), Card("<-->", Color.Red.name), Card("Ø", Color.Red.name))
    val blue = List(Card("0", Color.Blue.name), Card("1", Color.Blue.name), Card("2", Color.Blue.name), Card("3", Color.Blue.name),
      Card("4", Color.Blue.name), Card("5", Color.Blue.name), Card("6", Color.Blue.name), Card("7", Color.Blue.name), Card("8", Color.Blue.name),
      Card("9", Color.Blue.name), Card("+2", Color.Blue.name), Card("<-->", Color.Blue.name), Card("Ø", Color.Blue.name))
    val yellow = List(Card("0",Color.Yellow.name), Card("1",Color.Yellow.name), Card("2",Color.Yellow.name), Card("3",Color.Yellow.name),
      Card("4",Color.Yellow.name), Card("5",Color.Yellow.name), Card("6",Color.Yellow.name), Card("7",Color.Yellow.name), Card("8",Color.Yellow.name),
      Card("9",Color.Yellow.name), Card("+2",Color.Yellow.name), Card("<-->",Color.Yellow.name), Card("Ø",Color.Yellow.name))
    val black = List(Card("ColorSwitch",Color.Black.name), Card("4+ ColorSwitch",Color.Black.name))
    copy(green ::: green ::: red ::: red ::: blue ::: blue ::: yellow ::: yellow ::: black ::: black ::: Nil)

  def shuffleCards(): Stack =
    copy(Random.shuffle(stackCards))

  def removeCard(): Stack =
    copy(stackCards.tail)

  def pullCards(playerStack: List[Card]): Stack =
    copy(stackCards ::: playerStack)

  def reversePullCards(playerStack: List[Card]): Stack =
    copy((stackCards.reverse ::: playerStack).reverse)

  def getCardFromStack(): Card =
    stackCards(0)
