package UNO.controller

import UNO.UnoGame.controller
import UNO.controller.controllerComponent.controllerBaseImp.SetCommand
import UNO.util.UndoManager
import org.scalatest.{Matchers, WordSpec}

class SetCommandSpec extends WordSpec with Matchers {
  "SetCommand" should {
    val undoManager = new UndoManager
    //controller.playerList = List(controller.createPlayer("Konstantin"), controller.createPlayer("Konstantin"))
    "doStep" in {
      undoManager.doStep(new SetCommand( controller))
      //controller.notifyObservers()
      controller.stackCard.stackCards.size should be(73)  //108 - Playercards(7 Cards) multiply with 2
    }
    "undoStep" in {
      undoManager.undoStep
      //controller.notifyObservers()
      controller.stackCard.stackCards.size should be(74)
    }
    "redoStep" in {
      undoManager.redoStep
      //controller.notifyObservers()
      controller.stackCard.stackCards.size should be(73)
    }
  }
}
