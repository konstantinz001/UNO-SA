package UNO.controller

import UNO.model.PlayerComponent.playerBaseImp.Player
import UNO.model.cardComponent.cardBaseImp.Card
import UNO.model.stackComponent.stackBaseImp.Stack


object GameStatus extends Enumeration {
  type GameStatus = Value
  val IDLE, WON, LOST = Value

  val map = Map[GameStatus, String](
    IDLE -> "",
    WON ->"You won",
    LOST ->"You lost")

  def message(gameStatus: GameStatus) = {
    map(gameStatus)
  }
}