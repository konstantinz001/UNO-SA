package controller

import UNO.UnoGame.controller
import UNO.controller.controllerComponent.controllerBaseImp.RemoveCommand
import UNO.model.cardComponent.cardBaseImp.Card
import UNO.model.stackComponent.stackBaseImp.Stack
import UNO.util.UndoManager
import org.scalatest.{Matchers, WordSpec}

class removeCommandSpec extends WordSpec with Matchers {
  val undoManager = new UndoManager
  controller.playStack2 = List(Card("",""))
  "RemoveCommand" should {
    "doStep" in {
      undoManager.doStep(new RemoveCommand(0, controller))
      controller.playStack2.size should be(2)
    }
    "undoStep" in {
      undoManager.undoStep
      controller.playStack2.size should be(1)
    }
    "redoStep" in {
      undoManager.redoStep
      controller.playStack2.size should be(2)
    }

  }
}