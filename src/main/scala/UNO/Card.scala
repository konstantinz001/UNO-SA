package UNO

case class Card(number: Int, color: String) {
  override def toString: String = {
    "Card = %d || %s".format(number,color)
  }
}