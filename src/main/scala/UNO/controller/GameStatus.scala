package UNO.controller

import UNO.model.{Card, Player}


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