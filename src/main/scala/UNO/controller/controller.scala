package UNO.controller

import UNO.model.{Card, Player}
import UNO.util.Observable
import UNO.controller.GameStatus._

import scala.io.StdIn.readLine


class controller extends Observable {

  var gameStatus: GameStatus = IDLE
  var playername1 = "Konstantin"
  var playername2 = "Soni"
  var stackCard = List(Card(1, "red"), Card(2, "green"), Card(3, "green"))
  var playStack = Card(5, "green")
  var playerList = playerToList(createPlayer(playername1), createPlayer(playername2))


  def createPlayer(printerName: String): Player = {
    //val printerName = readLine("Please enter your name:")

    val player = Player(printerName, Player.startHand())
    return player
  }

  def playerToList(player1: Player, player2: Player): List[Player] = {
    return List(createPlayer(player1.name), createPlayer(player2.name))
  }

  //////////////////////////////////////////////////////////////////////////////////////////////////////////////



  def getCard(): Unit = {
    playerList = List(playerList(1), playerList(0).setPlayerCards(stackCard(0)))
    stackCard = stackCard diff List(stackCard(0))
    notifyObservers()
  }

  def removeCard(handindex: Int) {
    val currentcard = playerList(0).playerCards(handindex)
    if ((currentcard.color == playStack.color) || currentcard.number == playStack.number) {
      playStack = playerList(0).playerCards(handindex)
      playerList = List(playerList(1), playerList(0).removePlayerCards(handindex))
    }
    notifyObservers()
  }

}

