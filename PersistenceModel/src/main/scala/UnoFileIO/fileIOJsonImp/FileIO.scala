package UnoFileIO.fileIOJsonImp

import UnoGameState.GameState
import UnoPlayer.playerBaseImp.Player
import UnoCards.cardBaseImp.Card
import UnoFileIO.FileIOTrait
import play.api.libs.json.{JsValue, Json}
import scala.util.{Failure, Success, Try}

import scala.io.Source



class FileIO extends FileIOTrait:
  override def load:Try[Option[(List[Player],List[Card])]]=
    var gamestateOption: Option[(List[Player],List[Card])] = None
    Try{
      val file: String = Source.fromFile("gamestate.json").getLines.mkString
      val json: JsValue = Json.parse(file)
      gamestateOption = Some((List[Player](),List[Card]()))
      gamestateOption match {
        case Some((playList,playStack2))=>
          var newplaylist = playList
          var newplaystack2 = playStack2
          newplaylist = setPlayerList(json)
          newplaystack2= setPlayStack(json)
          gamestateOption = Some((newplaylist,newplaystack2))
        case None=>
      }
      gamestateOption
    }

  override def save(gameState: GameState): Unit =
    import java.io.*
    val pw = new PrintWriter(new File("gamestate.json"))
    pw.write(Json.prettyPrint(gameStateToJson(gameState)))
    pw.close
  
  
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

  def setPlayStack (json: JsValue) : List[Card] =
    List(Card((json \ "gameState" \ "playStackValue").as[String],
      (json \ "gameState" \ "playStackColor").as[String]))
  
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
