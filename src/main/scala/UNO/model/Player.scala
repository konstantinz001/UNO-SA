package UNO.model
import scala.util.control.Breaks.{break, breakable}


case class Player (name: String, playerCards:List[Card]) {
  override def toString: String = {
    name + "\n" + playerCards + "\n"
  }

  def setPlayerCards(setCard: Card): Player = {
    val temporarily  = setCard :: playerCards
    return copy(playerCards = temporarily)
  }

  def removePlayerCards(index: Int): Player = {
    var tmp = List[Card]()
    for (i <- 0 until playerCards.size) {
      breakable {
        if (i == index) {
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
    //val c = Card(1, "green") :: Card(2, "green") :: Card(3, "green") :: Card(4, "green") :: Card(5, "green") :: Nil
    val starthand = Card(1, "green") :: Card(2, "green") :: Card(3, "green") :: Nil
    return starthand
  }
}
