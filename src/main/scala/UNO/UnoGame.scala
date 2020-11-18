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

    val card = new Card(1,"red")
    val tui = new TUI
    val pL = List(tui.createGame(),tui.createGame())
    tui.playGame(pL,card,0)
  }

  def playerName(playerNames: Array[String], anzahl: Int): String = {

    if (playerNames.length > 0)
      playerNames.head
    else
      readLine("\nPlayer " + anzahl + "!\nBitte gib deinen Namen ein: ")
  }

  def startHand(): List[Card] = {

    return Card(1, "green") :: Card(2, "red") :: Card(3, "blue") :: Card(4, "blue") :: Card(5, "yellow") :: Nil
  }
}

