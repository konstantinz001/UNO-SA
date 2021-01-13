package UNO.model

import UNO.model.PlayerComponent.playerBaseImp.Player
import UNO.model.cardComponent.cardBaseImp.Card
import UNO.model.stackComponent.stackBaseImp.Stack

case class GameState(playerList: List[Player], playStack: List[Card]) {

  def getplayerList(): List[Player] = {
    playerList
  }
  def getstackCard(): Stack = {
    var stackCard = Stack(List(new Card("",""))).initStack()
    /*(1 to 100).foreach((i)=>{
      stackCard = stackCard.shuffleCards()
    })*/
    stackCard
  }

  def getplayStack(): List[Card] = {
    playStack
  }
}
