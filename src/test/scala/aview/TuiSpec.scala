package aview

import UNO.UnoGame.controller
import UNO.aview.TUI
import UNO.model.PlayerComponent.playerBaseImp.Player
import UNO.model.cardComponent.cardBaseImp.Card
import UNO.util.{State, _}
import org.scalatest._


class TuiSpec extends WordSpec with Matchers {
  val tui = new TUI(controller)
  "A TUI" should {
    "have a methode processInputLine" in {
      //Because Cards are Random and to Testing Methods we override the PlayList
      //and Playstack with new values
      controller.playerList = List(Player("1", List(Card("1", "green"), Card("2", "green"), Card("3", "green"), Card("4", "green"))),
        Player("2", List(Card("1", "green"), Card("2", "green"), Card("3", "green"), Card("3", "blue"))))
      controller.playStack2 = List(Card("0", "green"))

      //Testing remove a normal handcard
      tui.processInputLine("r 0") should be (State.handle(removePlayerCardEvent(0), 0))
      //Testing take a card from stack to handcards
      tui.processInputLine("s") should be (State.handle(setPlayerCardEvent()))
      //Testing remove a Handcard and call UNO to early
      tui.processInputLine("u 0") should be (State.handle(toManyCardsEvent()))


      //Init PlayerList and Playstack
      controller.playerList = List(Player("1", List(Card("ColorSwitch", "black"), Card("2", "blue"), Card("3", "green"), Card("4", "green"))),
        Player("2", List(Card("1", "yellow"), Card("2", "yellow"), Card("3", "yellow"), Card("3", "yellow"))))
      controller.playStack2 = List(Card("0", "green"))

      //Testing remove the black-colorchange Card and wish the color blue
      tui.processInputLine("r 0 blue") should be (State.handle(removePlayerCardEvent(0), 0))
      controller.colorSet should be ("blue")
      //Testing try to remove the false Handcard
      tui.processInputLine("r 0") should be (State.handle(removeFalseCardEvent()))


      //Init PlayerList and Playstack
      controller.playerList = List(Player("1", List(Card("1", "green"), Card("2", "green"))),
        Player("2", List(Card("1", "green"), Card("2", "green"))))
      controller.playStack2 = List(Card("0", "green"))

      //Testing have only 2 Handcards and Call UNO the first Time
      tui.processInputLine("u 0") should be (State.handle(callFirstUnoEvent(0),0))
      //Testing have only 2 Handcards and forgot to Call UNO
      tui.processInputLine("r 0") should be (State.handle(forgotCallUnoEvent()))
      //Testing have only 1 Handcard and Call UNO the Seccond Time
      tui.processInputLine("u 0") should be (State.handle(callSecondUnoEvent()))

      //Testing undo-command
      tui.processInputLine("undo") should be ("undo")
      //Testing redo-command
      tui.processInputLine("redo") should be ("redo")
      //Testing load-command
      tui.processInputLine("load") should be ("Loading Game!")
      //Testing save-command
      tui.processInputLine("save") should be ("Saved Game!")
      //Testing a wrong command
      tui.processInputLine("whatever") should be ("Wrong command!")
      //Testing quit-command
      tui.processInputLine("q") should be (State.handle(exitGameEvent()))
    }
    "have a methode print1" in {
      tui.print1 should be (println(State.handle(gameStatsEvent())))


    }
  }
}




      /*
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

       */