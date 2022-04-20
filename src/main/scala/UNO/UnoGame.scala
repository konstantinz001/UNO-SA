package UNO

import UNO.aview.gui.SwingGui
import UNO.controller.controllerComponent.{GameStatus, RootService, controllerInterface}
import UnoFileIO.FileIOService
import UNO.controller.controllerComponent.RootService

import scala.io.StdIn.readLine
import aview.TUI
import com.google.inject.Guice

object UnoGame:
  val Controller = Guice.createInjector(new UnoGameModule).getInstance(classOf[controllerInterface])
  val tui = TUI(Controller)
  val UIType: Boolean = if System.getenv("UI_TYPE").equals("gui") then true else false
  val rootService = RootService(Controller)

  @main def main(): Unit =

    val rootServer = rootService.server()

    GameStatus.handleStatus(Controller.gameStatus, Controller)

    if (UIType == true) then
      val gui = SwingGui(Controller)

    var input1: String = ""
    while input1 != "q"
    do
      input1 = readLine("\nInstruction: ")
      tui.processInputLine(input1)

    rootService.stop(rootServer)