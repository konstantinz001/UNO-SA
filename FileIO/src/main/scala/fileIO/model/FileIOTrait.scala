package fileIO.model

/*
import UNO.model.GameState

trait FileIOTrait:
  def load: GameState
  def save(gameState:GameState): Unit
*/

trait FileIOTrait:
  def load: Unit
  def save: Unit