package UNO.controller

import UNO.UnoGame.controller
import UNO.model.{Card, Player}
import UNO.util.{Observable, UndoManager}
import UNO.controller.GameStatus._
import scala.collection.mutable._




class controller extends Observable {

  var gameStatus: GameStatus = IDLE
  var playername1 = "Konstantin"
  var playername2 = "Soni"
  var stackCard = List(Card(1, "red"), Card(2, "green"), Card(3, "green"))
  var playStack = Card(5, "green")
  var playerList = playerToList(createPlayer(playername1), createPlayer(playername2))
  var playStack2:List[Card] = List(playStack)

  private val undoManager = new UndoManager


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
    undoManager.doStep(new SetCommand(this))
    notifyObservers()
  }
  def removeCard(handindex: Int) {
    undoManager.doStep(new RemoveCommand(handindex:Int, this))
    notifyObservers()
  }
  def undoGet: Unit = {
    undoManager.undoStep
    notifyObservers()
  }

  def redoGet: Unit = {
    undoManager.redoStep
    notifyObservers()
  }


}