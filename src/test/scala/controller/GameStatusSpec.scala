//package UNO.controller

import UNO.controller.GameStatus
import UNO.controller.GameStatus._
import org.scalatest.{Matchers, WordSpec}

class GameStatusSpec extends WordSpec with Matchers {
  var gameStatus = IDLE
  "A GameStatus" when {
    "have status IDLE" in {
      GameStatus.message(IDLE) should be ("")
    }
    "have status WON" in {
      GameStatus.message(WON) should be ("You won")
    }
    "have status LOST" in {
      GameStatus.message(LOST) should be ("You lost")
    }
  }
}