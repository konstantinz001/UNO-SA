package UNO.util

import UNO.UnoGame.controller

object Strategy {

  var strategy = strategy1
  def handle(e: Event, index:Int) = {
    e match {
      case a:def strategy2 = {
        controller.playerList = List(controller.playerList(1), controller.playerList(0).setPlayerCards(controller.stackCard(0)))
        controller.stackCard = controller.stackCard diff List(controller.stackCard(0))
      }
        ca
    }
    def strategy1: Unit = {}



  def strategy3(handindex:Int) = {
    val currentcard = controller.playerList(0).playerCards(handindex)
    if ((currentcard.color == controller.playStack.color) || currentcard.number == controller.playStack.number) {
      controller.playStack = controller.playerList(0).playerCards(handindex)
      controller.playerList = List(controller.playerList(1), controller.playerList(0).removePlayerCards(handindex))
    }
  }
}

Strategy.strategy
