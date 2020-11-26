package aview

import UNO.aview.TUI
import UNO.controller.controller
import UNO.model.{Card, Player}
import org.scalatest._

class TuiSpec extends WordSpec with Matchers {
  "A TUI" should {
    val controller = new controller()
    val tui = new TUI(controller)
    controller.notifyObservers()

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
        }
  }
}
