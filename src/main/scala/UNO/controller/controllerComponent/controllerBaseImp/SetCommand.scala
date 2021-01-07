package UNO.controller.controllerComponent.controllerBaseImp

import UNO.controller.controllerComponent.controllerInterface
import UNO.util.Command


class SetCommand(controller: controllerInterface) extends Command {
  override def doStep: Unit = {
    controller.playerList = List(controller.playerList(1), controller.playerList(0).setPlayerCards(controller.stackCard.getCardFromStack()))
    controller.stackCard = controller.stackCard.removeCard()
  }

  override def undoStep: Unit = {
    controller.stackCard = controller.stackCard.pullCards(List(controller.playerList(1).playerCards(0)))
    controller.playerList = List(controller.playerList(1).removePlayerCards(0), controller.playerList(0))
  }

  override def redoStep: Unit = {
    controller.playerList = List(controller.playerList(1), controller.playerList(0).setPlayerCards(controller.stackCard.getCardFromStack()))
    controller.stackCard = controller.stackCard.removeCard()
    }
}
