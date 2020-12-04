package UNO.controller

import UNO.UnoGame.controller
import UNO.model.Card
import UNO.util.UndoManager
import org.scalatest.{Matchers, WordSpec}

class removeCommandSpec extends WordSpec with Matchers {
  "SetCommand" should {
    val undoManager = new UndoManager
    println(controller.playStack2) //1
    "doStep" in {
      undoManager.doStep(new RemoveCommand(0, controller))
      undoManager.doStep(new RemoveCommand(0,controller))
      controller.notifyObservers()
      controller.playStack2.size should be(3)
    }
    "undoStep" in {
      println(controller.playStack2)
      undoManager.undoStep
      controller.notifyObservers()
      controller.playStack2.size should be(2)
    }
  }
}