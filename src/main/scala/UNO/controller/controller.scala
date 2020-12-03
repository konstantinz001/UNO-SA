package UNO.controller

import UNO.model.{Card, Player}
import UNO.util.{Observable, ChooseStrategy,strategyEvent1, strategyEvent2}
import UNO.controller.GameStatus._


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
    ChooseStrategy.choose(strategyEvent1())
    notifyObservers()
  }

  def removeCard(handindex: Int) {
    ChooseStrategy.choose(strategyEvent2(handindex), handindex)
    notifyObservers()
  }
}

