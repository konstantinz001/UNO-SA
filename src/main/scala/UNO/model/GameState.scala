package UNO.model

import UNO.model.PlayerComponent.playerBaseImp.Player
import UNO.model.cardComponent.cardBaseImp.Card
import UNO.model.stackComponent.stackBaseImp.Stack

case class GameState(playerList: List[Player], stackCard: Stack, playStack: List[Card]) {

  def getplayerList(): List[Player] = {
    playerList
  }

  def getstackCard(): Stack = {
    stackCard
  }

  def getplayStack(): List[Card] = {
    playStack
  }

  def setplayerList(playerList: List[Player])= {
    playerList
  }
}
