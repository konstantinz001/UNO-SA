package UnoFileIO

import scala.util.Try

trait FileIOTrait:
  def load: String
  def save(gamestate_json: String): Unit
  def loadByString(gameString: String): UnoGameState.GameState

