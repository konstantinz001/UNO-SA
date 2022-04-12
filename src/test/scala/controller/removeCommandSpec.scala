package controller

import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.should.Matchers
import UNO.UnoGame.Controller
import UNO.UnoGameModule
import UNO.controller.controllerComponent.controllerBaseImp.RemoveCommand
import UNO.controller.controllerComponent.controllerInterface
import UnoCards.cardBaseImp.Card
import UnoStack.stackBaseImp.Stack
import UNO.util.UndoManager
import com.google.inject.Guice

class removeCommandSpec extends AnyWordSpec with Matchers {
  val undoManager = new UndoManager
  val controller = Guice.createInjector(new UnoGameModule).getInstance(classOf[controllerInterface])
  controller.playStack2 = List(Card("",""))
  "RemoveCommand" should {
    "doStep" in {
      undoManager.doStep(new RemoveCommand(0, controller))
      controller.playStack2.size should be(2)
    }
    "undoStep" in {
      undoManager.undoStep()
      controller.playStack2.size should be(1)
    }
    "redoStep" in {
      undoManager.redoStep()
      controller.playStack2.size should be(2)
    }

  }
}