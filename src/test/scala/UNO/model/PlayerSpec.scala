package UNO.model

import org.scalatest._

class PlayerSpec extends WordSpec with Matchers {
  "A Player" when {
    "created" should {
      val player = Player("Bob",Player.startHand())
      "have a name" in {
        player.name should be("Bob")
      }
      "have a hand" in {
        player.playerCards should be
        ("List(Card = 1 || green, Card = 2 || red, Card = 3 || blue, " +
          "Card = 4 || blue, Card = 5 || yellow)")
      }
      "have a String" in {
        player.toString should be
        ("Bob" + "\n" + "List(Card = 1 || green, Card = 2 || red, Card = 3 || blue, " +
          "Card = 4 || blue, Card = 5 || yellow)" + "\n")
      }
    }
    "pull new Card" should {
      val playertmp = Player("Bob",Player.startHand())
      val card = new Card("1", "red")
      val player = playertmp.setPlayerCards(card)
      "have a name" in {
        player.name should be("Bob")
      }
      "have a hand" in {
        player.playerCards should be
        ("List(Card = 1 || red, Card = 1 || green, Card = 2 || red, " +
          "Card = 3 || blue, Card = 4 || blue, Card = 5 || yellow)")
      }
    }
    "remove Card" should {
      val playertmp = Player("Bob",Player.startHand())
      val idx = 0
      val player = playertmp.removePlayerCards(0)
      "have a name" in {
        player.name should be("Bob")
      }
      "have a hand" in {
        player.playerCards should be
        ("List(Card = 2 || red, Card = 3 || blue, Card = 4 || blue, " +
          "Card = 5 || yellow)")
      }
    }
    "startHand" should {
      val h = Player.startHand()
      "have a size" in {
        h.size should be(3)
      }
      "have a Card" in {
        h(0) should be(Card("1", "green"))
      }
    }
  }
}
