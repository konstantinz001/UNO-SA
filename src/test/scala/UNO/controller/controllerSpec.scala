package UNO.controller

import UNO.model.{Card, Player}
import UNO.util.Observer
import org.scalatest.{Matchers, WordSpec}

class controllerSpec extends WordSpec with Matchers{
  "A Controller" when {
    "new" should {
      val controller = new controller()
      val observer = new Observer {
        var updated: Boolean = false

        def isUpdated: Boolean = updated

        override def update: Unit = updated = true
      }
      val player = controller.createPlayer("Konstantin")
      "a new Player" in {
        player.name should be ("Konstantin")
      }
      val pL = controller.playerToList(controller.createPlayer("Konstantin"),
        controller.createPlayer("Soni"))
      "a PlayerList" in {
        pL.size should be (2)
        pL(0).name should be ("Konstantin")
        pL(1).name should be ("Soni")
      }
      "a Player get a Card from Stack" in {
        val pL = controller.playerToList(controller.createPlayer("Konstantin"),
          controller.createPlayer("Soni"))
        val stackcard = List(Card(1, "red"), Card(2, "green"), Card(3, "green"))
        controller.getCard(pL,stackcard) should be
        (println("Konstantin\nList(Card = 1 || red, Card = 1 || green, Card = 2 || green, Card = 3 || green)"))
      }
      "a Player put a Card into Playstack" in {
        val pL = controller.playerToList(controller.createPlayer("Konstantin"),
          controller.createPlayer("Soni"))
        val playStack = Card(5, "green")
        controller.removeCard(pL,playStack,0) should be
        (println("Konstantin\nList(Card = 2 || green, Card = 3 || green)"))
      }
      "a Player call UNO with 1 Card" in {
        val pL = controller.playerToList(Player("Konstantin",List(Card(2,"green"))),
          controller.createPlayer("Soni"))
        val playStack = Card(5, "green")
        val stackcard = List(Card(1, "red"), Card(2, "green"), Card(3, "green"))
        controller.callUno(pL,stackcard,playStack,0) should be (print("UNO - UNO!\nPlayer Konstantin wins!"))
      }
      "GameStats" in {
        val pL = controller.playerToList(Player("Konstantin", List(Card(2, "green"))),
          controller.createPlayer("Soni"))
        val playStack = Card(5, "green")
        val stackcard = List(Card(1, "red"), Card(2, "green"), Card(3, "green"))
        controller.printGameStats(pL, stackcard, playStack) should be(print("\n\nPlayStack: Card = 5 || green\n" +
          "StackCard: List(Card = 1 || red, Card = 2 || green, Card = 3 || green)\n\n\n" +
          "Konstantin\nList(Card = 1 || green, Card = 2 || green, Card = 3 || green)\n\n" +
          "Soni\nList(Card = 1 || green, Card = 2 || green, Card = 3 || green)"))
      }
    }
  }
}