package UNO.model.fileIOComponent

import UNO.model.GameState

trait FileIOTrait:
  def load(gameState:GameState): GameState
  def save(gameState:GameState): Unit

