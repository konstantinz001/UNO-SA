package UNO.aview

import UNO.controller.controller
import UNO.util.Observer
import UNO.util.{State,setPlayerCardEvent,removeFalseCardEvent,
  callFirstUnoEvent,callSecondUnoEvent,toManyCardsEvent,removePlayerCardEvent,exitGameEvent}


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
        if (controller.playerList(0).playerCards(is(1).toInt).color == controller.playStack2(0).color ||
          controller.playerList(0).playerCards(is(1).toInt).value == controller.playStack2(0).value ||
          controller.playerList(0).playerCards(is(1).toInt).color == "schwarz") {
          controller.removeCard(is(1).toInt)
          State.handle(removePlayerCardEvent(is(1).toInt),is(1).toInt)
        }
        else {
          State.handle(removeFalseCardEvent())
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
          controller.getCard()
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

//TODO
/*
    In Remove einfügen falls man vergisst uno zu rufen

            if(controller.playerList(0).playerCards.size <= 2) {
            println("Call Uno!")
            println("\n--Handcards:\t" + controller.playerList(0).setPlayerCards(controller.stackCard(0)).playerCards)
            controller.getCard()
          }

 */