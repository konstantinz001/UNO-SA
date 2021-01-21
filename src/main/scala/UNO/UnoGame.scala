package UNO


import UNO.aview.gui.SwingGui
import UNO.controller.controllerComponent.controllerInterface

import scala.io.StdIn.readLine
import aview.TUI
import UNO.util.{State, gameStatsEvent, instructionEvent}
import com.google.inject.Guice

object UnoGame {

  val injector = Guice.createInjector(new UnoGameModule)
  val controller = injector.getInstance(classOf[controllerInterface])
  val tui = new TUI(controller)


  var UIType: Boolean = if (System.getenv("UI_TYPE").equals("gui")) true else false

  def main(args: Array[String]): Unit = {

    print(State.handle(instructionEvent()))
    print(State.handle(gameStatsEvent()))

    if (UIType == true) {
      val gui = new SwingGui(controller)
    }

    if (args.length == 0) {
      var input1: String = ""
      do {
        input1 = readLine("\nInstruction: ")
        print(tui.processInputLine(input1))
        if (input1 == "q")
          System.exit(0)
      } while (input1 != "q")
    }
    else
      tui.processInputLine(args(0))
  }
}

