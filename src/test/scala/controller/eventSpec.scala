package controller

import UNO.UnoGame.injector
import UNO.controller.controllerComponent.controllerBaseImp.{endStates, updateStates, welcomeStates}
import org.scalatest.{Matchers, WordSpec}
import UNO.controller.controllerComponent.controllerInterface

import scala.swing.event.Event

class eventSpec extends WordSpec with Matchers with Event{

  val controller = injector.getInstance(classOf[controllerInterface])
  "A welcomeState" should {
    "have event" in {
      val event = new Event {}
      controller.publish(new welcomeStates) should be(controller.publish(event))
    }
  }
  "A updateStates" should {
    "have event" in {
      val event = new Event {}
      controller.publish(new updateStates) should be(controller.publish(event))
    }
  }
  "A endStates" should {
    "have event" in {
      val event = new Event {}
      controller.publish(new endStates) should be(controller.publish(event))
    }
  }
}
