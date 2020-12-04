package UNO.controller


import UNO.controller.controller
import UNO.util.Command


class RemoveCommand(handindex: Int, controller: controller) extends Command {
  override def doStep: Unit = {
    controller.activActionCard = true
    controller.playStack2 = controller.playerList(0).playerCards(handindex) :: controller.playStack2
    controller.playerList = List(controller.playerList(1), controller.playerList(0).removePlayerCards(handindex))
    if (controller.playStack2(0).value == "+2" && controller.activActionCard == true) {
      for (i <- 1 to 2) {
        println("Take two Cards")
        controller.playerList = List( controller.playerList(0).setPlayerCards(controller.stackCard.getCardFromStack()),controller.playerList(1))
        controller.stackCard = controller.stackCard.removeCard()
        controller.activActionCard = false
      }
    }
    if (controller.playStack2(0).value == "+4") {
      for (i <- 1 to 4) {
        println("Take four Cards")
        controller.playerList = List( controller.playerList(0).setPlayerCards(controller.stackCard.getCardFromStack()),controller.playerList(1))
        controller.stackCard = controller.stackCard.removeCard()
        controller.activActionCard = false
      }
    }
    if (controller.playStack2(0).value == "<-->") {
      println("Retour")
      controller.playerList = controller.playerList.reverse
      controller.activActionCard = false
    }
    if (controller.playStack2(0).value == "Ø") {
      println("Supose")
      controller.playerList = List(controller.playerList(1), controller.playerList(0))
      controller.activActionCard = false
    }
    println(controller.playStack2(0))
  }

  override def undoStep: Unit = {
    controller.playerList = List(controller.playerList(1).setPlayerCards(controller.playStack2(0)), controller.playerList(0))
    controller.playStack2 = controller.playStack2.tail
  }

  override def redoStep: Unit = {
    controller.playerList = List(controller.playerList(1).setPlayerCards(controller.playStack2(0)), controller.playerList(0).setPlayerCards(controller.playStack2(1)))
    val a = controller.playStack2.tail
    val b = a.tail
    controller.playStack2 = b

  }
}
