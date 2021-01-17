package UNO.model

import UNO.UnoGame.controller
import UNO.model.cardComponent.cardBaseImp.Card
import UNO.model.stackComponent.stackBaseImp.Stack

object createGame {

  def initStackCard() : Stack = {
    var stackCards =Stack(List(new Card("",""))).initStack()
    /*(1 to 100).foreach((i)=>{
      stackCard = stackCard.shuffleCards()
    })*/
    stackCards
  }


  def initPlayStack() : List[Card] = {

    while (controller.stackCard.getCardFromStack().color == "black") {
      controller.stackCard = controller.stackCard.pullCards(List(controller.stackCard.getCardFromStack()))
      controller.stackCard = controller.stackCard.removeCard()
    }
    List(controller.stackCard.getCardFromStack())
  }
}
