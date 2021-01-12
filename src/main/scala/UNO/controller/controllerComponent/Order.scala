package UNO.controller.controllerComponent

import com.google.inject.Inject

class Order @Inject() (controller: controllerInterface){
  def handleOrder: Unit = {
    controller.createPlayer()
    controller.initPlayStack()
    controller.startHand()


  }
}
