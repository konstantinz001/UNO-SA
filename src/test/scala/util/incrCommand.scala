package util

import UNO.util.Command

class incrCommand extends Command {
  var state: Int = 0

  override def doStep: Unit = state += 1

  override def undoStep: Unit = state -= 1

  override def redoStep: Unit = state += 1

}
