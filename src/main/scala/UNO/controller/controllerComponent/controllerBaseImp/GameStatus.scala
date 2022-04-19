package UNO.controller.controllerComponent


object GameStatus extends Enumeration :
  type GameStatus = Value
  val IDLE, UNDO, REDO, NEW, SAVED, COULD_NOT_SAVE,
  LOADED, COULD_NOT_LOAD, QUIT, SET, GET, WRONG, UNOCALL_1, UNOCALL_2,
  PENALTY, WRONGCOLOR, INIT = Value

  def handleStatus(actualStatus: GameStatus, Controller: controllerInterface) =

    def instruction: String =
      "\nPossible instructions:\n"+
        "\tq = Quit\n" +
        "\ts = Take a new Card from Stack\n"+
        "\tr = Put a Card from Hand into GameBoard\n"+
        "\tu = Call UNO/ UNO-UNO\n"+
        "\n"+"_" * 50 + "\n"

    def gameStart: String =
      "\n"+"_" * 50 + "\n" +
        "\nUNO! "+ "\n" +
        "\n" + "_" * 50 + "\n"

    def gameStats: String =
      "\n" + "_" * 50 + "\nPLAYER " + Controller.playerList(0).name.toUpperCase() +
        "\n\nPlayStack: \t" + Controller.playStack2(0) +
        "\n\nHandcards: \t" + Controller.playerList(0).playerCards

    def exitGame:String = "\nGame exit\n"

    def wrongCommand:String = "\nWrong Command!\n"

    def wrongColor:String = "\nWrong Color!\n"

    def winUno:String =
      "\nUNO - UNO!\n" +
        "Player " + Controller.playerList(0).name.toUpperCase()+ ": WON\n"

    def penaltyMove:String =
      "\nPenalty:\n"+
        "\nWrong move!\n"

    val map = Map[GameStatus, String](
      NEW -> "New Game!\n\n".concat(gameStart).concat(instruction).concat(gameStats),
      INIT -> gameStart.concat(instruction).concat(gameStats),

      IDLE -> gameStats,

      SAVED -> "The Game was saved\n\n".concat(gameStats),
      COULD_NOT_SAVE -> "The Game was could not be saved\n\n".concat(gameStats),
      LOADED -> "The Game was loaded\n\n".concat(gameStats),
      COULD_NOT_LOAD -> "The Game was could not be loaded\n\n".concat(gameStats),

      QUIT -> exitGame,

      UNDO -> "UNDO!\n\n".concat(gameStart).concat(instruction).concat(gameStats),
      REDO -> "REDO!\n\n".concat(gameStart).concat(instruction).concat(gameStats),
      SET -> gameStats,
      GET -> gameStats,

      WRONG -> wrongCommand,

      UNOCALL_1 -> gameStart.concat(gameStats),
      UNOCALL_2 -> winUno,

      PENALTY -> penaltyMove.concat(gameStats),

      WRONGCOLOR -> wrongColor.concat(gameStats)
    )
    print(map(actualStatus))
