/*package UNO
import UNO.aview.TUI
import UNO.controller.controller
import UNO.model.Card
import UNO.model.Player

import scala.io.StdIn.readLine
import org.scalatest._

class TuiSpec extends WordSpec with Matchers {
  "A TUI" should {
    val controller = new controller()
    val tui = new TUI(controller)
    controller.notifyObservers
    "CreateGame input 'y'" in {
      val input = "y"
      val pL = tui.createGame("y")
      pL.getPlayerName should be("Bob")
      pL.getPlayerCards.toString() should be ("List(Card = 1 || green, Card = 2 || green, Card = 3 || green)")
    }

    //def playGame(pL:List[Player], stackCard: List[Card], playStack:Card, idx:Int): Unit = {
    "PlayGame input 'r'" in {
      val pL = List(tui.createGame("y"), tui.createGame("y"))
      val stackcard = List(Card(1, "red"), Card(2,"yellow"),Card(3,"blue"))
      val playStack = Card(9, "green")
      tui.playGame("r 0", pL, stackcard, playStack, 0) should be
      (println("Bob\nList(Card = 2 || green, Card = 3)"))
    }
    "PlayGame input 's'" in {
      val pL = List(tui.createGame("y"), tui.createGame("y"))
      val stackcard = List(Card(1, "red"), Card(2, "yellow"), Card(3, "blue"))
      val playStack = Card(9, "green")
      tui.playGame("s", pL, stackcard, playStack, 0) should be
      (println("Bob\nList(Card = 1 || red, Card = 1 || green, Card = 2 || green, Card = 3 || green)"))
    }
    "PlayGame input 'u'" in {
      val pL = List(tui.createGame("y"), tui.createGame("y"))
      val stackcard = List(Card(1, "red"), Card(2, "yellow"), Card(3, "blue"))
      val playStack = Card(9, "green")
      tui.playGame("u 0", pL, stackcard, playStack, 0) should be
      (println("To many Cards!!!"))
    }
  }
}
*/
package UNO
import UNO.aview.TUI

import UNO.UnoGame.tui
import UNO.controller.controller
import UNO.model.Card
import UNO.model.Player
import scala.io.StdIn.readLine
import org.scalatest._

class TuiSpec extends WordSpec with Matchers {
  "A TUI" should {
    val controller = new controller()
    val tui = new TUI(controller)
    controller.notifyObservers
      "TUI input 't'" in {
        tui.processInputLine("t") should be
        val pL = List(controller.createPlayer("Konstantin"), controller.createPlayer("Soni"))
        (print("\n\nPlayStack: Card = 5 || green\n" +
          "StackCard: List(Card = 1 || red, Card = 2 || green, Card = 3 || green)\n\n\n" +
          "Konstantin\nList(Card = 1 || green, Card = 2 || green, Card = 3 || green)\n\n" +
          "Soni\nList(Card = 1 || green, Card = 2 || green, Card = 3 || green)"))
      }

      //def playGame(pL:List[Player], stackCard: List[Card], playStack:Card, idx:Int): Unit = {
      "PlayGame input 'r'" in {
        val pL = List(controller.createPlayer("Konstantin"), controller.createPlayer("Soni"))
        tui.processInputLine("r 0") should be
        (println("Konstantin\nList(Card = 2 || green, Card = 3 || green)"))
        }
      "PlayGame input 's'" in {
        val pL = List(controller.createPlayer("Konstantin"), controller.createPlayer("Soni"))
        tui.processInputLine("r 0") should be
        (println("Konstantin\nList(Card = 1 || red, Card = 1 || green, Card = 2 || green, Card = 3 || green)"))
        }
        "PlayGame input 'u'" in {
          val pL = List(Player("Konstantin", List(Card(2, "green"))), controller.createPlayer("Soni"))
          tui.processInputLine("u 0") should be
          ( println("UNO - UNO!\nPlayer KONSTANTIN hat gewonnen!"))
          ""
          }
        }
      }
