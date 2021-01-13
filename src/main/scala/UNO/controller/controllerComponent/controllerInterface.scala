package UNO.controller.controllerComponent

import UNO.controller.GameStatus.GameStatus
import UNO.model.PlayerComponent.playerBaseImp.Player
import UNO.model.cardComponent.cardBaseImp.Card
import UNO.model.stackComponent.stackBaseImp.Stack

import scala.swing.Publisher


trait controllerInterface extends Publisher{
  var gameStatus: GameStatus
  var playername1: String
  var playername2: String
  var stackCard: Stack
  var playerList: List[Player]
  var playStack2: List[Card]
  var colorSet: String
  var unoCall: Boolean
  def initPlayStack() : List[Card]
  def createPlayer(): List[Player]
  def startHand(): List[Card]
  def getCard(): Unit
  def removeCard(handindex: Int)
  def undoGet: Unit
  def redoGet: Unit
  def stackEmpty(): Stack
  def save: Unit
  def load: Unit



  import scala.swing.event.Event

  class updateState extends Event
}
