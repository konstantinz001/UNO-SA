package UNO.model.fileIOComponent

import UNO.model.GameState

import scala.util.Try
import UNO.model.PlayerComponent.playerBaseImp.Player
import UNO.model.cardComponent.cardBaseImp.Card


trait FileIOTrait:
  //def load: GameState
  def load:Try[Option[(List[Player],List[Card])]]
  def save(gameState:GameState): Unit

