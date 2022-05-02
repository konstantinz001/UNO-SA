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

  val stack = TableQuery[CardsTable]
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
  override def load():Unit={
    print("")
  }
}
