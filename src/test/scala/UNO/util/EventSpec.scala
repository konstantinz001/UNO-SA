package UNO.util

import UNO.UnoGame.controller
import UNO.controller.GameStatus
import UNO.controller.GameStatus.WON
import org.scalatest.{Matchers, WordSpec}

class EventSpec extends WordSpec with Matchers {
  "instructionEvent" should {
    instructionEvent() should be
    (println("Possible instructions:\n"+
      "\tq = Quit\n"+
      "\ts = Take a new Card from Stack\n"+
      "\tr = Put a Card from Hand into GameBoard\n"+
      "\tu = Call UNO/ UNO-UNO\n"+
      "_" * 50 + "\n"))
  }
  "gameStartEvent" should {
    gameStatsEvent() should be
    (printf("_" * 50 + "\n"+
      "\nUNO! " +
      "_" * 50 + "\n"))
  }
  "gameStatsEvent" should {
    gameStatsEvent should be
    (print("\n" + "_" * 50 + "\nPLAYER " + controller.playerList(0).name.toUpperCase() +
      "\n\nHandcards: \t" + controller.playerList(0).playerCards +
      "\n\n\nPlayStack: \t" + controller.playStack +
      "\nStackCard: \t" + controller.stackCard + "\n"))
  }
  "exitGameEvent" should {
    exitGameEvent should be
    (println("Game exit"))
  }
  "removeFalseCardEvent" should {
    removeFalseCardEvent should be
    (println("Wrong Card!"))
  }
  "setPlayerCardEvent" should {
    println("\n--Handcards:\t" + controller.playerList(0).setPlayerCards(controller.stackCard(0)).playerCards)
  }
  "removePlayerCardEvent" should {
    val index = 0
    removePlayerCardEvent(index) should be
    (println("\n--Handcards:\t" + controller.playerList(0).removePlayerCards(index).playerCards))
  }
  "callFirstUnoEvent" should {
    val index = 0
    callFirstUnoEvent(index) should be
    (println("UNO\n" +
      "\n--Handcards:\t" + controller.playerList(0).removePlayerCards(index).playerCards))
  }
  "callSecondUno" should {
    controller.gameStatus = WON
    callSecondUnoEvent should be
    (println("UNO - UNO!\n" +
      "Player " + controller.playerList(0).name.toUpperCase()+ ":" + GameStatus.message(controller.gameStatus)))
  }
  "toManyCardsEvent" should {
    toManyCardsEvent should be
    (println("To many Cards" +
      "\n\n--Handcards:\t" + controller.playerList(0).setPlayerCards(controller.stackCard(0)).playerCards))
  }
}