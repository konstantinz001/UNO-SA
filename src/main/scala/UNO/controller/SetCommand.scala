package UNO.controller

import UNO.UnoGame.controller
import UNO.util.Command


class SetCommand(controller: controller) extends Command {
  override def doStep: Unit = {
    controller.playerList = List(controller.playerList(1), controller.playerList(0).setPlayerCards(controller.stackCard.getCardFromStack()))
    controller.stackCard = controller.stackCard.removeCard()
    if (controller.playStack2(0).value == "+2") {
      for (i <- 1 to 2) {
        println("Take two Cards")
        //controller.playerList = List(controller.playerList(1), controller.playerList(0).setPlayerCards(controller.stackCard.getCardFromStack()))
        //controller.stackCard = controller.stackCard.removeCard()
      }
    }
    if (controller.playStack2(0).value == "+4") {
      for (i <- 1 to 4) {
        println("Take four Cards")
        //controller.playerList = List(controller.playerList(1), controller.playerList(0).setPlayerCards(controller.stackCard.getCardFromStack()))
        //controller.stackCard = controller.stackCard.removeCard()
      }
    }
    if (controller.playStack2(0).value == "<-->") {
      println("Retour")
      //controller.playerList = controller.playerList.reverse
    }
    if (controller.playStack2(0).value == "Ø") {
      println("Supose")
      //controller.playerList = List(controller.playerList(0), controller.playerList(1))
    }
  }

  override def undoStep: Unit = {
    controller.stackCard = controller.stackCard.pullCards(List(controller.playerList(1).playerCards(0)))
    controller.playerList = List(controller.playerList(1).removePlayerCards(0), controller.playerList(0))
  }

  override def redoStep: Unit = {
    }
}
