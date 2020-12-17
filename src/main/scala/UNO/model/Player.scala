package UNO.model
import scala.util.{Try,Failure, Success}



case class Player (name: String, playerCards:List[Card]) {

  override def toString: String = {
    name + "\n" + playerCards + "\n"
  }

  def setPlayerCards(setCard: Card): Player = {
    val temporarily = setCard :: playerCards
    return copy(playerCards = temporarily)
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
