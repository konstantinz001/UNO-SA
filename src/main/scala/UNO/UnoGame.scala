package UNO

import scala.io.StdIn.readLine
import aview.TUI
import UNO.controller.controller
import UNO.util.{State, gameStartEvent, gameStatsEvent, instructionEvent}
import UNO.model.{Card, Stack}

object UnoGame {
  val controller = new controller()
  val tui = new TUI(controller)

  def main(args: Array[String]): Unit = {
    print(State.handle(instructionEvent()))
    controller.notifyObservers()

    if (args.length == 0) {
      var input1: String = ""
      do {
        print(State.handle(gameStatsEvent()))
        input1 = readLine("\nInstruction: ")
        print(tui.processInputLine(input1))
      } while (input1 != "q")
    }
    else
      tui.processInputLine(args(0))
  }
}

