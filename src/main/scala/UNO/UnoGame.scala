package UNO

import UNO.aview.gui.SwingGui
import UNO.controller.controllerComponent.controllerInterface
import scala.io.StdIn.readLine
import aview.TUI
import UNO.util.{State, gameStatsEvent, instructionEvent}
import com.google.inject.Guice

object UnoGame:
  val Controller = Guice.createInjector(new UnoGameModule).getInstance(classOf[controllerInterface])
  val tui = TUI(Controller)
  val UIType: Boolean = if System.getenv("UI_TYPE").equals("gui") then true else false

  @main def main(): Unit =

    print(State.handle(instructionEvent()))
    print(State.handle(gameStatsEvent()))

    if (UIType == true) then
      val gui = SwingGui(Controller)

    var input1: String = ""
    while input1 != "q"
    do
      input1 = readLine("\nInstruction: ")
      print(tui.processInputLine(input1))
      if input1 == "q" then
        System.exit(0)