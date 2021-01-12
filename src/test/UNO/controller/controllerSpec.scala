package UNO.controller

import UNO.controller.GameStatus.{GameStatus, IDLE}
import UNO.controller.controllerComponent.controllerBaseImp.controller
import UNO.model.cardComponent.cardBaseImp.Card
import UNO.model.stackComponent.stackBaseImp.Stack
import UNO.util.Observer
import org.scalatest.{Matchers, WordSpec}

class controllerSpec extends WordSpec with Matchers {
  "A Controller" when {
    "new" should {
      var gameStatus: GameStatus = IDLE
      var playername1 = "Konstantin"
      var playername2 = "Soni"
      val controller = new controller()
      val observer = new Observer {
        var updated: Boolean = false

        def isUpdated: Boolean = updated

        override def update: Boolean = {
          true
        }
      }
      var stackCard = Stack(List(new Card("", ""))).initStack()
      var playStack2 = controller.initPlayStack()
      var playerList = controller.createPlayer()
      "a Player get a Card from Stack" in {
        val cardSizeBefor = controller.playerList(0).playerCards.size
        controller.getCard()
        val cardSizeAfter = controller.playerList(1).playerCards.size
        cardSizeAfter should be(cardSizeBefor + 1)
      }
      "a Player put a Card into Playstack" in {
        val cardSizeBefor = controller.playerList(0).playerCards.size
        controller.removeCard(0)
        val cardSizeAfter = controller.playerList(1).playerCards.size
        cardSizeAfter should be(cardSizeBefor - 1)
      }
    }
  }
  "A 2nd Controller" when {
    "new" should {
      var gameStatus: GameStatus = IDLE
      var playername1 = "Konstantin"
      var playername2 = "Soni"
      val controller = new controller()
      val observer = new Observer {
        var updated: Boolean = false

        def isUpdated: Boolean = updated

        override def update: Boolean = {
          true
        }
      }
      var stackCard = Stack(List(new Card("", ""))).initStack()
      var playStack2 = controller.initPlayStack()
      var playerList = controller.createPlayer()

      "a Player undo" in {
        controller.removeCard(0)
        val cardSizeBefor = controller.playerList(0).playerCards.size
        controller.undoGet
        val cardSizeAfter = controller.playerList(0).playerCards.size
        cardSizeAfter should be(cardSizeBefor)
      }
      "a Player redo" in {
        controller.removeCard(0)
        val cardSizeBefor = controller.playerList(0).playerCards.size
        controller.redoGet
        val cardSizeAfter = controller.playerList(1).playerCards.size
        cardSizeAfter should be(cardSizeBefor-1)
      }
    }
  }
  "A 3d Controller" when {
    "new" should {
      var gameStatus: GameStatus = IDLE
      var playername1 = "Konstantin"
      var playername2 = "Soni"
      val controller = new controller()
      val observer = new Observer {
        var updated: Boolean = false

        def isUpdated: Boolean = updated

        override def update: Boolean = {
          true
        }
      }
      var stackCard = Stack(List(new Card("", ""))).initStack()
      stackCard = stackCard.reversePullCards(List(Card("", "black")))
      println(stackCard)
      //var playStack2 = controller.initStack()
      var playerList = controller.createPlayer()

      "a playerstack" in {
        var playStack2 = controller.initPlayStack()
        var color = playStack2(0).color
        color shouldNot be("black")
      }
    }
  }
}