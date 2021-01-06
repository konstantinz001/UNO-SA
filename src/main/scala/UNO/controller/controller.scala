package UNO.controller

import UNO.model.{Card, Player, Stack}
import UNO.util.{Observable, UndoManager}
import UNO.controller.GameStatus._

import scala.swing.Publisher


class controller extends Publisher {

  //TODO more Player and take to GameState
  var gameStatus: GameStatus = IDLE
  var playername1 = "Konstantin"
  var playername2 = "Soni"
  private val undoManager = new UndoManager

  var stackCard = Stack(List(new Card("",""))).initStack().shuffleCards().shuffleCards()
  var playerList = createPlayer()
  var playStack2 = initStack()
  var colorSet = ""
  var unoCall = false

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

//TODO Problems with Card <-->!!!!!!!!!!!!!!!!!
  //////////////////////////////////////////////////////////////////////////////////////////////////////////////
  def getCard(): Unit = {
    undoManager.doStep(new SetCommand(this))
    publish(new updateStates)
  }
  def removeCard(handindex: Int) {
    undoManager.doStep(new RemoveCommand(handindex:Int, this))
    changeStack(handindex)
    unoCall = false
    publish(new updateStates)
  }
  def undoGet: Unit = {
    undoManager.undoStep
    publish(new updateStates)
  }

  def redoGet: Unit = {
    undoManager.redoStep
    publish(new updateStates)
  }
  def changeStack(handindex:Int): List[Card] = {
    if (playerList(0).playerCards(handindex) == "black" ) {
      Card("", colorSet) :: playStack2
    }else
      playStack2


  }


}