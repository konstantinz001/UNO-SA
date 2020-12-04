package UNO.util

import UNO.UnoGame.controller
import UNO.controller.GameStatus
import UNO.controller.GameStatus._

trait Event

case class instructionEvent() extends Event {
  def instruction: Unit = {
    println("Possible instructions:")
    printf("\tq = Quit\n")
    printf("\ts = Take a new Card from Stack\n")
    printf("\tr = Put a Card from Hand into GameBoard\n")
    printf("\tu = Call UNO/ UNO-UNO\n")
    printf("_" * 50 + "\n")
  }
}

case class gameStartEvent() extends Event {
  def gameStart: Unit = {
    printf("_" * 50 + "\n")
    println("UNO! ")
    printf("_" * 50 + "\n")
  }
}

case class gameStatsEvent() extends Event {
  def gameStats: Unit = {
    print("\n" + "_" * 50 + "\nPLAYER " + controller.playerList(0).name.toUpperCase() +
      "\n\nHandcards: \t" + controller.playerList(0).playerCards +
      "\n\n\nPlayStack: \t" + controller.playStack2(0) +
      "\nStackCard: \t" + controller.stackCard + "\n")
  }
}

case class exitGameEvent() extends Event {
  def exitGame: Unit = println("Game exit")
}

case class setPlayerCardEvent() extends Event {
  def setPlayerCard = println("\n--Handcards:\t" + controller.playerList(0).setPlayerCards(controller.stackCard.getCardFromStack()))
}

case class removePlayerCardEvent(index:Int) extends Event {
  def removePlayerCard = {
    println("\n--Handcards:\t" + controller.playerList(0).removePlayerCards(index).playerCards)
  }
}

case class removeFalseCardEvent() extends Event {
  def removeFalseCard = println("Wrong Card!")
}

case class callFirstUnoEvent(index:Int) extends Event {
  def callFirstUno = {
    println("UNO")
    removePlayerCardEvent(index)
  }
}

case class callSecondUnoEvent() extends Event {
  def callSecondUno = {
    println("UNO - UNO!")
    controller.gameStatus = WON
    println("Player " + controller.playerList(0).name.toUpperCase()+ ":" + GameStatus.message(controller.gameStatus))
  }
}

case class toManyCardsEvent() extends Event {
  def toManyCards = {
    println("To many Cards")
    println("\n--Handcards:\t" + controller.playerList(0).setPlayerCards(controller.stackCard.getCardFromStack()))
  }
}

