package util

import UNO.UnoGame.controller
import UNO.util.{callFirstUnoEvent, callSecondUnoEvent, exitGameEvent, forgotCallUnoEvent, gameStatsEvent, instructionEvent, removeFalseCardEvent, removePlayerCardEvent, setPlayerCardEvent, toManyCardsEvent}
import org.scalatest.{Matchers, WordSpec}

class EventSpec extends WordSpec with Matchers {
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
    "gameStatsEvent" in {
      gameStatsEvent should be
      ("\n" + "_" * 50 + "\nPLAYER " + controller.playerList(0).name.toUpperCase() +
        "\n\nHandcards: \t" + controller.playerList(0).playerCards +
        "\n\n\nPlayStack: \t" + controller.playStack2(0) + "\n" +
        "\nStackCard: \t" + controller.stackCard + "\n\n")
    }
    "exitGameEvent" in {
      exitGameEvent should be
      ("\nGame exit\n")
    }
    "removeFalseCardEvent" in {
      removeFalseCardEvent should be
      ("\nWrong Card!\n")
    }
    "setPlayerCardEvent" in {
      setPlayerCardEvent should be
      ("\n--Handcards:\t" + controller.playerList(1).playerCards)
    }
    "removePlayerCardEvent" in {
      removePlayerCardEvent(0) should be
      ("\n\n--Handcards:\t" + controller.playerList(1).playerCards + "\n")
    }
    "callFirstUnoEvent" in {
      val index = 0
      callFirstUnoEvent(index) should be
      ("UNO\n" +
        removePlayerCardEvent(index) + "\n")
    }
    "callSecondUno" in {
      callSecondUnoEvent should be
      ("\nUNO - UNO!\n" +
        "Player " + controller.playerList(0).name.toUpperCase() + ":WON\n")
    }
    "toManyCardsEvent" in {
      toManyCardsEvent should be
      ("\nTo many Cards\n" +
        "\n--Handcards:\t" + controller.playerList(1).playerCards + "\n")
    }
    "forgotCallUnoEvent" in {
      forgotCallUnoEvent should be
      ("\nYou have forgot to Call UNO\n" +
        "\n--Handcards:\t" + controller.playerList(1).playerCards + "\n")
    }
  }
}