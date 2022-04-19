package UnoFileIO.fileIOJsonImp

import UnoGameState.GameState
import UnoPlayer.playerBaseImp.Player
import UnoCards.cardBaseImp.Card
import UnoFileIO.FileIOTrait
import play.api.libs.json.{JsValue, Json}
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
    val print_writer = new PrintWriter(new File("gamestate.json"))
    print_writer.write(gamestate_json)
    print_writer.close()