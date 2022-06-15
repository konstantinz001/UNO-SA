package UnoFileIO.fileIOJsonImp

import akka.actor.typed.ActorSystem
import akka.actor.typed.scaladsl.Behaviors
import play.api.libs.json.{JsValue, Json}

import java.io.File
import scala.concurrent.{Await, ExecutionContextExecutor, Future}
import scala.util.{Failure, Success, Try}
import scala.io.Source

class FileIO extends FileIOTrait:
  implicit val system: ActorSystem[Nothing] = ActorSystem(Behaviors.empty, "SingleRequest")
  implicit val executionContext: ExecutionContextExecutor = system.executionContext
  def load: Future[String] =
    Try(Source.fromFile("gamestate.json").getLines().mkString) match
      case Success(v) => println("File Found")
      case Failure(v) => println("Es ist kein Spielstand vorhanden!")

    val file = Source.fromFile("gamestate.json").mkString
    Future(file.mkString)

  def save(gamestate_json: String): Unit =
    import java.io._
    val print_writer = new PrintWriter(new File("." + File.separator + "gamestate.json"))
    print_writer.write(gamestate_json)
    print_writer.close()




