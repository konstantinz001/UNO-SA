package controller

import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.should.Matchers
import UNO.UnoGame.injector
import UNO.UnoGameModule
import UNO.controller.controllerComponent.controllerBaseImp.{endStates, updateStates, welcomeStates}
import UNO.controller.controllerComponent.controllerInterface
import com.google.inject.Guice

import scala.swing.event.Event

class eventSpec extends AnyWordSpec with Matchers with Event{

  val controller = Guice.createInjector(new UnoGameModule).getInstance(classOf[controllerInterface])
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
