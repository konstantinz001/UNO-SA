package UnoFileIO

import UnoCards.cardBaseImp.Card
import UnoGameState.GameState
import UnoPlayer.playerBaseImp.Player

import scala.util.Try

trait FileIOTrait:
  def load: String
  def save(gamestate_json: String): Unit

