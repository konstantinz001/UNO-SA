package UNO.controller

import UNO.UnoGame.controller
import UNO.model.cardComponent.cardBaseImp.Card
import UNO.util.UndoManager
import org.scalatest.{Matchers, WordSpec}

class removeCommandSpec extends WordSpec with Matchers {
  "RemoveCommand" should {
    val undoManager = new UndoManager
    "doStep" in {
      undoManager.doStep(new RemoveCommand(0, controller))
      //controller.notifyObservers()
      controller.playStack2.size should be(2)
    }
    "undoStep" in {
      undoManager.undoStep
      //controller.notifyObservers()
      controller.playStack2.size should be(1)
    }
    "redoStep" in {
      undoManager.redoStep
      //controller.notifyObservers()
      controller.playStack2.size should be(2)
    }

  }
}