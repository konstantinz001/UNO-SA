package UNO.controller.controllerComponent


object GameStatus extends Enumeration :
  type GameStatus = Value
  val IDLE, UNDO, REDO, NEW, INIT, ATTACK, SAVED, COULD_NOT_SAVE, LOADED, COULD_NOT_LOAD = Value

  val map = Map[GameStatus, String](
    SAVED -> "The Game was saved",
    COULD_NOT_SAVE -> "The Game was could not be saved",
    LOADED -> "The Game was loaded",
    COULD_NOT_LOAD -> "The Game was could not be loaded",
  )

  def getMessage(actualStatus: GameStatus) =
    map(actualStatus)