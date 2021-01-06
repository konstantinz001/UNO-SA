package UNO.model.PlayerComponent

import UNO.model.cardComponent.cardBaseImp.Card

trait PlayerInterface {
  def name: String

  def playerCards: List[Card]
}
