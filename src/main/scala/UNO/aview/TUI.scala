package UNO.aview

import UNO.UnoGame.startHand
import UNO.model.{Card, Player}
import scala.io.StdIn.readLine


class TUI {
  println("Possible instructions:")
  printf("Instruction 1: \tq = Quit \n\t\t\t\t n = new Game\n")
  printf("Instruction 2: \ty/n = New Player? \n")
  printf("Instruction 3: \ts = Take a new Card from Stack \n\t\t\t\t r = Put a Card from Hand into GameBoard")
  printf("Instruction 4: \tWhich Playerturn?")
  printf("Instruction 5: \t[Optional] Index for Instruction 2 -> r\n\n\n")
  val input = readLine("Create new Player?: ")

  def createGame(): Player = {

    print("\n\n")
    val is: Array[String] = input.split(" ")

    is(0) match {

      case "y" => {
        val printerName = readLine("Please enter your name: ")
        val player = Player(printerName, startHand())
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

  def playGame(pL:List[Player], newCard: Card,idx:Int): Unit = {
      println("PLAYER " + pL(0).getPlayerName.toUpperCase())
      val input = readLine("Instruction: ")
      print("\n\n")
      val is: Array[String] = input.split(" ")


      is(0) match {
        case "s" => {
          println(pL(idx).setPlayerCards(newCard))
          val l = List(pL(idx+1),pL(idx).setPlayerCards(newCard))
          playGame(l,newCard, 0)
        }
        case "r" => {
          println(pL(idx).removePlayerCards(is(1).toInt))
          val l = List(pL(idx+1),pL(idx).removePlayerCards(is(1).toInt))
          playGame(l,newCard, 0)
        }
        case "q" => {
          println("Game exit")
          System.exit(0)
          return Player("", None.toList)
        }
      }
    }
}