package UNO.controller.controllerComponent.controllerBaseImp

import UNO.UnoGameModule
import UNO.aview.gui.SwingGui
import UNO.controller.controllerComponent.*
import UNO.controller.controllerComponent.GameStatus.*
import UnoGameState.GameState
import UnoPlayer.playerBaseImp.Player
import UnoCards.cardBaseImp.Card
import UnoStack.stackBaseImp.Stack
import UNO.util.UndoManager
import UnoFileIO.FileIOTrait
import UnoFileIO.fileIOJsonImp.FileIO
import com.google.inject.{Guice, Inject}
import net.codingwell.scalaguice.InjectorExtensions.ScalaInjector
import play.api.libs.json.{JsArray, JsString, JsValue, Json}

import scala.io.Source
import scala.swing.Publisher
import scala.util.{Failure, Success, Try}
import akka.actor.typed.ActorSystem
import akka.actor.typed.javadsl.Behaviors
import akka.http.scaladsl.Http
import akka.http.scaladsl.model.{HttpMethods, HttpRequest, HttpResponse}
import akka.http.scaladsl.unmarshalling.Unmarshal

import scala.concurrent.Future
import scala.concurrent.ExecutionContext
import scala.concurrent.ExecutionContextExecutor


class controller @Inject() extends controllerInterface with Publisher:

  implicit val system: ActorSystem[Nothing] = ActorSystem(Behaviors.empty, "SingleRequest")
  implicit val executionContext: ExecutionContextExecutor = system.executionContext

  var playername1 = "1"
  var playername2 = "2"
  var stackCard = initStackCard()
  var playerList = initPlayerList()
  var playStack2 = initPlayStack()
  var colorSet = ""
  var unoCall = false
  val five = 5
  val rangeIncl = Range.inclusive(1,100)
  var gameStatus: GameStatus = INIT

  private val undoManager =new UndoManager
  var gameState: GameState = GameState(returnplayerList(), playStack2)
  def Controller = Guice.createInjector(new UnoGameModule).getInstance(classOf[controllerInterface])
  val injector = Guice.createInjector(new UnoGameModule)
  val fileIo: FileIO = injector.getInstance(classOf[FileIO])

  def setDefault(): Unit =
    stackCard = initStackCard()
    playerList = initPlayerList()
    playStack2 = initPlayStack()
    gameStatus = NEW
    publish(new newgameStates)
  
  def returnplayerList():List[Player] =
    playerList

  def initStackCard() : Stack =
    var stackCards =Stack(List(Card("",""))).initStack()
    val rangeIncl = Range.inclusive(1,100)
    for(i <- rangeIncl)
      stackCards = stackCards.shuffleCards()
    stackCards

  def initPlayStack() : List[Card] =
    while stackCard.getCardFromStack().color == "black"
    do
      stackCard = stackCard.pullCards(List(stackCard.getCardFromStack()))
      stackCard = stackCard.removeCard()
    List(stackCard.getCardFromStack())

  def stackEmpty(): Stack =
    if stackCard.stackCards.length <= five then
      stackCard = stackCard.reversePullCards(playStack2).shuffleCards()
      val rangeIncl = Range.inclusive(1,100)
      for (i <- rangeIncl)
        stackCard = stackCard.shuffleCards()
    stackCard

  def initPlayerList():List[Player] =
    var starthand = List(Card("",""))
    def startHand(): List[Card] =
      var starthand = List(Card("",""))
      for(i <- (1 to 7))
        starthand = stackCard.getCardFromStack() :: starthand
        stackCard = stackCard.removeCard()
      starthand.init.reverse
    List(Player("1",startHand()),Player("2",startHand()))

  def checkValidRemoveMove(handindex: Int): Boolean =
    if playerList(0).playerCards(handindex).color == playStack2(0).color ||
      playerList(0).playerCards(handindex).value == playStack2(0).value ||
      (playerList(0).playerCards(handindex).color == "black" && colorSet != "") then
      true
    else
      false

  def tryColorSwitch(color : String): Option[String] =
    Try((List("blue", "red", "yellow", "green").filter(x => x.equals(color))(0))) match
      case Success(color: String) => Some(color)
      case Failure(_) => None


  def wrongCommand: Unit =
    gameStatus = WRONG
    publish(new updateStates)

  def getCard(): Unit =
    stackCard = stackEmpty()
    undoManager.doStep(SetCommand(this))
    gameStatus = GET
    publish(new updateStates)

  def removeUnoCard(handindex: Int): Unit =
    stackCard = stackEmpty()
    unoCall = true
    if playerList(0).playerCards.size.equals(2) then
      undoManager.doStep(new RemoveCommand(handindex:Int, this))
      gameStatus = UNOCALL_1
      unoCall = false
      publish(new updateStates)
    else if playerList(0).playerCards.size.equals(1) then
      gameStatus = UNOCALL_2
      unoCall = false
      publish(new endStates)
    else
      undoManager.doStep(new RemoveCommand(handindex:Int, this))
      playerList = playerList.reverse
      undoManager.doStep(new RemoveCommand(handindex:Int, this))
      gameStatus = PENALTY
      publish(new updateStates)

  def removeBlackCard(handindex: Int, color: String): Unit =
    if handindex >= playerList(0).playerCards.size then
      gameStatus = WRONG
      publish(new updateStates)
    else
      if playerList(0).playerCards(handindex).color.equals("black") then
        tryColorSwitch(color) match
          case Some(color: String) =>
            colorSet = color
            removeCard(handindex)
          case None =>
            colorSet = ""
            gameStatus = WRONGCOLOR
            publish(new updateStates)


  def removeCard(handindex: Int): Unit =
    if handindex >= playerList(0).playerCards.size then
      gameStatus = WRONG
      publish(new updateStates)
    else
      if playerList(0).playerCards(handindex).color.equals("black") && colorSet == "" then
        gameStatus = WRONGCOLOR
        publish(new updateStates)
      if checkValidRemoveMove(handindex) && playerList(0).playerCards.size >= 3 then
        stackCard = stackEmpty()
        undoManager.doStep(new RemoveCommand(handindex:Int, this))
        unoCall = false
        gameStatus = SET
        publish(new updateStates)
      else if !checkValidRemoveMove(handindex) && playerList(0).playerCards.size >= 3 then
        gameStatus = WRONG
        publish(new updateStates)
      else
        stackCard = stackEmpty()
        undoManager.doStep(new RemoveCommand(handindex:Int, this))
        undoManager.doStep(SetCommand(this))
        playerList = playerList.reverse
        undoManager.doStep(SetCommand(this))
        unoCall = false
        gameStatus = PENALTY
        publish(new updateStates)



  def undoGet:Unit = undoredget(true)
  def redoGet:Unit = undoredget(false)
  def undoredget(value:Boolean):Unit=
    if(value == true)
      undoManager.undoStep()
      gameStatus = UNDO
      publish(new undoStates)
    else
      undoManager.redoStep()
      gameStatus = REDO
      publish(new redoStates)

  override def save: Unit =
    val gamestate: String = Json.prettyPrint(gameStateToJson(playerList, playStack2))
    val responseFuture: Future[HttpResponse] = Http().singleRequest(HttpRequest(method = HttpMethods.POST, uri = "http://localhost:8080/save", entity = gamestate))
    gameStatus = SAVED
    publish(new saveStates)

  override def load: Unit = {
    val responseFuture: Future[HttpResponse] = Http().singleRequest(HttpRequest(uri = "http://localhost:8080/load"))
    responseFuture.onComplete {
      case Failure(_) =>
        sys.error("HttpResponse failure")
        gameStatus = COULD_NOT_LOAD
      case Success(res) => {
        Unmarshal(res.entity).to[String].onComplete {
          case Failure(_) => gameStatus = COULD_NOT_LOAD
            sys.error("Marshal failure")
            gameStatus = COULD_NOT_LOAD

          case Success(result) => {
            unpackJson(result)
            gameStatus = LOADED
            publish(new loadStates)
          }
        }
      }
    }
  }



  def setPlayerList (json: JsValue) : List[Player] =
    val playerName = (json \ "gameState" \ "playerListName").as[List[String]]
    val playerValue1 = (json \ "gameState" \ "playerCardsValue1").as[List[String]]
    val playerValue2 = (json \ "gameState" \ "playerCardsValue2").as[List[String]]
    val playerColor1 = (json \ "gameState" \ "playerCardsColor1").as[List[String]]
    val playerColor2 = (json \ "gameState" \ "playerCardsColor2").as[List[String]]
    var cards1 = List(Card(playerValue1(0), playerColor1(0)))
    for i <- (1 to playerValue1.size - 1)
      do cards1 = Card(playerValue1(i), playerColor1(i)) :: cards1
    var cards2 = List(Card(playerValue2(0), playerColor2(0)))
    for(i <- (1 to playerValue2.size - 1))
      cards2 = Card(playerValue2(i), playerColor2(i)) :: cards2
    List(Player(playerName(0), cards1.reverse), Player(playerName(1), cards2.reverse))

  def gameStateToJson(playerList: List[Player], playstack: List[Card]) =
    Json.obj(
      "gameState" -> Json.obj(
        "playerListName" -> playerList.map(x => x.name),
        "playerCardsValue1" -> playerList(0).playerCards.map(x => x.value),
        "playerCardsColor1" -> playerList(0).playerCards.map(x => x.color),
        "playerCardsValue2" -> playerList(1).playerCards.map(x => x.value),
        "playerCardsColor2" -> playerList(1).playerCards.map(x => x.color),
        "playStackValue" -> playstack(0).value,
        "playStackColor" -> playstack(0).color
      )
    )

  def gameToJson(): String = {
    Json.prettyPrint(
      Json.obj(
        "game" -> Json.obj(
          "playStackCard" -> JsString(playStack2(0).color + "||" +playStack2(0).value),
          "playerListNameCurrent" -> JsString(playerList(0).name),
          "playerListNameNext" -> JsString(playerList(1).name),
          "playerListCardsCurrent" -> JsArray(
            for{
              card <-0 until playerList(0).playerCards.length
            }yield {
              JsString(playerList(0).playerCards(card).color + "||" + playerList(0).playerCards(card).value)
            }
          ),
          "playerListCardsNext" -> JsArray(
            for{
              card <-0 until playerList(1).playerCards.length
            }yield {
              JsString(playerList(1).playerCards(card).color + "||" + playerList(1).playerCards(card).value )
            }
          ),
        )
      )
    )
  }

  def unpackJson(result: String): Unit = {
    val file: String = Source.fromFile("gamestate.json").getLines.mkString
    val json: JsValue = Json.parse(file)
    playerList = setPlayerList(json)
    playStack2 = List(Card((json \ "gameState" \ "playStackValue").as[String],
      (json \ "gameState" \ "playStackColor").as[String]))
  }