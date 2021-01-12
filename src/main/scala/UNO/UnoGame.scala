package UNO

import UNO.aview.gui.SwingGui
import UNO.controller.controllerComponent.controllerInterface
import UNO.controller.controllerComponent.controllerBaseImp.{controller, updateStates}

import scala.io.StdIn.readLine
import aview.TUI
import UNO.util.{State, instructionEvent}
import com.google.inject.Guice

object UnoGame {
  val injector = Guice.createInjector(new UnoGameModule)
  val controller = injector.getInstance(classOf[controllerInterface])
  val tui = new TUI(controller)

  def main(args: Array[String]): Unit = {

    if (args.length == 0) {
      var input1: String = ""
      do {
        input1 = readLine("\nInstruction: ")
        print(tui.processInputLine(input1))
      } while (input1 != "q")
    }
    else
      tui.processInputLine(args(0))
  }
}

