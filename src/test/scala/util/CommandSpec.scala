package util

import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.should.Matchers



class CommandSpec extends AnyWordSpec with Matchers{
  "A command" should {
    "have a do step" in {
      val command = new incrCommand
      command.state should be (0)
      command.doStep()
      command.state should be (1)
      command.doStep()
      command.state should be (2)
    }
    "have a undo steo" in {
      val command = new incrCommand
      command.state should be (0)
      command.doStep()
      command.state should be (1)
      command.undoStep()
      command.state should be (0)
    }
    "have a redo step" in {
      val command = new incrCommand
      command.state should be (0)
      command.doStep()
      command.state should be (1)
      command.undoStep()
      command.state should be (0)
      command.redoStep()
      command.state should be (1)
    }
  }
}