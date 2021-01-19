package controller

import UNO.UnoGame.controller
import UNO.controller.controllerComponent.controllerBaseImp.SetCommand
import UNO.model.cardComponent.cardBaseImp.Card
import UNO.model.stackComponent.stackBaseImp.Stack
import UNO.util.UndoManager
import org.scalatest.{Matchers, WordSpec}

class SetCommandSpec extends WordSpec with Matchers {
  "SetCommand" should {

    val undoManager = new UndoManager
    //To have no Problems with Random-Cards, init Stackcards.
    controller.stackCard = Stack(List(Card("",""))).initStack()
    "doStep" in {
      //After SetCommand there are should be 107 -1 Cards. We get a Card from Stack into Handcards.
      undoManager.doStep(new SetCommand( controller))
      controller.stackCard.stackCards.size should be(106)
    }
    "undoStep" in {
      undoManager.undoStep
      //Do the UndoStep = Again 107
      controller.stackCard.stackCards.size should be(107)
    }
    "redoStep" in {
      undoManager.redoStep
      //Do the RedoStep = Again 106
      controller.stackCard.stackCards.size should be(106)
    }
  }
}
