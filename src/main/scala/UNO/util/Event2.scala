package UNO.util

import UNO.UnoGame.Controller

trait Event2

case class removeCardEvent(handindex:Int) extends Event2:
  def removeCard: Boolean =
    if Controller.playerList(0).playerCards(handindex).color == Controller.playStack2(0).color ||
      Controller.playerList(0).playerCards(handindex).value == Controller.playStack2(0).value ||
      (Controller.playerList(0).playerCards(handindex).color == "black" && Controller.colorSet != "") then
        true
    else
        false
