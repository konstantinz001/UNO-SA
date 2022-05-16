package UnoFileIO.fileIOJsonImp

import scala.concurrent.Future

trait FileIOTrait:
  def load: Future[String]

  def save(gamestate_json: String): Unit
