package UNO.controller.controllerComponent

import UnoPlayer.playerBaseImp.Player
import UnoCards.cardBaseImp.Card
import UnoStack.stackBaseImp.Stack

import scala.swing.Publisher


trait controllerInterface extends Publisher:
  var playername1: String
  var playername2 : String
  var stackCard: Stack
  var playerList: List[Player]
  var playStack2: List[Card]
  var colorSet: String
  var unoCall: Boolean
  def initStackCard() : Stack
  def initPlayStack() : List[Card]
  def initPlayerList(): List[Player]
  def getCard(): Unit
  def removeCard(handindex: Int): Unit
  def undoGet: Unit
  def redoGet: Unit
  def stackEmpty(): Stack
  def save: Unit
  def load: Unit
  def setDefault(): Unit



  import scala.swing.event.Event

  class updateState extends Event
