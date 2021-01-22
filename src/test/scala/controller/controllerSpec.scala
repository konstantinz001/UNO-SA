package controller

import UNO.UnoGame.injector
import UNO.controller.controllerComponent.controllerInterface
import UNO.model.PlayerComponent.playerBaseImp.Player
import UNO.model.cardComponent.cardBaseImp.Card
import org.scalatest.{Matchers, WordSpec}

class controllerSpec extends WordSpec with Matchers {

  val controller = injector.getInstance(classOf[controllerInterface])
  //Because Cards are Random and to Testing Methods we override the PlayList
  //and Playstack with new values
  controller.playerList = List(Player("1", List(Card("1", "green"), Card("2", "green"), Card("3", "green"), Card("4", "green"))),
    Player("2", List(Card("1", "green"), Card("2", "green"), Card("3", "green"), Card("3", "blue"))))
  controller.playStack2 = List(Card("0", "green"))
  "A Controller" should {
    "have var´s" in {
      //Testing var´s in controller
      controller.playername1 should be("1")
      controller.playername2 should be("2")
      controller.playerList.size should be(2)
      controller.playStack2.size should be(1)
      controller.colorSet should be("")
      controller.unoCall should be(false)
    }
    "have a method initPlayStack" in {
      List(controller.stackCard.getCardFromStack()) should be (controller.initPlayStack())
    }
    "have a method stackEmpty" in {
      controller.stackCard should be (controller.stackEmpty())
    }
    "have a method getCard" in {
      val cardSizeBefor = controller.playerList(0).playerCards.size
      //testing Get a Card from Stack into Handcards
      controller.getCard()
      val cardSizeAfter = controller.playerList(1).playerCards.size
      cardSizeAfter should be(cardSizeBefor + 1)
    }
    "have a method removeCard" in {
      val cardSizeBefor = controller.playerList(0).playerCards.size
      //testing remove a Card from Handcards
      controller.removeCard(0)
      val cardSizeAfter = controller.playerList(1).playerCards.size
      cardSizeAfter should be(cardSizeBefor - 1)
    }
    "have a method undoGet" in {
      val cardSizeBefor = controller.playerList(0).playerCards.size
      controller.removeCard(0)
      val cardSizeRemove = controller.playerList(1).playerCards.size
      //testing undoStep
      controller.undoGet
      val cardSizeAfter = controller.playerList(0).playerCards.size
      cardSizeAfter should be(cardSizeBefor)
      cardSizeAfter should be (cardSizeRemove + 1)
    }
    "have a method redoGet" in {
      val cardSizeBefor = controller.playerList(0).playerCards.size
      controller.removeCard(0)
      val cardSizeRemove = controller.playerList(1).playerCards.size
      //First testing undo again
      controller.undoGet
      val cardSizeUndo = controller.playerList(0).playerCards.size
      //And testing the redoStep to undo the UndoStep
      controller.redoGet
      val cardSizeAfter = controller.playerList(1).playerCards.size
      cardSizeAfter should be(cardSizeRemove)
      cardSizeAfter should be (cardSizeUndo - 1)
      cardSizeUndo should be (cardSizeBefor)
    }
  }
}