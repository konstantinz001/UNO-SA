package UnoGameState

import UnoPlayer.playerBaseImp.Player
import UnoCards.cardBaseImp.Card
import UnoStack.stackBaseImp.Stack

case class GameState(playerList: List[Player], playStack: List[Card]):
  
  def getstackCard(): Stack =
    val stackCard = Stack(List(Card("",""))).initStack()
    stackCard

