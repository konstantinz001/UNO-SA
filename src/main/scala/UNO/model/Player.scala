package UNO.model

case class Player (name: String, playerCards:Option[List[Card]] = None){
  override def toString:String = name

  def getPlayerCards: Option[List[Card]] = {
    playerCards
  }

  def assignCards(cards: Option[List[Card]]): Player = {
    this.copy(playerCards = cards)
  }

  val startinghand: List[Card]

  def startedhand(): Card = {
    val numberofcards = 5


  }

  }
