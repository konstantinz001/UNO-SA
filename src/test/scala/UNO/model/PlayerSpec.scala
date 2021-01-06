package UNO.model

import UNO.UnoGame.controller
import UNO.model.PlayerComponent.playerBaseImp.Player
import UNO.model.cardComponent.cardBaseImp.Card

import scala.util.{Failure, Success, Try}
import org.scalatest._
import play.api.libs.json.JsResult.Exception

import scala.None

class PlayerSpec extends WordSpec with Matchers {
  "A Player" when {
    "created" should {
      val player = Player("Bob",controller.startHand())
      "have a name" in {
        player.name should be("Bob")
      }
      "have a hand" in {
        player.playerCards.size should be (7)
      }
    }
    "pull new Card" should {
      val playertmp = Player("Bob",controller.startHand())
      val card = new Card("1", "red")
      val player = playertmp.setPlayerCards(card)
      "have a name" in {
        player.name should be("Bob")
      }
      "have a hand" in {
        player.playerCards.size should be (8)
      }
    }
    "remove Card" should {
      val playertmp = Player("Bob",controller.startHand())
      val player = playertmp.removePlayerCards(0)
      "have a name" in {
        player.name should be("Bob")
      }
      "have a hand" in {
        player.playerCards.size should be (6)
      }
      /*"remove Card None" should {
        val playertmp = Player("Bob", controller.startHand())
        val player = playertmp.removePlayerCards(5000)
        "None" in {
          player should be (None)
        }
      }*/
    }
  }
}
