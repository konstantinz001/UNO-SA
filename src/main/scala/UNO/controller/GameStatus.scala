package UNO.controller

object GameStatus extends Enumeration {
  type GameStatus = Value
  val IDLE, START, PLAY, WON, LOST = Value

  val map = Map[GameStatus, String](
    IDLE -> "",
    START -> "Game init",
    PLAY -> "Game playing",
    WON ->"You won",
    LOST ->"You lost")

  def message(gameStatus: GameStatus) = {
    map(gameStatus)
  }
}