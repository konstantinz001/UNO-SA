package UNO.aview

import UNO.model.{Card, Player}
import UNO.model.Player
import org.graalvm.compiler.graph.Node.Input

import scala.io.StdIn.readLine
import scala.util.control.Breaks.{break, breakable}

import UNO.controller.controller
import UNO.util.Observer


class TUI (controller: controller) extends Observer {

  controller.add(this)

  //val input = readLine("Create new Player?: ")

  def processInputLine(input: String): Unit = {

    val name1 = "Konstantin"
    val name2 = "Soni"

    val stackcard = List(Card(1, "red"), Card(2, "green"), Card(3, "green"))
    val playStack = Card(5, "green")


    val is: Array[String] = input.split(" ")

    val pL = controller.playerToList(controller.createPlayer(name1), controller.createPlayer(name2))

    is(0) match {

      case "s" => {
        controller.getCard(pL, stackcard)
      }
      case "r" => {
        controller.removeCard(pL, playStack, is(1).toInt)
      }
      case "u" => {
        controller.callUno(pL, stackcard, playStack, is(1).toInt)
      }
      case "q" => {
        controller.exitGame()
      }
      case "t" => {
        controller.printGameStats(pL,stackcard,playStack)
      }


      case "q" => {
        controller.exitGame()
      }
      case "n" => {
        controller.exitGame()
      }
    }
  }
  override def update: Unit = controller.playerToString
}