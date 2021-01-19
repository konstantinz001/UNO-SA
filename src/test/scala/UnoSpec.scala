
import UNO.UnoGame
import org.scalatest.{Matchers, WordSpec}

class SudokuSpec extends WordSpec with Matchers {

  "The UNO main class" should {
    "accept text input as argument without readline loop, to test it from command line " in {
      UnoGame.main(Array[String]("s"))
    }
  }

}