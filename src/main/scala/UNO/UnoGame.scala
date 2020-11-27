package UNO

import UNO.controller.controller

import scala.io.StdIn.readLine
import UNO.model.Player
import UNO.model.Card
import aview.TUI
import UNO.controller.controller

import scala.collection.mutable.ListBuffer

object UnoGame {
  val controller = new controller()
  val tui = new TUI(controller)

  def main(args: Array[String]): Unit = {
    printf("_"*50 + "\n")
    println("UNO! ")
    printf("_"*50 + "\n")

    println("Possible instructions:")
    printf("\tq = Quit\n")
    printf("\ts = Take a new Card from Stack\n")
    printf("\tr = Put a Card from Hand into GameBoard\n")
    printf("\tu = Call UNO/ UNO-UNO\n")
    printf("_"*50 + "\n")

    controller.notifyObservers()


    if (args.length == 0) {
      var input1: String = ""
      do {
        input1 = readLine("\nInstruction: ")
        tui.processInputLine(input1)
      } while (input1 != "q")
    }
    else
      tui.processInputLine(args(0))
  }
}