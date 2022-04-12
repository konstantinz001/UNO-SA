package UnoCards.cardBaseImp
import UnoCards.CardInterface

case class Card(value: String, color: String) extends CardInterface:
  val format_text:String = "Card = %s || %s"

  override def toString: String =
    format_text.format(value, color)

