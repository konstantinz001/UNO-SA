package UNO.model


case class Card(value: String, color: String) {
  override def toString: String = {
    "Card = %s || %s".format(value, color)
  }
}
