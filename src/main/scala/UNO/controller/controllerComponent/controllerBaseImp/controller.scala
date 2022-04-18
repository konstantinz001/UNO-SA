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
import play.api.libs.json.{JsValue, Json}

import scala.io.Source
import scala.swing.Publisher
import scala.util.{Failure, Success}


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

  val responseFuture: Future[HttpResponse] = Http().singleRequest(HttpRequest(uri = "http://localhost:8080/load"))


  var playername1 = "1"
  var playername2 = "2"
  var stackCard = initStackCard()
  var playerList = initPlayerList()
  var playStack2 = initPlayStack()
  var colorSet = ""
  var unoCall = false
  val five = 5
  val rangeIncl = Range.inclusive(1,100)
  var gameStatus: GameStatus = IDLE

  private val undoManager =new UndoManager
  var gameState: GameState = GameState(returnplayerList(), playStack2)
  def Controller = Guice.createInjector(new UnoGameModule).getInstance(classOf[controllerInterface])
  val injector = Guice.createInjector(new UnoGameModule)
  val fileIo: FileIO = injector.getInstance(classOf[FileIO])

  def setDefault(): Unit =
    stackCard = initStackCard()
    playerList = initPlayerList()
    playStack2 = initPlayStack()
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


  def getCard(): Unit =
    stackCard = stackEmpty()
    undoManager.doStep(SetCommand(this))
    publish(new updateStates)

  def removeCard(handindex: Int) =
    stackCard = stackEmpty()
    undoManager.doStep(new RemoveCommand(handindex:Int, this))
    unoCall = false
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


  /*override def save: Unit =
    fileIo.save(GameState(playerList, playStack2))
    gameStatus = SAVED
    publish(new saveStates)*/

/*
  override def load:Unit=
    val gameState = fileIo.load
    gameState match {
      case Success(option) =>
        option.match {
          case Some(jsonData) =>
            val(playerlistJson,playstackJson) = jsonData
            playerList = playerlistJson
            playStack2 = playstackJson
            gameStatus = LOADED
            publish(new loadStates)
          case None=>
        }
      case Failure(_) =>
        gameStatus = COULD_NOT_LOAD
        publish(new failureStates)
    }
*/


  override def save: Unit =
    val gamestate: String = Json.prettyPrint(gameStateToJson(playerList, playStack2))
    val responseFuture: Future[HttpResponse] = Http().singleRequest(HttpRequest(method = HttpMethods.POST, uri = "http://localhost:8080/save", entity = gamestate))
    gameStatus = SAVED
    publish(new saveStates)

  override def load: Unit = {
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

  def unpackJson(result: String): Unit = {
    val file: String = Source.fromFile("gamestate.json").getLines.mkString
    val json: JsValue = Json.parse(file)
    playerList = setPlayerList(json)
    playStack2 = List(Card((json \ "gameState" \ "playStackValue").as[String],
      (json \ "gameState" \ "playStackColor").as[String]))
  }