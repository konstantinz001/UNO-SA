package UNO.controller


import UNO.controller.controller
import scala.io.StdIn.readLine
import UNO.model.Card
import UNO.util.Command


class RemoveCommand(handindex: Int, controller: controller) extends Command {
  override def doStep: Unit = {

    controller.playStack2 = controller.playerList(0).playerCards(handindex) :: controller.playStack2
    cardDiff
    controller.playerList = List(controller.playerList(1), controller.playerList(0).removePlayerCards(handindex))
  }

  override def undoStep: Unit = {

    if (controller.playStack2(1).color == "schwarz") {
      controller.playerList = List(controller.playerList(1), controller.playerList(0).setPlayerCards(controller.playStack2(1)))
      controller.playStack2 = controller.playStack2.tail.tail
      if (controller.playerList(0).playerCards(0).value == "+4") {
        for (i <- 1 to 4) {
          controller.stackCard = controller.stackCard.reversePullCards(List(controller.playerList(1).playerCards(0)))
          controller.playerList = List(controller.playerList(0), controller.playerList(1).removePlayerCards(0))
        }
      }
    }
    else {

      controller.playerList = List(controller.playerList(1), controller.playerList(0).setPlayerCards(controller.playStack2(0)))
      controller.playStack2 = controller.playStack2.tail

      if (controller.playerList(0).playerCards(0).value == "+2") {
        for (i <- 1 to 2) {
          controller.stackCard = controller.stackCard.reversePullCards(List(controller.playerList(1).playerCards(0)))
          controller.playerList = List(controller.playerList(0), controller.playerList(1).removePlayerCards(0))

        }
      }

      if (controller.playerList(0).playerCards(handindex).value == "<-->") {
        controller.playerList = controller.playerList.reverse
      }

      if (controller.playerList(0).playerCards(handindex).value == "Ø") {
        controller.playerList = List(controller.playerList(1), controller.playerList(0))
      }
    }
  }

  override def redoStep: Unit = {
    controller.playStack2 = controller.playerList(0).playerCards(handindex) :: controller.playStack2
    controller.playerList = List(controller.playerList(1), controller.playerList(0))
    cardDiff
    controller.playerList = List(controller.playerList(0), controller.playerList(1).removePlayerCards(handindex))
    //println(controller.playStack2(0))

  }





  def cardDiff: Unit= {
    if (controller.playerList(0).playerCards(handindex).color == "schwarz") {
      val getColor = readLine("Set color: ")
      controller.playStack2 = Card("", getColor) :: controller.playStack2
    }
    if (controller.playerList(0).playerCards(handindex).value == "+2") {
      for (i <- 1 to 2) {
        println("Take two Cards")
        controller.playerList = List( controller.playerList(0),controller.playerList(1).setPlayerCards(controller.stackCard.getCardFromStack()))
        controller.stackCard = controller.stackCard.removeCard()
        println(controller.playerList(1).playerCards)
      }
    }
    if (controller.playerList(0).playerCards(handindex).value == "+4") {
      for (i <- 1 to 4) {
        println("Take four Cards")
        controller.playerList = List( controller.playerList(0),controller.playerList(1).setPlayerCards(controller.stackCard.getCardFromStack()))
        controller.stackCard = controller.stackCard.removeCard()
      }
    }
    if (controller.playerList(0).playerCards(handindex).value == "<-->") {
      println("Retour")
      controller.playerList = controller.playerList.reverse
    }
    if (controller.playerList(0).playerCards(handindex).value == "Ø") {
      println("Supose")
      controller.playerList = List(controller.playerList(1), controller.playerList(0))
    }
  }
}
