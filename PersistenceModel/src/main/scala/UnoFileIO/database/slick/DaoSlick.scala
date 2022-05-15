package UnoFileIO.database.slick

import UnoFileIO.database.DaoInterface
import slick.lifted.TableQuery
import slick.jdbc.JdbcBackend.Database
import slick.jdbc.MySQLProfile.api.*

import scala.collection.IterableOnce.iterableOnceExtensionMethods
import scala.concurrent.{Await, Future}
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration.Duration
import scala.util.{Failure, Success}
import play.api.libs.json.{JsValue, Json}

import scala.Array.{copy, range}
import scala.io.Source

class DaoSlick extends DaoInterface {
  val databaseUrl: String = "jdbc:mysql://" + sys.env.getOrElse("DATABASE_HOST", "localhost:3306") + "/" + sys.env
    .getOrElse("MYSQL_DATABASE", "unodb") + "?serverTimezone=UTC"
  val databaseUser: String = sys.env.getOrElse("MYSQL_USER", "uno")
  val databasePassword: String = sys.env.getOrElse("MYSQL_PASSWORD", "uno123")


  val database = Database.forURL(
    url = databaseUrl,
    driver = "com.mysql.cj.jdbc.Driver",
    user = databaseUser,
    password = databasePassword
  )

  val gameState = TableQuery[GamestateTable]

  override def load(gameID: String):String={
    val gameQuery_1 = sql"""select PLAYER,VALUE,COLOR from GAMESTATE where GAMEID = $gameID and PLAYER = '1';""".as[(String, String, String)]
    val gameResult_1 = Await.result(database.run(gameQuery_1), Duration.Inf)

    val dbCard_1Value =
      (for{
        i <- (0 to gameResult_1.size - 1)
      } yield (gameResult_1(i)._2)).toList
    val dbCard_1Color =
      (for{
        i <- (0 to gameResult_1.size - 1)
      } yield (gameResult_1(i)._3)).toList

    val gameQuery_2 = sql"""select PLAYER,VALUE,COLOR from GAMESTATE where GAMEID = $gameID and PLAYER = '2';""".as[(String, String, String)]
    val gameResult_2 = Await.result(database.run(gameQuery_2), Duration.Inf)
    val dbCard_2Value =
      (for{
        i <- (0 to gameResult_2.size - 1)
      } yield (gameResult_2(i)._2)).toList
    val dbCard_2Color =
      (for{
        i <- (0 to gameResult_2.size - 1)
      } yield (gameResult_2(i)._3)).toList


    val gameQuery_STACK = sql"""select VALUE,COLOR from GAMESTATE where GAMEID = $gameID and PLAYER = 'STACK';""".as[(String, String)]
    val gameResult_STACK = Await.result(database.run(gameQuery_STACK), Duration.Inf).head
    val dbCard_STACKValue = gameResult_STACK._1
    val dbCard_STACKColor = gameResult_STACK._2
    val playerName = List("1","2")

    Json.obj(
      "gameState" -> Json.obj(
        "playerListName" -> playerName,
        "playerCardsValue1" -> dbCard_1Value,
        "playerCardsColor1" -> dbCard_1Color,
        "playerCardsValue2" -> dbCard_2Value,
        "playerCardsColor2" -> dbCard_2Color,
        "playStackValue" -> dbCard_STACKValue,
        "playStackColor" -> dbCard_STACKColor
      )
    ).toString()
  }

  def save(game: String): Unit = {
    val json: JsValue = Json.parse(game)

    val valueStack = List((json \ "gameState" \ "playStackValue").as[String])
    val colorStack = List((json \ "gameState" \ "playStackColor").as[String])
    val playerNames = (json \ "gameState" \ "playerListName").as[List[String]]
    val value1 = (json \ "gameState" \ "playerCardsValue1").as[List[String]]
    val value2 = (json \ "gameState" \ "playerCardsValue2").as[List[String]]
    val color1 = (json \ "gameState" \ "playerCardsColor1").as[List[String]]
    val color2 = (json \ "gameState" \ "playerCardsColor2").as[List[String]]

    val injection= DBIO.seq(
      (gameState.schema).createIfNotExists,
      gameState.delete,
      gameState ++=(for{
        i <- (0 to value1.size - 1)
      } yield ("1",playerNames(0),value1(i), color1(i))),
      gameState ++=(for{
        i <- (0 to value2.size - 1)
      } yield ("1",playerNames(1),value2(i), color2(i))),
      gameState ++=(for{
        i <- (0 to valueStack.size - 1)
      } yield ("1","STACK",valueStack(i), colorStack(i))),
    )
    database.run(injection)/*.andThen {
      case Success(_) => println("Daten erfolgreich gespeichert")
      case Failure(e) => println(s"Fehler beim Speichern in die Datenbank: ${e.getMessage}")
    }*/
  }
}
