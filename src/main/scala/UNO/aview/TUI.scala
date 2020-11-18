package UNO.aview

import UNO.UnoGame.startHand
import UNO.model.{Card, Player}
import scala.io.StdIn.readLine


class TUI {

  def processInputLine(input: String, newCard: Card): Unit = {
    val is: Array[String] = input.split(" ")
    println("Possible instructions:")
    printf("Instruction 1: \t q = Quit \n\t\t\t\t n = new Game\n")
    printf("Instruction 2: \tNumber of new Player \n")
    printf("Instruction 3: \ts = Take a new Card from Stack \n\t\t\t\t r = Put a Card from Hand into GameBoard")
    printf("Instruction 4: \tWhich Playerturn?")
    printf("Instruction 5: \t[Optional] Index for Instruction 2 -> r\n\n\n")


    is(0) match {
      case "q" => {
        println("Game exit")
        System.exit(0)
      }
      case "n" => {
        if (is(1).matches("[2-5]")) {
          var player = new Array[Player](is(1).toInt)
          for (a <- 0 until is(1).toInt) {
            val printerName = readLine("Please enter your name: ")
            player(a) = Player(printerName, startHand())
            println("Hello " + player(a).toString)
          }
          if(is(2).matches("s" ) && is(3).matches("[0-5]")) {
            //player(is(3).toInt).setPlayerCards(newCard)
            println(player(is(3).toInt).setPlayerCards(newCard))
          }
          else if(is(2).matches("r") && is(3).matches("[0-5]") && is(4).matches("[0-9]|10")){
            //player(is(3).toInt).removePlayerCards(is(4).toInt)
            println(player(is(3).toInt).removePlayerCards(is(4).toInt))
          }

          else {
            println("Inner")
            System.exit(1)
          }
        } else {
          println("Outer")
          System.exit(1)
        }
      }
    }
  }
}

