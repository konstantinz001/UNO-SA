package model

import UNO.model.PlayerComponent.playerBaseImp.Player
import UNO.model.cardComponent.cardBaseImp.Card
import org.scalatest._

class PlayerSpec extends WordSpec with Matchers {
  val player = Player("Bob",List(Card("1","green"), Card("2","red"), Card("3","blue")))
  "A Player" when {
    "created" should {
      "have a name" in {
        player.name should be("Bob")
      }
      "have handcards" in {
        player.playerCards(0).color should be ("green")
        player.playerCards(0).value should be ("1")
        player.playerCards(1).color should be ("red")
        player.playerCards(1).value should be ("2")
        player.playerCards(2).color should be ("blue")
        player.playerCards(2).value should be ("3")
        player.playerCards.size should be (3)
      }
    }
    "pull a new card into Handcards" should {
      val card = new Card("9", "yellow")
      val playerTemporary = player.setPlayerCards(card)
      "have a name" in {
        player.name should be("Bob")
      }
      "have a hand" in {
        playerTemporary.playerCards(1).color should be ("green")
        playerTemporary.playerCards(1).value should be ("1")
        playerTemporary.playerCards(2).color should be ("red")
        playerTemporary.playerCards(2).value should be ("2")
        playerTemporary.playerCards(3).color should be ("blue")
        playerTemporary.playerCards(3).value should be ("3")
        playerTemporary.playerCards(0).color should be ("yellow") ///NEW CARD with Index = 0 (new Head of the List)
        playerTemporary.playerCards(0).value should be ("9")
        playerTemporary.playerCards.size should be (4)
      }
    }
    "remove Card" should {
      val playerTemporary = player.removePlayerCards(2)
      "have a name" in {
        player.name should be("Bob")
      }
      "have a hand" in {
        playerTemporary.playerCards(0).color should be ("green")
        playerTemporary.playerCards(0).value should be ("1")
        playerTemporary.playerCards(1).color should be ("red")
        playerTemporary.playerCards(1).value should be ("2")
        playerTemporary.playerCards.size should be (2)
      }
    }

    "remove Failure Card" should {
      "have a name" in {
        player.tryRemovePlayerCards(100) should be (None)
      }
    }

    "have a nice String representation" in {
      player.toString should be(player.toString)
    }
  }
}
