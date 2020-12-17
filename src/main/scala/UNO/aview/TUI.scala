package UNO.aview

import UNO.controller.controller
import UNO.model.{Card, Stack}
import UNO.util.{Observer, State, Strategy, callFirstUnoEvent, callSecondUnoEvent, exitGameEvent, forgotCallUnoEvent, gameStatsEvent, removeCardEvent, removeFalseCardEvent, removePlayerCardEvent, setPlayerCardEvent, toManyCardsEvent}
import UNO.controller._

import scala.swing.Reactor

class TUI (controller: controller) extends Reactor { // extends Observer

  //controller.add(this)
  listenTo(controller)

  def processInputLine(input: String): String = {

    val is: Array[String] = input.split(" ")
    is(0) match {

      case "s" => {
        controller.getCard()
        return State.handle(setPlayerCardEvent())
      }
      case "r" => {
        if (controller.playerList(0).playerCards(is(1).toInt).color == "black") {
        controller.colorSet = is(2)
      }
        if (Strategy.handle(removeCardEvent(is(1).toInt),is(1).toInt) && controller.playerList(0).playerCards.size >= 3) {
          controller.removeCard(is(1).toInt)
          return State.handle(removePlayerCardEvent(is(1).toInt),is(1).toInt)

        } else if (!Strategy.handle(removeCardEvent(is(1).toInt),is(1).toInt) && controller.playerList(0).playerCards.size >= 3) {
          return State.handle(removeFalseCardEvent())

        } else {
          //TODO Remove Card => if you have forgot to Call UNO you have to take 2 Cards: 1 Card Remove, 2 Cards Get
          controller.removeCard(is(1).toInt)
          controller.getCard()
          controller.playerList = controller.playerList.reverse
          controller.getCard()
          return State.handle(forgotCallUnoEvent())


        }
      }
      case "u" => {
        controller.unoCall = true
        if(controller.playerList(0).playerCards.size == 2) {
          controller.removeCard(is(1).toInt)
          return State.handle(callFirstUnoEvent(is(1).toInt),is(1).toInt)
        }
        else if(controller.playerList(0).playerCards.size == 1) {
          return State.handle(callSecondUnoEvent())
        }
        else {
          controller.getCard()
          controller.playerList = controller.playerList.reverse
          controller.getCard()
          return State.handle(toManyCardsEvent())
        }
      }
      case "q" => {
        return State.handle(exitGameEvent())

      }

      case "s-" => {
        controller.undoGet
        return "S-undo"
      }
      case "s--" => {
        controller.redoGet
        return "S-redo"
      }
      case "r-" => {
        controller.undoGet
        return "R-undo"
      }
      case "r--" => {
        controller.redoGet
        return "R-redo"
      }
    }
  }

  reactions += {
    case event: updateStates => print1
  }

   def print1:Unit= {
     print(State.handle(gameStatsEvent()))

  }


  //override def update: Boolean = {
  //  true
  //}
}
