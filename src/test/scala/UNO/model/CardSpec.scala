package UNO.model

import UNO.model.Card

import org.scalatest._

class CardSpec extends WordSpec with Matchers {
  "A Card" when {
    "new" should {
      val card = Card("3", "red")
      "have a number" in {
        card.value.toInt should be(3)
      }
      "have a color" in {
        card.color should be("red")
      }
      "have a nice String representation" in {
        card.toString should be("Card = 3 || red")
      }
      "Card" in {
        card should be (Card("3", "red"))
      }
    }
  }
}
