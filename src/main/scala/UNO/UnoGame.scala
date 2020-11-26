package UNO

import UNO.controller.controller

import scala.io.StdIn.readLine
import UNO.model.Player
import UNO.model.Card
import aview.TUI
import UNO.controller.controller

import scala.collection.mutable.ListBuffer

object UnoGame {
  val controller = new controller()
  val tui = new TUI(controller)

  def main(args: Array[String]): Unit = {
    printf("_"*50 + "\n")
    println("UNO! ")
    printf("_"*50 + "\n")

    println("Possible instructions:")
    printf("\tq = Quit\n")
    printf("\tt = GameStats\n")
    printf("\ts = Take a new Card from Stack\n")
    printf("\tr = Put a Card from Hand into GameBoard\n")
    printf("\tu = Call UNO/ UNO-UNO\n")
    printf("_"*50 + "\n")

    controller.notifyObservers()
    var input: String = ""
    do{
      input = readLine("\nInstruction: ")
      tui.processInputLine(input)
    } while (input != "q")






    /*val stackcard = List(Card(1, "green"), Card(2,"green"),Card(3,"green"))
    val playStack = Card(5, "green")
    val tui = new TUI
    val pL = List(tui.createGame("y"), tui.createGame("y"))
    tui.playGame("r 0", pL,stackcard,playStack,0)
    //tui.playGame("r 0", pL, card, 0)

    //def playGame(pL:List[Player], stackCard: List[Card], playStack:Card, idx:Int): Unit = {

     */
  }
}