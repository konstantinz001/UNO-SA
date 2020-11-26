package UNO.controller

import UNO.model.{Card, Player}
import UNO.util.Observable

import scala.io.StdIn.readLine


class controller extends Observable {

  val playername1 = "Konstantin"
  val playername2 = "Soni"

  val stack = List(Card(1, "red"), Card(2, "green"), Card(3, "green"))
  val playStack = Card(5, "green")
  val playerList = playerToList(createPlayer(playername1), createPlayer(playername2))

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

  def getCard(playerList: List[Player], stackCard: List[Card]): Unit = {
    println(playerList(0).setPlayerCards(stackCard(0)))
    val l = List(playerList(1), playerList(0).setPlayerCards(stackCard(0)))
    var stack = List[Card]()
    for (i <- 1 until stackCard.size) {
      stack = stackCard(i) :: stack
    }
    notifyObservers()
    //playGame(l, s, playStack, 0)
  }

  def removeCard(playerList: List[Player], playStack: Card, handindex: Int) {
    val currentcard = playerList(0).playerCards(handindex.toInt)
    if ((currentcard.color == playStack.color) || currentcard.number == playStack.number) {
      println(playerList(0).removePlayerCards(handindex.toInt))
      val newPlayStack = currentcard
      val l = List(playerList(1), playerList(0).removePlayerCards(handindex.toInt))
      //playGame(l, stackCard, c, 0)
    } else {
      println("Wrong Card!")
    }
  }

  def callUno(playerList: List[Player], stackCard: List[Card], playStack: Card, cardindex: Int) {
    removeCard(playerList, playStack, cardindex)
    if (playerList(0).playerCards.size == 2) {
      println("UNO")
      //playGame(l, stackCard, c, 0)
    }
    else if (playerList(0).playerCards.size == 1) {
      println("UNO - UNO!")
      println("Player " + playerList(0).name.toUpperCase() + " hat gewonnen!")
      System.exit(0)
    }
    else {
      println("To many Cards!!!")
      getCard(playerList, stackCard)
      //playGame(l, s, playStack, 0)
    }
  }

  def printGameStats(playerList: List[Player], stackCard: List[Card], playStack: Card) {
    println("PLAYER " + playerList(0).name.toUpperCase())
    print("\n\nPlayStack: " + playStack + "\n")
    print("StackCard: " + stackCard + "\n")
    //val input = readLine("Instruction: ")
    print("\n\n")
    print(playerList(0) + "\n" + playerList(1))
  }

  def testStart(): Unit = {
    notifyObservers()
  }

  def playerToString: String = Player.toString()
}

