package UNO.model.fileIOComponent.fileIOJsonImp

import UNO.model.GameState
import UNO.model.PlayerComponent.playerBaseImp.Player
import UNO.model.cardComponent.cardBaseImp.Card
import UNO.model.fileIOComponent.FileIOTrait
import play.api.libs.json.{JsValue, Json}
import scala.util.{Failure, Success, Try}

import scala.io.Source


class FileIO extends FileIOTrait:
  override def load: GameState =
    tryload match {
      case Some(json: JsValue) => GameState(setPlayerList(json), setPlayStack(json))
      case None => GameState(List.empty,List.empty)
    }

  def tryload: Option[JsValue] =
    Try(Source.fromFile("gamestate.json").getLines.mkString) match
      case Success(file) => Some(Json.parse(file))
      case Failure(_) => None


  def setPlayerList (json: JsValue) : List[Player] =
    val playerName = (json \ "gameState" \ "playerListName").as[List[String]]
    val playerValue1 = (json \ "gameState" \ "playerCardsValue1").as[List[String]]
    val playerValue2 = (json \ "gameState" \ "playerCardsValue2").as[List[String]]
    val playerColor1 = (json \ "gameState" \ "playerCardsColor1").as[List[String]]
    val playerColor2 = (json \ "gameState" \ "playerCardsColor2").as[List[String]]
    val cards1 = returnList(Card(playerValue1(0), playerColor1(0)),List():List[Card],
      1, playerValue1, playerColor1)
    val cards2 = returnList(Card(playerValue2(0), playerColor2(0)),List():List[Card],
      1, playerValue2, playerColor2)

    List(Player(playerName(0), cards1), Player(playerName(1), cards2))
  
  def returnList (newCard : Card, oldList: List[Card], index : Int, playerValueIndex: List[String], playerColorIndex: List[String]) : List[Card] = {
    if((playerValueIndex.size-index) < 1) then
      newCard :: oldList
    else
      newCard :: returnList(Card(playerValueIndex(index), playerColorIndex(index)),oldList, index+1, playerValueIndex, playerColorIndex)
  }
  
  def setPlayStack (json: JsValue) : List[Card] =
    List(Card((json \ "gameState" \ "playStackValue").as[String],
      (json \ "gameState" \ "playStackColor").as[String]))

  override def save(gameState: GameState): Unit =
    import java.io._
    try 
      val pw = new PrintWriter(new File("gamestate.json"))
      pw.write(Json.prettyPrint(gameStateToJson(gameState)))
      pw.close

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