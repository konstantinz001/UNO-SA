package UNO.model
import scala.collection.mutable.ListBuffer
import scala.io.StdIn.readLine


//ListBuffer zu List umändern
case class Player (name: String, playerCards:ListBuffer[Card]){
  override def toString:String = {
    name + " " + playerCards
  }

  def getPlayerName: String = {
    name
  }

  def getPlayerCards: ListBuffer[Card] = {
    playerCards
  }

  def resetPlayerCards(setCard: Card): Player = {
    playerCards+=setCard
    return Player(getPlayerName, playerCards)
  }

  def removePlayerCards(idx: Int): Player = {
    getPlayerCards.remove(idx)
    return Player(getPlayerName, getPlayerCards)
  }

  def startHand(): ListBuffer[Card] = {
    val c = Card(1, "green") :: Card(2, "red") :: Card(3, "blue") :: Card(4, "blue") :: Card(5, "yellow") :: Nil
    ListBuffer.empty ++= c
  }
}
