package UNO.aview

import UNO.model.{Card, Player}
import UNO.model.Player
import org.graalvm.compiler.graph.Node.Input

import scala.io.StdIn.readLine
import scala.util.control.Breaks.{break, breakable}

import UNO.controller.controller
import UNO.util.Observer



class TUI (controller: controller) extends Observer {

  controller.add(this)

  def processInputLine(input: String): Unit = {

    val is: Array[String] = input.split(" ")

    is(0) match {

      case "s" => {
        println("\n--Handcards:\t" + controller.playerList(0).setPlayerCards(controller.stackCard(0)).playerCards)
        controller.getCard()
      }
      case "r" => {
        if ((controller.playerList(0).playerCards(is(1).toInt).color == controller.playStack.color) ||
          controller.playerList(0).playerCards(is(1).toInt).number == controller.playStack.number) {
          controller.removeCard(is(1).toInt)
        }
        else {
          println("Wrong Card!")
        }
      }
      case "u" => {
        if(controller.playerList(0).playerCards.size == 2) {
          println("\n--Handcards:\t" + controller.playerList(0).removePlayerCards(is(1).toInt).playerCards)
          controller.removeCard(is(1).toInt)
        }
        else if(controller.playerList(0).playerCards.size == 1) {
          println("UNO - UNO!")
          println("Player " + controller.playerList(0).name.toUpperCase() + " wins!")
          System.exit(0)
        }
        else {
          println("To many Cards")
          println("\n--Handcards:\t" + controller.playerList(0).setPlayerCards(controller.stackCard(0)).playerCards)
          controller.getCard()
        }

      }
      case "q" => {
        println("Game exit")
      }
    }
  }



  override def update: Unit = {
    print("\n" + "_"*50 + "\nPLAYER " + controller.playerList(0).name.toUpperCase() +
      "\n\nHandcards: \t" + controller.playerList(0).playerCards +
      "\n\n\nPlayStack: \t" + controller.playStack +
      "\nStackCard: \t" + controller.stackCard + "\n" )

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