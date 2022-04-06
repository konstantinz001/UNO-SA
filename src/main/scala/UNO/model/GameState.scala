package UNO.model

import UNO.model.PlayerComponent.playerBaseImp.Player
import UNO.model.cardComponent.cardBaseImp.Card
import UNO.model.stackComponent.stackBaseImp.Stack

case class GameState(playerList: List[Player], playStack: List[Card]):
  
  def getstackCard(): Stack =
    val stackCard = Stack(List(Card("",""))).initStack()
    stackCard

