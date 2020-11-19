package UNO
import UNO.model._
import org.scalatest._

class PlayerSpec extends WordSpec with Matchers {
  "A Player" when {
    "created" should {
      val player = Player("Bob",Player.startHand())
      "have a name" in {
        player.getPlayerName should be("Bob")
      }
      "have a hand" in {
        player.getPlayerCards should be
        ("List(Card = 1 || green, Card = 2 || red, Card = 3 || blue, " +
          "Card = 4 || blue, Card = 5 || yellow)")
      }
    }
    "pull new Card" should {
      val playertmp = Player("Bob",Player.startHand())
      val card = new Card(1, "red")
      val player = playertmp.setPlayerCards(card)
      "have a name" in {
        player.getPlayerName should be("Bob")
      }
      "have a hand" in {
        player.getPlayerCards should be
        ("List(Card = 1 || red, Card = 1 || green, Card = 2 || red, " +
          "Card = 3 || blue, Card = 4 || blue, Card = 5 || yellow)")
      }
    }
    "remove Card" should {
      val playertmp = Player("Bob",Player.startHand())
      val idx = 0
      val player = playertmp.removePlayerCards(0)
      "have a name" in {
        player.getPlayerName should be("Bob")
      }
      "have a hand" in {
        player.getPlayerCards should be
        ("List(Card = 2 || red, Card = 3 || blue, Card = 4 || blue, " +
          "Card = 5 || yellow)")
      }
    }
  }
}
