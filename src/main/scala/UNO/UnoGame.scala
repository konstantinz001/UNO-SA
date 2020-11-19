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

    val stackcard = List(Card(1, "green"), Card(2,"green"),Card(3,"green"))
    val playStack = Card(5, "green")
    val tui = new TUI
    val pL = List(tui.createGame("y"), tui.createGame("y"))
    tui.playGame("r 0", pL,stackcard,playStack,0)
    //tui.playGame("r 0", pL, card, 0)

    //def playGame(pL:List[Player], stackCard: List[Card], playStack:Card, idx:Int): Unit = {
  }
}