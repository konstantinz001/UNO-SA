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

        override def update: Boolean = {
          true
        }
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
        val stackcard = List(Card("1", "red"), Card("2", "green"), Card("3", "green"))
        controller.getCard() should be
        (println("Konstantin\nList(Card = 1 || red, Card = 1 || green, Card = 2 || green, Card = 3 || green)"))
      }
      "a Player put a Card into Playstack" in {
        val pL = controller.playerToList(controller.createPlayer("Konstantin"),
          controller.createPlayer("Soni"))
        val playStack = Card("5", "green")
        controller.removeCard(0) should be
        (println("Konstantin\nList(Card = 2 || green, Card = 3 || green)"))
        (controller.playerList(0).playerCards(0).color == controller.playStack.color) should be (false)
        (controller.playerList(0).playerCards(0).value == controller.playStack.value) should be (true)
      }
    }
  }
}