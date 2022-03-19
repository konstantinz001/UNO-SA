package UNO


import UNO.aview.gui.SwingGui
import UNO.controller.controllerComponent.controllerInterface

import scala.io.StdIn.readLine
import aview.TUI
import UNO.util.{State, gameStatsEvent, instructionEvent}
import com.google.inject.Guice

object UnoGame:

  val injector = Guice.createInjector(new UnoGameModule)
  val Controller = injector.getInstance(classOf[controllerInterface])
  val tui = new TUI(Controller)

  var UIType: Boolean = if (System.getenv("UI_TYPE").equals("gui")) true else false

  @main def main(): Unit =

    print(State.handle(instructionEvent()))
    print(State.handle(gameStatsEvent()))

    if (UIType == true) then
      val gui = new SwingGui(Controller)

    var input1: String = ""
    while (input1 != "q")
    do
      input1 = readLine("\nInstruction: ")
      print(tui.processInputLine(input1))
      if (input1 == "q")
        System.exit(0)

