package UnoCards

import UnoCards.cardBaseImp.Card
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class CardSpec extends AnyWordSpec with Matchers {
  "A Card" when {
    "new" should {
      val card = Card("3", "red")
      "have a number" in {
        card.value should be("3")
      }
      "have a color" in {
        card.color should be("red")
      }
      "have a nice String representation" in {
        card.toString should be("Card = 3 || red")
      }
      "have a Cardtype" in {
        card should be (Card("3", "red"))
      }
    }
  }
}