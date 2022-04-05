package UNO.controller.controllerComponent.controllerBaseImp

import UNO.controller.controllerComponent.controllerInterface
import UNO.model.cardComponent.cardBaseImp.Card
import UNO.util.Command


class RemoveCommand(handindex: Int, controller: controllerInterface) extends Command:


  override def doStep(): Unit =
    controller.playStack2 = controller.playerList(0).playerCards(handindex) :: controller.playStack2
    cardDiff()

  override def undoStep(): Unit =
    if controller.playStack2(1).color == "black" then
      controller.playerList = List(controller.playerList(1).setPlayerCards(controller.playStack2(1)), controller.playerList(0))
      controller.playStack2 = controller.playStack2.tail.tail
      if controller.playerList(0).playerCards(0).value == "4+ ColorSwitch" then
        for(i <- (1 to 4))
          controller.stackCard = controller.stackCard.reversePullCards(List(controller.playerList(1).playerCards(0)))
          controller.playerList = List(controller.playerList(0), controller.playerList(1).removePlayerCards(0))

    else
      controller.playerList = List(controller.playerList(1).setPlayerCards(controller.playStack2(0)), controller.playerList(0))
      controller.playStack2 = controller.playStack2.tail
      if controller.playerList(0).playerCards(0).value == "+2" then
        for (i <- (1 to 2))
          controller.stackCard = controller.stackCard.reversePullCards(List(controller.playerList(1).playerCards(0)))
          controller.playerList = List(controller.playerList(0), controller.playerList(1).removePlayerCards(0))
      if controller.playerList(0).playerCards(handindex).value == "<-->" then
        controller.playerList = controller.playerList.reverse
      if controller.playerList(0).playerCards(handindex).value == "Ø" then
        controller.playerList = List(controller.playerList(1), controller.playerList(0))

  override def redoStep(): Unit =
    controller.playStack2 = controller.playerList(0).playerCards(handindex) :: controller.playStack2
    cardDiff()

  def cardDiff(): Unit =
    if controller.playerList(0).playerCards(handindex).color == "black" then
      val getColor = controller.colorSet
      controller.playStack2 = Card("", getColor) :: controller.playStack2
    controller.playerList(0).playerCards(handindex).value match
      case "+2" =>
        for (i <- (1 to 2))
          controller.playerList = List( controller.playerList(0),controller.playerList(1).setPlayerCards(controller.stackCard.getCardFromStack()))
          controller.stackCard = controller.stackCard.removeCard()
        controller.playerList = List(controller.playerList(1), controller.playerList(0).removePlayerCards(handindex))
      case "4+ ColorSwitch" =>
        for(i <- 1 to 4)
          controller.playerList = List( controller.playerList(0),controller.playerList(1).setPlayerCards(controller.stackCard.getCardFromStack()))
          controller.stackCard = controller.stackCard.removeCard()
        controller.playerList = List(controller.playerList(1), controller.playerList(0).removePlayerCards(handindex))
      case "<-->" =>
        controller.playerList = List(controller.playerList(1), controller.playerList(0).removePlayerCards(handindex))
        controller.playerList = controller.playerList.reverse
      case "Ø" =>
        controller.playerList = List(controller.playerList(1), controller.playerList(0).removePlayerCards(handindex))
        controller.playerList = controller.playerList.tail ::: List(controller.playerList.head) ::: Nil
      case _ =>
        controller.playerList = List(controller.playerList(1), controller.playerList(0).removePlayerCards(handindex))



