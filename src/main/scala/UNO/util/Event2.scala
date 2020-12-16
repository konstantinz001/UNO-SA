package UNO.util

import UNO.UnoGame.controller
import UNO.model.Card

import scala.io.StdIn.readLine

trait Event2

case class removeCardEvent(handindex:Int) extends Event2 {
  def removeCard: Boolean = {
    if((controller.playerList(0).playerCards(handindex).color == controller.playStack2(0).color ||
      controller.playerList(0).playerCards(handindex).value == controller.playStack2(0).value ||
      controller.playerList(0).playerCards(handindex).color == "black")) {
      return true
    }
    return false
  }
}