package UNO.database.slick

import UNO.database.DaoInterface
import UnoCards.cardBaseImp.Card
import UnoPlayer.playerBaseImp.Player
import slick.lifted.TableQuery
import slick.jdbc.JdbcBackend.Database
import slick.jdbc.MySQLProfile.api.*

import scala.:+
import scala.collection.IterableOnce.iterableOnceExtensionMethods
import scala.concurrent.{Await, Future}
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration.Duration
import scala.util.{Failure, Success}
import UNO.database.slick.CardsTable
import play.api.libs.json.{JsValue, Json}

import scala.Array.copy
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

  val stack = TableQuery[CardsTable]
  val players = TableQuery[PlayerValueTable]
  //val maintable = TableQuery[DatabaseSchema]

  override def save(playerlist:List[Player], playerstack:List[Card]):Future[Unit]= {

    val injection= DBIO.seq(
      (stack.schema).createIfNotExists,
      stack ++=(for{
        card <-playerstack
      } yield card)
    )
    database.run(injection).andThen {
      case Success(_) => println("Daten erfolgreich gespeichert")
      case Failure(e) => println(s"Fehler beim Speichern in die Datenbank: ${e.getMessage}")
    }
  }
  override def load():String={
    val test:String = "test"
    test
  }
  override def save2(gamestate:String):Unit={
    unpackJson(gamestate)
    print("jsonfile print\n")
    print(unpackJson(gamestate))
    //print(gamestate)
  }
  override def probesafe(paras:List[String]):Future[Unit] = {
    val injection= DBIO.seq(
      (players.schema).createIfNotExists,
      players ++=(for{
        player <-paras
      } yield player)
    )
    database.run(injection).andThen {
      case Success(_) => println("Daten erfolgreich gespeichert")
      case Failure(e) => println(s"Fehler beim Speichern in die Datenbank: ${e.getMessage}")
    }

  }
  override def unpackJson(result: String): List[Player] = {
    //val file: String = Source.fromFile("gamestate.json").getLines.mkString
    val file: String = result.linesWithSeparators.mkString
    val json: JsValue = Json.parse(file)
    val playStacki2 = List(Card((json \ "gameState" \ "playStackValue").as[String],
      (json \ "gameState" \ "playStackColor").as[String]))
    playStack2 = playStack2  // karte in der mitte - aktuelle Karte

    val playerName = (json \ "gameState" \ "playerListName").as[List[String]]
    val playerValue1 = (json \ "gameState" \ "playerCardsValue1").as[List[String]]
    val playerValue2 = (json \ "gameState" \ "playerCardsValue2").as[List[String]]
    val playerColor1 = (json \ "gameState" \ "playerCardsColor1").as[List[String]]
    val playerColor2 = (json \ "gameState" \ "playerCardsColor2").as[List[String]]
    probesafe(playerValue1)

    var cards1 = List(Card(playerValue1(0), playerColor1(0)))
    for i <- (1 to playerValue1.size - 1)
      do cards1 = Card(playerValue1(i), playerColor1(i)) :: cards1
    var cards2 = List(Card(playerValue2(0), playerColor2(0)))
    for(i <- (1 to playerValue2.size - 1))
      cards2 = Card(playerValue2(i), playerColor2(i)) :: cards2
    List(Player(playerName(0), cards1.reverse), Player(playerName(1), cards2.reverse))
  }
}
