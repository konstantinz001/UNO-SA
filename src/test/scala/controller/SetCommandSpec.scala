package controller

import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.should.Matchers
import UNO.UnoGame.Controller
import UNO.UnoGameModule
import UNO.controller.controllerComponent.controllerBaseImp.SetCommand
import UNO.controller.controllerComponent.controllerInterface
import UNO.model.cardComponent.cardBaseImp.Card
import UNO.model.stackComponent.stackBaseImp.Stack
import UNO.util.UndoManager
import com.google.inject.Guice

class SetCommandSpec extends AnyWordSpec with Matchers {
  val controller = Guice.createInjector(new UnoGameModule).getInstance(classOf[controllerInterface])
  val undoManager = new UndoManager
  //To have no Problems with Random-Cards, init Stackcards.
  controller.stackCard = Stack(List(Card("",""))).initStack()
  "SetCommand" should {
    "doStep" in {
      //After SetCommand there are should be 108 -1 Cards. We get a Card from Stack into Handcards.
      undoManager.doStep(new SetCommand(controller))
      controller.stackCard.stackCards.size should be(107)
    }
    "undoStep" in {
      undoManager.undoStep()
      //Do the UndoStep = Again 108
      controller.stackCard.stackCards.size should be(108)
    }
    "redoStep" in {
      undoManager.redoStep()
      //Do the RedoStep = Again 106
      controller.stackCard.stackCards.size should be(107)
    }
  }
}
