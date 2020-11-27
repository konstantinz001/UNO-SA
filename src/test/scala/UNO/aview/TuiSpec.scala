package aview

import UNO.UnoGame.controller
import UNO.aview.TUI
import UNO.controller.controller
import UNO.model.{Card, Player}
import org.scalatest._

class TuiSpec extends WordSpec with Matchers {
  "A TUI" should {
    val controller = new controller()
    val tui = new TUI(controller)
    controller.notifyObservers()

    //def playGame(pL:List[Player], stackCard: List[Card], playStack:Card, idx:Int): Unit = {
    "PlayGame input 'r' Player1" in {
      tui.processInputLine("r 0")
      (controller.playerList(0).playerCards(0).color == controller.playStack.color) should be (true)
      (controller.playerList(0).playerCards(0).number == controller.playStack.number) should be (true)
      controller.playerList(1).playerCards.size should be(2)
      controller.playerList(0).playerCards.size should be(3)
    }
    "PlayGame input 's' Player2" in {
      tui.processInputLine("s")
      controller.playerList(1).playerCards.size should be(4)
      controller.playerList(0).playerCards.size should be(2)
    }
    "PlayGame input 'u' Player1" in {
      tui.processInputLine("u 0")
      controller.playerList(1).playerCards.size should be(1)
      controller.playerList(0).playerCards.size should be(4)
    }
    "PlayGame input 'u' Player2" in {
      tui.processInputLine("u 0")
      controller.playerList(1).playerCards.size should be(5)
      controller.playerList(0).playerCards.size should be(1)
    }
    "PlayGame input 'u' Player1 wins" in {
      tui.processInputLine("u 0") should be
      (println("UNO - UNO!" + "\nPlayer KONSTANTIN wins!"))
    }
    /*"PlayGame input 'q' Player1" in {
      tui.processInputLine("q") should be (println("Game exit"))
    }*/
  }
  "A 2nd TUI" should {
    val controller = new controller()
    val tui = new TUI(controller)
    controller.notifyObservers()

    "Input 's' Player1" in {
      tui.processInputLine("s")
      controller.playerList(1).playerCards.size should be(4)
      controller.playerList(0).playerCards.size should be(3)
    }
    "Input 's' Player2" in {
      tui.processInputLine("s")
      controller.playerList(1).playerCards.size should be(4)
      controller.playerList(0).playerCards.size should be(4)
    }
    "Input 'r 0' Player1 Wrong Card" in {
      tui.processInputLine("r 0")
      controller.playerList(1).playerCards.size should be(4)
      controller.playerList(0).playerCards.size should be(4)
    }
    "Input 'q' Player2" in {
      tui.processInputLine("q") should be (println("Game exit"))
    }

  }
}
