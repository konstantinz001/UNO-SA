package UNO

import UNO.aview.gui.SwingGui
import UNO.controller.controllerComponent.{GameStatus, RootService, controllerInterface}

import scala.io.StdIn.readLine
import aview.TUI
import com.google.inject.Guice

object UnoGame:
  val Controller = Guice.createInjector(new UnoGameModule).getInstance(classOf[controllerInterface])
  val tui = TUI(Controller)
  val UIType: Boolean = if System.getenv("UI_TYPE").equals("gui") then true else false
  val rootService = RootService

  @main def main(): Unit =
    val start = rootService.server()

    GameStatus.handleStatus(Controller.gameStatus, Controller)

    if (UIType == true) then
      val gui = SwingGui(Controller)

    var input1: String = ""
    while input1 != "q"
    do
      input1 = readLine("\nInstruction: ")
      tui.processInputLine(input1)

    rootService.stop(start)