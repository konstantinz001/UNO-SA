package UNO
import UNO.aview.TUI
import UNO.model.Card
import UNO.model.Player
import scala.io.StdIn.readLine
import org.scalatest._

class TuiSpec extends WordSpec with Matchers {
  "A TUI" should {
    val tui = new TUI
    "CreateGame input 'y'" in {
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