package UNO.model.fileIOComponent

import UNO.model.GameState

trait FileIOTrait {

  def load: Unit

  def save(gameState:GameState): Unit

}
