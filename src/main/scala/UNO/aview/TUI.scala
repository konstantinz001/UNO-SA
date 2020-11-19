package UNO.aview

import UNO.model.{Card, Player}
import UNO.model.Player
import scala.io.StdIn.readLine


class TUI {
  println("Possible instructions:")
  printf("Instruction 1: \tq = Quit \n\t\t\t\t n = new Game\n")
  printf("Instruction 2: \ty/n = New Player? \n")
  printf("Instruction 3: \ts = Take a new Card from Stack \n\t\t\t\t r = Put a Card from Hand into GameBoard")
  printf("Instruction 4: \tWhich Playerturn?")
  printf("Instruction 5: \t[Optional] Index for Instruction 2 -> r\n\n\n")
  //val input = readLine("Create new Player?: ")

  def createGame(input:String): Player = {

    print("\n\n")
    val is: Array[String] = input.split(" ")

    is(0) match {

      case "y" => {
        //val printerName = readLine("Please enter your name: ")
        val printerName = "Bob"
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

  def playGame(input:String, pL:List[Player], newCard: Card,idx:Int): Unit = {
      println("PLAYER " + pL(0).getPlayerName.toUpperCase())
      //val input = readLine("Instruction: ")
      print("\n\n")
      val is: Array[String] = input.split(" ")


      is(0) match {
        case "s" => {
          println(pL(idx).setPlayerCards(newCard))
          val l = List(pL(idx+1),pL(idx).setPlayerCards(newCard))
          println(l)
          //playGame("q",l,newCard, 0)
        }
        case "r" => {
          println(pL(idx).removePlayerCards(is(1).toInt))
          val l = List(pL(idx+1),pL(idx).removePlayerCards(is(1).toInt))
          println(l)
          //playGame("q",l,newCard, 0)
        }
        case "q" => {
          println("Game exit")
          System.exit(0)
          return Player("", None.toList)
        }
      }
    }
}