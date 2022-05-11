package UNO.controller.controllerComponent

import UNO.controller.controllerComponent.GameStatus.GameStatus
import UnoPlayer.playerBaseImp.Player
import UnoCards.cardBaseImp.Card
import UnoGameState.GameState
import UnoStack.stackBaseImp.Stack
import jdk.nashorn.api.scripting.JSObject
import play.api.libs.json.JsObject

import scala.swing.Publisher


trait controllerInterface extends Publisher:
  var gameStatus: GameStatus
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
  def checkValidRemoveMove(handindex: Int): Boolean
  def tryColorSwitch(color : String): Option[String]
  def removeBlackCard(handindex: Int, color: String): Unit
  def getCard(): Unit
  def removeCard(handindex: Int): Unit
  def removeUnoCard(handindex: Int): Unit
  def undoGet: Unit
  def redoGet: Unit
  def stackEmpty(): Stack
  def save: Unit
  def load: Unit
  def wrongCommand: Unit
  def setDefault(): Unit
  def gameToJson(): String
  def loadFromDB(): Unit
  def saveInDb(): Unit
  def loadDBJSON(gameString: String): GameState
  def gameStateToJson(playerList: List[Player], playstack: List[Card]) : JsObject

  def unpackJson(result: String): Unit


  import scala.swing.event.Event

  class updateState extends Event
