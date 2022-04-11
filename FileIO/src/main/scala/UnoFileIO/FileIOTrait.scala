package UnoFileIO

import UNO.model.GameState

trait FileIOTrait:
  def load: GameState
  def save(gameState:GameState): Unit

