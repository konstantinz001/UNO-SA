package UNO.model

import org.scalatest.{Matchers, WordSpec}

class StackSpec extends WordSpec with Matchers {
  "An initial Stack" should {
    val stack = Stack.initialize
    "contain 48 cards" in {
      stack.size should be(48)
    }
    "should have 48 cards" in { // for later checking if other cards are in the stack
      stack.count(_.isInstanceOf[Card]) should be (48)
    }

    "A shuffled Cardstack" should {
      val stack = Stack.initialize
      val stackShuff = Stack.shuffleCards(stack)

      "contains 20 Cards" in {
        stackShuff.size should be (48)
      }

      "contains 5 yellow with number 5" in {
        stackShuff.count(_.color=="yellow") should be (12)
      }
    }
  }

}
