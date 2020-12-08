package UNO.aview

import UNO.controller.controller
import UNO.model.Card
import UNO.util.{Observer, State, Strategy, callFirstUnoEvent, forgotCallUnoEvent, callSecondUnoEvent, exitGameEvent, removeFalseCardEvent, removePlayerCardEvent, setPlayerCardEvent, toManyCardsEvent}
import UNO.util.{removeCardEvent}

class TUI (controller: controller) extends Observer {

  controller.add(this)

  def processInputLine(input: String): Unit = {

    val is: Array[String] = input.split(" ")
    is(0) match {

      case "s" => {
        State.handle(setPlayerCardEvent())
        controller.getCard()
      }
      case "r" => {
        if (Strategy.handle(removeCardEvent(is(1).toInt),is(1).toInt) && controller.playerList(0).playerCards.size >= 3) {
          controller.removeCard(is(1).toInt)
          State.handle(removePlayerCardEvent(is(1).toInt),is(1).toInt)
        } else if (!Strategy.handle(removeCardEvent(is(1).toInt),is(1).toInt) && controller.playerList(0).playerCards.size >= 3) {
          State.handle(removeFalseCardEvent())
        } else {
          State.handle(forgotCallUnoEvent())
          //TODO in SetCommand implementieren
          for (i <- 1 to 2) {
            controller.playerList = List(controller.playerList(0).setPlayerCards(controller.stackCard.getCardFromStack()), controller.playerList(1))
            controller.stackCard = controller.stackCard.removeCard()
          }
          controller.playerList = List(controller.playerList(1), controller.playerList(0))
        }
      }


      case "u" => {
        if(controller.playerList(0).playerCards.size == 2) {
          State.handle(callFirstUnoEvent(is(1).toInt),is(1).toInt)
          controller.removeCard(is(1).toInt)
        }
        else if(controller.playerList(0).playerCards.size == 1) {
          State.handle(callSecondUnoEvent())
        }
        else {
          State.handle(toManyCardsEvent())
          //TODO in SetCommand implementieren
          for (i <- 1 to 2) {
            controller.playerList = List(controller.playerList(0).setPlayerCards(controller.stackCard.getCardFromStack()), controller.playerList(1))
            controller.stackCard = controller.stackCard.removeCard()
          }
          controller.playerList = List(controller.playerList(1), controller.playerList(0))
        }
      }
      case "q" => {
        State.handle(exitGameEvent())

      }

//TODO Tests
      case "s-" => {
        controller.undoGet
        println(controller.stackCard)
        println(controller.playerList)
      }
      case "s--" => {
        controller.redoGet
        println(controller.stackCard)
        println(controller.playerList)
      }
      case "r-" => {
        println(controller.playStack2)
        println(controller.playStack2(0))
        controller.undoGet
        println(controller.playStack2)
        println(controller.playStack2(0))
        println(controller.playerList)
      }
      case "r--" => {
        println(controller.playStack2)
        println(controller.playStack2(0))
        controller.redoGet
        println(controller.playStack2)
        println(controller.playStack2(0))
        println(controller.playerList)
      }
    }
  }



  override def update: Boolean = {
    true
  }
}
