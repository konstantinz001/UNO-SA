package util

import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.should.Matchers
import UNO.UnoGame.Controller
import UNO.aview.TUI
import UNO.controller.controllerComponent.controllerBaseImp.controller
import UNO.util.{callFirstUnoEvent, callSecondUnoEvent, exitGameEvent, forgotCallUnoEvent, gameStatsEvent, instructionEvent, removeFalseCardEvent, removePlayerCardEvent, setPlayerCardEvent, toManyCardsEvent}

class EventSpec extends AnyWordSpec with Matchers {
  "Event" should {
    "instructionEvent" in {
      instructionEvent should be
      ("\nPossible instructions:\n" +
        "\tq = Quit\n" +
        "\ts = Take a new Card from Stack\n" +
        "\tr = Put a Card from Hand into GameBoard\n" +
        "\tu = Call UNO/ UNO-UNO\n" +
        "\n" + "_" * 50 + "\n")
    }
    "gameStartEvent" in {
      gameStatsEvent() should be
      ("\n" + "_" * 50 + "\n" +
        "\nUNO! " + "\n" +
        "\n" + "_" * 50 + "\n")
    }

    "exitGameEvent" in {
      exitGameEvent should be
      ("\nGame exit\n")
    }
    "removeFalseCardEvent" in {
      removeFalseCardEvent should contain
      (" ")
    }
    "callFirstUnoEvent" in {
      val index = 0
      callFirstUnoEvent(index) should contain
      (" ")
    }

    "removePlayerCardEvent" in {
      removePlayerCardEvent(0) should contain
      (" ")
    }
    "setPlayerCardEvent" in {
      setPlayerCardEvent should contain
      (" ")
    }

    "callSecondUno" in {
      callSecondUnoEvent should contain
      (" ")
    }

    "toManyCardsEvent" in {
      toManyCardsEvent should contain
      (" ")
    }

    "forgotCallUnoEvent" in {
      forgotCallUnoEvent should contain
      (" ")
    }
  }
}