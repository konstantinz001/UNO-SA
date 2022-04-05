package UNO.util

class UndoManager:

  private var undoStack: List[Command] = Nil
  private var redoStack: List[Command] = Nil

  def doStep(command: Command): Unit =
    undoStack = command :: undoStack
    command.doStep()

  def redoStep():Unit = unitfied(false)
  def undoStep():Unit = unitfied(true)

//  def undoStep(): Unit =
//    undoStack match
//      case Nil =>
//      case head :: stack =>
//        head.undoStep()
//        undoStack = stack
//        redoStack = head :: redoStack

//  def redoStep(): Unit =
//    redoStack match
//      case Nil =>
//      case head :: stack =>
//        head.redoStep()
//        redoStack = stack
//        undoStack = head :: undoStack


  def unitfied(checkValue:Boolean):Unit=
    if(checkValue == true)
      undoStack match {
        case Nil =>
        case head :: stack =>
          head.undoStep()
          undoStack = stack
          redoStack = head :: redoStack
      }
    else {
      redoStack match
        case Nil =>
        case head :: stack =>
          head.redoStep()
          redoStack = stack
          undoStack = head :: undoStack
    }