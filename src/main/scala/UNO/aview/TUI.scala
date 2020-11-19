package UNO.aview

import UNO.model.{Card, Player}
import UNO.model.Player

import scala.io.StdIn.readLine
import scala.util.control.Breaks.{break, breakable}


class TUI {
  println("Possible instructions:")
  printf("Instruction 1: \tq = Quit \n\t\t\t\t n = new Game\n")
  printf("Instruction 2: \ty/n = New Player? \n")
  printf("Instruction 3: \ts = Take a new Card from Stack \n\t\t\t\t r = Put a Card from Hand into GameBoard")
  printf("Instruction 4: \tWhich Playerturn?")
  printf("Instruction 5: \t[Optional] Index for Instruction 2 -> r\n\n\n")
  /**/val input = readLine("Create new Player?: ")

  def createGame(input:String): Player = {

    print("\n\n")
    val is: Array[String] = input.split(" ")

    is(0) match {

      case "y" => {
        /**/val printerName = readLine("Please enter your name: ")
        //val printerName = "Bob"
        val player = Player(printerName, Player.startHand())
        println("Hello " + player.toString)
        return player
      }
      case "q" => {
        println("Game exit")
        System.exit(0)
        return Player("", None.toList)
      }
      case "n" => {
        println("Game exit")
        System.exit(0)
        return Player("",None.toList)
      }
    }
  }

  //def playGame(input:String, pL:List[Player], stackCard: List[Card], playStack:Card, idx:Int): Unit = {
  def playGame(pL:List[Player], stackCard: List[Card], playStack:Card, idx:Int): Unit = {
      println("PLAYER " + pL(0).getPlayerName.toUpperCase())
      print("\n\nPlayStack: " + playStack + "\n")
      print("HandCard: " + pL(idx).getPlayerCards + "\n")
    /**/val input = readLine("Instruction: ")
      print("\n\n")
      val is: Array[String] = input.split(" ")

      is(0) match {
        case "s" => {
          println(pL(idx).setPlayerCards(stackCard(0)))
          val l = List(pL(idx+1),pL(idx).setPlayerCards(stackCard(0)))
          var s = List[Card]()
          for (i <- 1 until stackCard.size) {
            s = stackCard(i) :: s
          }
          /**/playGame(l, s, playStack, 0)
        }
        case "r" => {
          val c = pL(idx).getPlayerCards(is(1).toInt)
          if((c.color == playStack.color) || c.number == playStack.number) {
            println(pL(idx).removePlayerCards(is(1).toInt))
            val newPlayStack = c
            val l = List(pL(idx+1),pL(idx).removePlayerCards(is(1).toInt))
            /**/playGame(l, stackCard, c, 0)
          } else {
            println("Wrong Card!")
          }
        }
        case "u" => {

          val c = pL(idx).getPlayerCards(is(1).toInt)
          if((c.color == playStack.color) || c.number == playStack.number) {
            println(pL(idx).removePlayerCards(is(1).toInt))
            val newPlayStack = c
            val l = List(pL(idx+1),pL(idx).removePlayerCards(is(1).toInt))
            if (pL(idx).getPlayerCards.size == 2) {
              println("UNO")
              playGame(l, stackCard, c, 0)
            }
            else if (pL(idx).getPlayerCards.size == 1) {
              println("UNO - UNO!")
              println("Player " + pL(0).getPlayerName.toUpperCase() + " hat gewonnen!")
              System.exit(0)
            }
            else {
              println("Zu viele Karten!!!")
              println(pL(idx).setPlayerCards(stackCard(0)))
              val l = List(pL(idx+1),pL(idx).setPlayerCards(stackCard(0)))
              var s = List[Card]()
              for (i <- 1 until stackCard.size) {
                s = stackCard(i) :: s
              }
              /**/playGame(l, s, playStack, 0)
            }
          } else {
            println("Wrong Card!")
          }
        }

        case "q" => {
          println("Game exit")
          System.exit(0)
          return Player("", None.toList)
        }
      }
    }
}