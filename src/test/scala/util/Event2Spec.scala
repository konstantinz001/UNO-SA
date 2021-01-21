package util

import UNO.UnoGame.controller
import UNO.util.removeCardEvent
import org.scalatest.{Matchers, WordSpec}

class Event2Spec extends WordSpec with Matchers {
  controller
  "Event2" should {
    "removeCard" in {
      removeCardEvent should be (removeCardEvent)
      (controller.playerList(0).playerCards(0).color == controller.playStack2(0).color ||
        controller.playerList(0).playerCards(0).value == controller.playStack2(0).value ||) should be (true)
    }
  }
}