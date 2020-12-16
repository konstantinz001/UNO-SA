package UNO.controller

import UNO.model.{Card, Player, Stack}
import UNO.util.{Observable, UndoManager}
import UNO.controller.GameStatus._

import scala.swing.Publisher




class controller extends Publisher { // extends Observable

  //TODO more Player and take to GameState
  var gameStatus: GameStatus = IDLE
  var playername1 = "Konstantin"
  var playername2 = "Soni"
  private val undoManager = new UndoManager

  var stackCard = Stack(List(new Card("",""))).initStack()
  var playerList = createPlayer()
  var playStack2 = initStack()

  //Methods to init PlayerList and Stacks
  def initStack() : List[Card] = {

    while (stackCard.getCardFromStack().color == "black") {
      stackCard = stackCard.pullCards(List(stackCard.getCardFromStack()))
      stackCard = stackCard.removeCard()
    }
    return List(stackCard.getCardFromStack())
  }

  def createPlayer(): List[Player] = {
    return List(Player(playername1,startHand()),Player(playername2,startHand()))
  }

  def startHand(): List[Card] = {
    var starthand = List(Card("",""))
    (1 to 7).foreach((i)=>{
      starthand = stackCard.getCardFromStack() :: starthand
      stackCard = stackCard.removeCard()
    })
    return starthand.init.reverse
  }

  //////////////////////////////////////////////////////////////////////////////////////////////////////////////
  def getCard(): Unit = {
    undoManager.doStep(new SetCommand(this))
    publish(new stackChanged)
    //notifyObservers()
  }
  def removeCard(handindex: Int) {
    undoManager.doStep(new RemoveCommand(handindex:Int, this))
    publish(new playerhandChanged)
    //notifyObservers()
  }
  def undoGet: Unit = {
    undoManager.undoStep
    publish(new playerhandChanged)
    //notifyObservers()
  }

  def redoGet: Unit = {
    undoManager.redoStep
    publish(new playerhandChanged)
    //notifyObservers()
  }


}