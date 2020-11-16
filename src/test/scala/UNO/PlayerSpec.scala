package UNO
import UNO.UnoGame.startHand
import UNO.model._
import org.scalatest._

class PlayerSpec extends WordSpec with Matchers {
  "A Player" when {
    "created" should {
      val player = Player("Bob",startHand())
      "have a name" in {
        player.name should be("Bob")
      }


    }
  }
}
