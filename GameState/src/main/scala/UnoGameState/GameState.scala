package UnoGameState

import UnoPlayer.playerBaseImp.Player
import UnoCards.cardBaseImp.Card
import UnoStack.stackBaseImp.Stack

case class GameState(playerList: List[Player], playStack: List[Card]):

  def getplayerList(): List[Player] =
    playerList

  def getstackCard(): Stack =
    var stackCard = Stack(List(Card("",""))).initStack()
    /*(1 to 100).foreach((i)=>{
      stackCard = stackCard.shuffleCards()
    })*/
    stackCard

  def getplayStack(): List[Card] =
    playStack

