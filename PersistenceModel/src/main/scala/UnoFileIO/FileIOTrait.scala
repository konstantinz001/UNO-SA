package UnoFileIO

import UnoGameState.GameState

trait FileIOTrait:
  def load: GameState
  def save(gameState:GameState): Unit

