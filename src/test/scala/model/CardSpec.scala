package model

import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.should.Matchers
import UNO.model.cardComponent.cardBaseImp.Card

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