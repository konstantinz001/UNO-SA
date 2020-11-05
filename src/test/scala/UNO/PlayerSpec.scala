package UNO
import UNO.Player
import org.scalatest._

class PlayerSpec extends WordSpec with Matchers {
  "A Player" when {
    "new" should {
      val player = Player("Soni")
      "have a name" in {
        player.name should be("Soni")
      }
      "have a nice String representation" in {
        player.toString should be("Soni")
      }

    }
  }}
