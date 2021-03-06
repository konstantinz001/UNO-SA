package aview

import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.should.Matchers
import UNO.aview.TUI
import UNO.controller.controllerComponent.controllerBaseImp.controller
import UnoPlayer.playerBaseImp.Player
import UnoCards.cardBaseImp.Card
import UNO.util.{*}
import UnoStack.stackBaseImp.Stack


class TuiSpec extends AnyWordSpec with Matchers {
  "A TUI (1st)" should {
    "have a methode processInputLine (1st)" in {
      var controller_test = new controller()
      var tui_Test = new TUI(controller_test)
      /*
      print(tui_Test.processInputLine("u 0")) should contain ("")

      tui_Test.processInputLine("undo") should be ("UNDO")

      tui_Test.processInputLine("redo") should be ("REDO")

      tui_Test.processInputLine("load") should be ("LOADED")

      tui_Test.processInputLine("save") should be ("SAVED")

      tui_Test.processInputLine("whatever") should be ("Wrong command!")

      for(i <- (1 to 10)) {
        if(controller_test.playerList(0).playerCards(0).color == "black") {
          tui_Test.processInputLine("s")
        }
        tui_Test.processInputLine("r 0") should
          (be(State.handle(removePlayerCardEvent(0), 0))
            or
            be(State.handle(removeFalseCardEvent()))
            or
            be(State.handle(forgotCallUnoEvent())))
        tui_Test.processInputLine("s")
      }
      tui_Test.processInputLine("q") should be(State.handle(exitGameEvent()))
      */
    }
  }
}