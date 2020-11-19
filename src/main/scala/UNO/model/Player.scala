package UNO.model
import scala.util.control.Breaks.{break, breakable}


case class Player (name: String, playerCards:List[Card]) {
  override def toString: String = {
    name + "\n" + playerCards + "\n"
  }

  def getPlayerName: String = {
    name
  }

  def getPlayerCards: List[Card] = {
    playerCards
  }

  def setPlayerCards(setCard: Card): Player = {
    val tmp = setCard :: playerCards
    return copy(playerCards = tmp)
  }

  def removePlayerCards(idx: Int): Player = {
    var tmp = List[Card]()
    for (i <- 0 until playerCards.size) {
      breakable {
        if (i == idx) {
          break
        } else {
          tmp = playerCards(i) :: tmp
        }
      }
    }
    return copy(playerCards = tmp.reverse)
  }
}


object Player {
  def startHand(): List[Card] = {
    val c = Card(1, "green") :: Card(2, "green") :: Card(3, "green") :: Card(4, "green") :: Card(5, "green") :: Nil
    return c
  }
}
