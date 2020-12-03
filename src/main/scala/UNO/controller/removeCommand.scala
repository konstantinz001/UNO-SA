package UNO.controller


import UNO.controller.controller
import UNO.util.Command


class RemoveCommand(handindex: Int, controller: controller) extends Command {
  override def doStep: Unit = {
    val currentcard = controller.playerList(0).playerCards(handindex)
    if ((currentcard.color == controller.playStack.color) || currentcard.number == controller.playStack.number) {
      controller.playStack = controller.playerList(0).playerCards(handindex)
      controller.playStack2 = controller.playStack :: controller.playStack2
      controller.playerList = List(controller.playerList(1), controller.playerList(0).removePlayerCards(handindex))
    }
  }

  override def undoStep: Unit = {
    controller.playerList = List(controller.playerList(1).setPlayerCards(controller.playStack2(0)), controller.playerList(0))
    controller.playStack = controller.playStack2(1)
    controller.playStack2 = controller.playStack2.tail
  }

  override def redoStep: Unit = {
    controller.playerList = List(controller.playerList(1).setPlayerCards(controller.playStack2(0)), controller.playerList(0).setPlayerCards(controller.playStack2(1)))
    controller.playStack = controller.playStack2(2)
    val a = controller.playStack2.tail
    val b = a.tail
    controller.playStack2 = b

  }
}
