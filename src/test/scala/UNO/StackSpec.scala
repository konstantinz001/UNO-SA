package UNO

import org.scalatest.{Matchers,WordSpec}

class StackSpec extends WordSpec with Matchers {
  "An initial Stack" should {
    val stack = Stack.initialize
    "contain 20 cards" in {
      stack.size should be(20)
    }
    "should have 20 cards" in { // for later checking if other cards are in the stack
      stack.count(_.isInstanceOf[Card]) should be (20)
    }

    "A shuffled Cardstack" should {
      val stack = Stack.initialize
      val stackShuff = Stack.shuffleCards(stack)

      "contains 20 Cards" in {
        stackShuff.size should be (20)
      }

      "contains 5 yellow with number 5" in {
        stackShuff.count(_.color=="yellow") should be (5)
      }
    }
  }

}
