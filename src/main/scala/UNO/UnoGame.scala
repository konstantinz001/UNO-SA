package UNO

import scala.io.StdIn.readLine
import aview.TUI
import UNO.controller.controller
import UNO.util.{State, gameStartEvent, instructionEvent,gameStatsEvent}

object UnoGame {
  val controller = new controller()
  val tui = new TUI(controller)

  def main(args: Array[String]): Unit = {
    State.handle(instructionEvent())

    controller.notifyObservers()


    if (args.length == 0) {
      var input1: String = ""
      do {
        State.handle(gameStatsEvent())
        input1 = readLine("\nInstruction: ")
        tui.processInputLine(input1)
      } while (input1 != "q")
    }
    else
      tui.processInputLine(args(0))
  }
}