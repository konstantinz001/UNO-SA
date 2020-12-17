package UNO.aview

import UNO.UnoGame.controller
import UNO.aview.TUI
import UNO.controller.controller
import UNO.model.{Card, Player}
import UNO.util.State.handle
import UNO.util.{State, _}
import org.scalatest._

class TuiSpec extends WordSpec with Matchers {
  "First TUI" should {
    val controller = new controller()
    val tui = new TUI(controller)
    //controller.notifyObservers()
    "PlayGame input 'r 0' first" in {
      tui.processInputLine("r 0") should be (State.handle(removePlayerCardEvent(0),0))
    }
    "PlayGame input 'u 0' first" in {
      tui.processInputLine("u 0") should be (State.handle(toManyCardsEvent()))
    }
    "PlayGame input 's' first" in {
      tui.processInputLine("s") should be (State.handle(setPlayerCardEvent()))
    }
    "PlayGame input 's-' first" in {
      tui.processInputLine("s-") should be ("S-undo")
    }
    "PlayGame input 's--' first" in {
      tui.processInputLine("s--") should be ("S-redo")
    }
    "PlayGame input 'r-' first" in {
      tui.processInputLine("r-") should be ("R-undo")
    }
    "PlayGame input 'r--' first" in {
      tui.processInputLine("r--") should be ("R-redo")
    }
    "PlayGame input 'q' first" in {
      tui.processInputLine("q") should be (State.handle(exitGameEvent()))
    }
  }
  "Second TUI" should {
    val controller = new controller()
    val tui = new TUI(controller)
    //controller.notifyObservers()
    for (i <- 1 to 7)
      controller.playerList = List(controller.playerList(0).removePlayerCards(0), controller.playerList(1).removePlayerCards(0))
    for(i <- 1 to 2)
      controller.playerList = List(controller.playerList(0).setPlayerCards(Card("1","green")),controller.playerList(1).setPlayerCards(Card("1","green")))
    "PlayGame input 'u 0' Second" in {

      tui.processInputLine("u 0") should be(State.handle(callFirstUnoEvent(0),0))
    }
    "PlayGame input 'u 0' Second2" in {
      tui.processInputLine("r 0") //should be (State.handle(forgotCallUnoEvent()))
      tui.processInputLine("u 0") should be(State.handle(callSecondUnoEvent()))
    }
  }
  "Third TUI" should {
    val controller = new controller()
    val tui = new TUI(controller)
    //controller.notifyObservers()
    for (i <- 1 to 7)
      controller.playerList = List(controller.playerList(0).removePlayerCards(0), controller.playerList(1).removePlayerCards(0))
    for(i <- 1 to 2)
      controller.playerList = List(controller.playerList(0).setPlayerCards(Card("1","green")),controller.playerList(1).setPlayerCards(Card("1","red")))
    "PlayGame input 'r 0' Third" in {
      tui.processInputLine("r 0") should be (State.handle(forgotCallUnoEvent()))
    }
  }
}