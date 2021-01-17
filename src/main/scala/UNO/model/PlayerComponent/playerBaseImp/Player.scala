package UNO.model.PlayerComponent.playerBaseImp

import UNO.model.PlayerComponent.PlayerInterface
import UNO.model.cardComponent.cardBaseImp.Card

import scala.util.{Failure, Success, Try}

case class Player(name: String, playerCards: List[Card]) extends PlayerInterface{

  override def toString: String = {
    name + "\n" + playerCards + "\n"
  }

  def setPlayerCards(setCard: Card): Player = {
    copy(playerCards = setCard :: playerCards)
  }

  def removePlayerCards(index: Int): Player = {
    tryRemovePlayerCards(index) match {
      case Some(player) => player
      case None => throw new Exception("Es konnte keine Karte ausgewählt werden!\n")
    }
  }

  def tryRemovePlayerCards(index: Int): Option[Player] = {
    Try(playerCards diff List(playerCards(index))) match {
      case Success(list) => Some(copy(playerCards = list))
      case Failure(_) => None
    }
  }
}
