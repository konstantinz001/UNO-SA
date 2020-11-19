package UNO

import scala.io.StdIn.readLine
import UNO.model.Player
import UNO.model.Card
import aview.TUI

import scala.collection.mutable.ListBuffer

object UnoGame {
  def main(args: Array[String]): Unit = {
    println("_________________")
    println("UNO! ")
    println("_________________\n\n")

    val card = new Card(1, "red")
    val tui = new TUI
    val pL = List(tui.createGame("y"), tui.createGame("y"))
    tui.playGame("s",pL,card,0)
    tui.playGame("r 0", pL, card, 0)
  }
}