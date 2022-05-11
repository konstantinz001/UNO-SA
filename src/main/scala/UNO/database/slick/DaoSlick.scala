package UNO.database.slick

import UNO.database.DaoInterface
import UnoCards.cardBaseImp.Card
import UnoPlayer.playerBaseImp.Player
import UnoGameState.GameState
import slick.lifted.TableQuery
import slick.jdbc.JdbcBackend.Database
import slick.jdbc.MySQLProfile.api.*

import scala.:+
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
  var playStack2=List[Card]()


  val database = Database.forURL(
    url = databaseUrl,
    driver = "com.mysql.cj.jdbc.Driver",
    user = databaseUser,
    password = databasePassword
  )

  val gameState = TableQuery[GamestateTable]

  override def load(gameID: String):GameState={
    val gameQuery_1 = sql"""select PLAYER,VALUE,COLOR from GAMESTATE where GAMEID = $gameID and PLAYER = '1';""".as[(String, String, String)]
    val gameResult_1 = Await.result(database.run(gameQuery_1), Duration.Inf)
    val dbCard_1 =
      (for{
        i <- (0 to gameResult_1.size - 1)
      } yield Card(gameResult_1(i)._2,gameResult_1(i)._3)).toList
    val dbPlayer_1 = Player("1",dbCard_1)

    val gameQuery_2 = sql"""select PLAYER,VALUE,COLOR from GAMESTATE where GAMEID = $gameID and PLAYER = '2';""".as[(String, String, String)]
    val gameResult_2 = Await.result(database.run(gameQuery_2), Duration.Inf)
    val dbCard_2 =
      (for{
        i <- (0 to gameResult_2.size - 1)
      } yield Card(gameResult_2(i)._2,gameResult_2(i)._3)).toList
    val dbPlayer_2 = Player("2",dbCard_2)

    val dbPlayerList = List(dbPlayer_1, dbPlayer_2)

    val gameQuery_STACK = sql"""select VALUE,COLOR from GAMESTATE where GAMEID = $gameID and PLAYER = 'STACK';""".as[(String, String)]
    val gameResult_STACK = Await.result(database.run(gameQuery_STACK), Duration.Inf).head
    val dbCard_STACK = List(Card(gameResult_STACK._1,gameResult_STACK._2))

    GameState(dbPlayerList, dbCard_STACK)
  }


  override def save(gameID: String,player: String, value: List[String], color:List[String]):Unit = {
    val injection= DBIO.seq(
      (gameState.schema).createIfNotExists,
      gameState.delete,
      gameState ++=(for{
        i <- (0 to value.size - 1)
      } yield (gameID,player,value(i), color(i)))
    )
    database.run(injection).andThen {
      case Success(_) => println("Daten erfolgreich gespeichert")
      case Failure(e) => println(s"Fehler beim Speichern in die Datenbank: ${e.getMessage}")
    }
  }
  override def save(gameState: GameState):Unit = ???
}
