package UNO
import UNO.Player
import org.scalatest._

class PlayerSpec extends WordSpec with Matchers {
  "A Player" when {
    "created" should {
      val player = Player("Bob")
      "have a name" in {
        player.name should be("Bob")
      }
      "have a nice String representation" in {
        player.toString should be("Bob")
      }

    }
  }}
