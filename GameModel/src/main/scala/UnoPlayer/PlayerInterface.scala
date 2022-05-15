package UnoPlayer

import UnoPlayer.playerBaseImp.Player
import UnoCards.cardBaseImp.Card

trait PlayerInterface:
  def name: String
  def playerCards: List[Card]
  def tryRemovePlayerCards(index: Int): Option[Player]
  def removePlayerCards(index: Int): Player
  def setPlayerCards(setCard: Card): Player
  def toString: String
