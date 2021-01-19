package model
import UNO.model.cardComponent.cardBaseImp.Card
import UNO.model.stackComponent.stackBaseImp.Stack
import org.scalatest.{Matchers, WordSpec}

class StackSpec extends WordSpec with Matchers {
  "An initial Stack" should {
    var stackCard = Stack(List(new Card("", ""))).initStack()
    "contain a cardStack" in {
      stackCard.stackCards.size should be(108)
    }
    "After Random" in {
      stackCard = stackCard.shuffleCards()
      stackCard.stackCards.size should be(108)
    }
    "After removeCard" in {
      stackCard = stackCard.removeCard()
      stackCard.stackCards.size should be (107)
    }
    "After pullCards" in {
      stackCard = stackCard.pullCards(List(Card("1","Search")))
      stackCard.stackCards.last.color should be ("Search")
    }
    "After reversePullCards" in {
      stackCard = stackCard.reversePullCards(List(Card("1","Search")))
      stackCard.getCardFromStack().color should be ("Search")
    }
  }
}