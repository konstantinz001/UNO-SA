package UNO.util

import UNO.UnoGame.controller

trait Eventt

case class strategyEvent1() extends Event {
  def strategy1 = {
    controller.playerList = List(controller.playerList(1), controller.playerList(0).setPlayerCards(controller.stackCard(0)))
    controller.stackCard = controller.stackCard diff List(controller.stackCard(0))
  }
}

case class strategyEvent2(handindex:Int) extends Event {
  def strategy2 = {
    val currentcard = controller.playerList(0).playerCards(handindex)
    if ((currentcard.color == controller.playStack.color) || currentcard.number == controller.playStack.number) {
      controller.playStack = controller.playerList(0).playerCards(handindex)
      controller.playerList = List(controller.playerList(1), controller.playerList(0).removePlayerCards(handindex))
    }
  }
}
