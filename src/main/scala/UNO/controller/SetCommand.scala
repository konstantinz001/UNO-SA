package UNO.controller

import UNO.util.Command


class SetCommand(controller: controller) extends Command {
  override def doStep: Unit = {
    controller.playerList = List(controller.playerList(1), controller.playerList(0).setPlayerCards(controller.stackCard(0)))
    controller.stackCard = controller.stackCard diff List(controller.stackCard(0))
  }

  override def undoStep: Unit = {
    println("kkkkkk")
    controller.stackCard = controller.playerList(1).playerCards(0) :: controller.stackCard
    controller.playerList = List(controller.playerList(1).removePlayerCards(0), controller.playerList(0))
  }

  override def redoStep: Unit = {
    controller.stackCard = controller.playerList(0).playerCards(0) :: controller.playerList(1).playerCards(0) :: controller.stackCard
    controller.playerList = List(controller.playerList(0).removePlayerCards(0), controller.playerList(1).removePlayerCards(0))
  }
}
