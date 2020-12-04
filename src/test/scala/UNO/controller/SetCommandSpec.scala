package UNO.controller

import UNO.UnoGame.controller
import UNO.model.Card
import UNO.util.UndoManager
import org.scalatest.{Matchers, WordSpec}

class SetCommandSpec extends WordSpec with Matchers {
  "SetCommand" should {
    val undoManager = new UndoManager
    //controller.playerList = List(controller.createPlayer("Konstantin"), controller.createPlayer("Konstantin"))
    controller.stackCard = List(Card(1, "red"), Card(2, "green"), Card(3, "green"))
    println(controller.stackCard.size)
    println(controller.stackCard)
    "doStep" in {
      undoManager.doStep(new SetCommand( controller))
      undoManager.doStep(new SetCommand( controller))
      controller.notifyObservers()
      controller.stackCard.size should be(0)
    }
    "undoStep" in {
      undoManager.undoStep
      controller.notifyObservers()
      controller.stackCard.size should be(1)
    }
    "redoStep" in {
      undoManager.redoStep
      controller.notifyObservers()
      controller.stackCard.size should be(3)
    }
  }
}


