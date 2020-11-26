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

    val playername1 = "Konstantin"
    val playername2 = "Soni"

    val stack = List(Card(1, "red"), Card(2, "green"), Card(3, "green"))
    val playStack = Card(5, "green")


    val is: Array[String] = input.split(" ")

    val playerList = controller.playerToList(controller.createPlayer(playername1), controller.createPlayer(playername2))

    is(0) match {

      case "s" => {
        controller.getCard(playerList, stack)
      }
      case "r" => {
        controller.removeCard(playerList, playStack, is(1).toInt)
      }
      case "u" => {
        controller.callUno(playerList, stack, playStack, is(1).toInt)
      }
      case "q" => {
        controller.exitGame()
      }
      case "t" => {
        controller.printGameStats(playerList,stack,playStack)
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