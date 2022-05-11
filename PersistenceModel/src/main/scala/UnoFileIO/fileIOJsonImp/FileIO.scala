package UnoFileIO.fileIOJsonImp

import UnoCards.cardBaseImp.Card
import UnoFileIO.FileIOTrait
import UnoGameState.GameState
import UnoPlayer.playerBaseImp.Player
import play.api.libs.json.{JsValue, Json}

import java.io.File
import scala.util.{Failure, Success, Try}
import scala.io.Source

class FileIO extends FileIOTrait:
  def load: String =
    fileNotFound("gamestate.json") match
      case Success(v) => println("File Found")
      case Failure(v) => println("Es ist kein Spielstand vorhanden!")

    val file = Source.fromFile("gamestate.json")
    try file.mkString finally file.close()


  def fileNotFound(filename: String): Try[String] =
    Try(Source.fromFile(filename).getLines().mkString)


  def save(gamestate_json: String): Unit =
    import java.io._
    val print_writer = new PrintWriter(new File("." + File.separator + "gamestate.json"))
    print_writer.write(gamestate_json)
    print_writer.close()


  def loadByString(gameString: String): GameState =
    val json: JsValue = Json.parse(gameString)
    GameState(setPlayerList(json), setPlayStack(json))

  def gameStateToJson(gameState: GameState) =
    Json.obj(
      "gameState" -> Json.obj(
        "playerListName" -> gameState.playerList.map(x => x.name),
        "playerCardsValue1" -> gameState.playerList(0).playerCards.map(x => x.value),
        "playerCardsColor1" -> gameState.playerList(0).playerCards.map(x => x.color),
        "playerCardsValue2" -> gameState.playerList(1).playerCards.map(x => x.value),
        "playerCardsColor2" -> gameState.playerList(1).playerCards.map(x => x.color),
        "playStackValue" -> gameState.playStack(0).value,
        "playStackColor" -> gameState.playStack(0).color
      )
    )


  def setPlayerList (json: JsValue) : List[Player] =
    val playerName = (json \ "gameState" \ "playerListName").as[List[String]]
    val playerValue1 = (json \ "gameState" \ "playerCardsValue1").as[List[String]]
    val playerValue2 = (json \ "gameState" \ "playerCardsValue2").as[List[String]]
    val playerColor1 = (json \ "gameState" \ "playerCardsColor1").as[List[String]]
    val playerColor2 = (json \ "gameState" \ "playerCardsColor2").as[List[String]]
    var cards1 = List(Card(playerValue1(0), playerColor1(0)))
    for i <- (1 to playerValue1.size - 1)
    // optinal decide later if ok
      do cards1 = Card(playerValue1(i), playerColor1(i)) :: cards1
    var cards2 = List(Card(playerValue2(0), playerColor2(0)))
    for(i <- (1 to playerValue2.size - 1))
      cards2 = Card(playerValue2(i), playerColor2(i)) :: cards2
    List(Player(playerName(0), cards1.reverse), Player(playerName(1), cards2.reverse))

  def setPlayStack (json: JsValue) : List[Card] =
    List(Card((json \ "gameState" \ "playStackValue").as[String],
      (json \ "gameState" \ "playStackColor").as[String]))

