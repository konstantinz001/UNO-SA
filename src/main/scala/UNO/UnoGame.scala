package UNO

import UNO.UnoGame.controller
import UNO.aview.gui.SwingGui

import scala.io.StdIn.readLine
import aview.TUI
import UNO.controller.{controller, playfieldChanged}
import UNO.util.{State, gameStatsEvent, instructionEvent}

object UnoGame {
  val controller = new controller()
  val tui = new TUI(controller)
  val gui = new SwingGui(controller)
  controller.publish(new playfieldChanged)

  def main(args: Array[String]): Unit = {
    print(State.handle(instructionEvent()))
    //controller.notifyObservers()



    gui.open()

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

