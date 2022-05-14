package UNO.database.slick

import UNO.UnoGame.Controller
import UNO.database.DaoInterface
import UnoGameState.GameState
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
        "playerListName" -> playerName.map(x => x),
        "playerCardsValue1" -> dbCard_1Value.map(x => x),
        "playerCardsColor1" -> dbCard_2Color.map(x => x),
        "playerCardsValue2" -> dbCard_2Value.map(x => x),
        "playerCardsColor2" -> dbCard_2Color.map(x => x),
        "playStackValue" -> dbCard_STACKValue,
        "playStackColor" -> dbCard_STACKColor
      )
    ).toString()
  }

  override def save(playerNames: List[String],value1: List[String], color1:List[String],
                    value2: List[String], color2:List[String], valueStack: List[String], colorStack: List[String]):Unit = {

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
      } yield ("1",playerNames(2),valueStack(i), colorStack(i))),
    )
    database.run(injection).andThen {
      case Success(_) => println("Daten erfolgreich gespeichert")
      case Failure(e) => println(s"Fehler beim Speichern in die Datenbank: ${e.getMessage}")
    }
  }
}
