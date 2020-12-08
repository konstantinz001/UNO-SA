package UNO.controller

import UNO.model.{Card, Player,Stack}
import UNO.util.{Observable, UndoManager}
import UNO.controller.GameStatus._




class controller extends Observable {

  var gameStatus: GameStatus = IDLE
  var playername1 = "Konstantin"
  var playername2 = "Soni"

  var stackCard = Stack(List(new Card("",""))).initStack()
  var playStack2:List[Card] = List(stackCard.getCardFromStack())
  stackCard =stackCard.removeCard()

  var playerList = createPlayer()

  private val undoManager = new UndoManager

  def createPlayer(): List[Player] = {
    return List(Player(playername1,startHand()),Player(playername2,startHand()))
  }


  def startHand(): List[Card] = {
    var starthand = List(Card("",""))
    for (i <- 1 to 7) {
      starthand = stackCard.getCardFromStack() :: starthand
      stackCard = stackCard.removeCard()
    }
    return starthand.init.reverse
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