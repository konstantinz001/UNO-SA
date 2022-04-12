package UnoFileIO

import UnoCards.cardBaseImp.Card
import UnoGameState.GameState
import UnoPlayer.playerBaseImp.Player

import scala.util.Try

trait FileIOTrait:
  def load:Try[Option[(List[Player],List[Card])]]
  def save(gameState:GameState): Unit

