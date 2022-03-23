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

  enum Number (val name:String):
    case Zero extends Number("0")
    case One extends Number("1")
    case Two extends Number("2")
    case Three extends Number("3")
    case Four extends Number("4")
    case Five extends Number("5")
    case Six extends Number("6")
    case Seven extends Number("7")
    case Eight extends Number("8")
    case Nine extends Number("9")

  enum Special (val name:String):
    case PlusTwo extends Special("+2")
    case Reverse extends Special("<-->")
    case Expose extends Special("Ø")
    case CSwitch extends Special("ColorSwitch")
    case CSwitchPlusFour extends Special("4+ ColorSwitch")


  def initStack(): Stack =
    val green = List(Card(Number.Zero.name, Color.Green.name), Card(Number.One.name, Color.Green.name), Card(Number.Two.name, Color.Green.name), Card(Number.Three.name, Color.Green.name),
      Card(Number.Four.name, Color.Green.name), Card(Number.Five.name, Color.Green.name), Card(Number.Six.name, Color.Green.name), Card(Number.Seven.name, Color.Green.name), Card(Number.Eight.name, Color.Green.name),
      Card(Number.Nine.name, Color.Green.name), Card(Special.PlusTwo.name, Color.Green.name), Card(Special.Reverse.name, Color.Green.name), Card(Special.Expose.name, Color.Green.name))

    val red = List(Card(Number.Zero.name, Color.Red.name), Card(Number.One.name, Color.Red.name), Card(Number.Two.name, Color.Red.name), Card(Number.Three.name, Color.Red.name),
      Card(Number.Four.name, Color.Red.name), Card(Number.Five.name, Color.Red.name), Card(Number.Six.name, Color.Red.name), Card(Number.Seven.name, Color.Red.name), Card(Number.Eight.name, Color.Red.name),
      Card(Number.Nine.name, Color.Red.name), Card(Special.PlusTwo.name, Color.Red.name), Card(Special.Reverse.name, Color.Red.name), Card(Special.Expose.name, Color.Red.name))

    val blue = List(Card(Number.Zero.name, Color.Blue.name), Card(Number.One.name, Color.Blue.name), Card(Number.Two.name, Color.Blue.name), Card(Number.Three.name, Color.Blue.name),
      Card(Number.Four.name, Color.Blue.name), Card(Number.Five.name, Color.Blue.name), Card(Number.Six.name, Color.Blue.name), Card(Number.Seven.name, Color.Blue.name), Card(Number.Eight.name, Color.Blue.name),
      Card(Number.Nine.name, Color.Blue.name), Card(Special.PlusTwo.name, Color.Blue.name), Card(Special.Reverse.name, Color.Blue.name), Card(Special.Expose.name, Color.Blue.name))

    val yellow = List(Card(Number.Zero.name,Color.Yellow.name), Card(Number.One.name,Color.Yellow.name), Card(Number.Two.name,Color.Yellow.name), Card(Number.Three.name,Color.Yellow.name),
      Card(Number.Four.name,Color.Yellow.name), Card(Number.Five.name,Color.Yellow.name), Card(Number.Six.name,Color.Yellow.name), Card(Number.Seven.name,Color.Yellow.name), Card(Number.Eight.name,Color.Yellow.name),
      Card(Number.Nine.name,Color.Yellow.name), Card(Special.PlusTwo.name,Color.Yellow.name), Card(Special.Reverse.name,Color.Yellow.name), Card(Special.Expose.name,Color.Yellow.name))

    val black = List(Card(Special.CSwitch.name,Color.Black.name), Card(Special.CSwitchPlusFour.name,Color.Black.name))
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
