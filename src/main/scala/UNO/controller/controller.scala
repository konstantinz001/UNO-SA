package UNO.controller

import UNO.model.{Card, Player}
import UNO.util.Observable
import javax.print.attribute.standard.PrinterName

import scala.io.StdIn.readLine

class controller extends Observable {

  def createPlayer(printerName: String): Player = {
    //val printerName = readLine("Please enter your name:")

    val player = Player(printerName, Player.startHand())
    return player
  }

  def playerToList(player1: Player, player2: Player): List[Player] = {
    return List(createPlayer(player1.name), createPlayer(player2.name))
  }

  def exitGame(): Unit = {
    println("Game exit")
    System.exit(0)
  }

  //////////////////////////////////////////////////////////////////////////////////////////////////////////////
  //TODO
  //Rückgabe von Funkton mit Fallunterscheidung

  def getCard(pL: List[Player], stackCard: List[Card]): Unit = {
    println(pL(0).setPlayerCards(stackCard(0)))
    val l = List(pL(0 + 1), pL(0).setPlayerCards(stackCard(0)))
    var s = List[Card]()
    for (i <- 1 until stackCard.size) {
      s = stackCard(i) :: s
    }
    //playGame(l, s, playStack, 0)
  }

  def removeCard(pL: List[Player], playStack: Card, idx: Int) {
    val c = pL(0).playerCards(idx.toInt)
    if ((c.color == playStack.color) || c.number == playStack.number) {
      println(pL(0).removePlayerCards(idx.toInt))
      val newPlayStack = c
      val l = List(pL(0 + 1), pL(0).removePlayerCards(idx.toInt))
      //playGame(l, stackCard, c, 0)
    } else {
      println("Wrong Card!")
    }
  }

  def callUno(pL: List[Player], stackCard: List[Card], playStack: Card, idx: Int) {
    removeCard(pL, playStack, idx)
    if (pL(0).playerCards.size == 2) {
      println("UNO")
      //playGame(l, stackCard, c, 0)
    }
    else if (pL(0).playerCards.size == 1) {
      println("UNO - UNO!")
      println("Player " + pL(0).name.toUpperCase() + " hat gewonnen!")
      System.exit(0)
    }
    else {
      println("To many Cards!!!")
      getCard(pL, stackCard)
      //playGame(l, s, playStack, 0)
    }
  }

  def printGameStats(pL: List[Player], stackCard: List[Card], playStack: Card) {
    println("PLAYER " + pL(0).name.toUpperCase())
    print("\n\nPlayStack: " + playStack + "\n")
    print("StackCard: " + stackCard + "\n")
    //val input = readLine("Instruction: ")
    print("\n\n")
    print(pL(0) + "\n" + pL(1))
  }

  def playerToString: String = Player.toString()
}

