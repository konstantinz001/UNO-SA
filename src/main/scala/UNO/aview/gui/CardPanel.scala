
package UNO.aview.gui

import UNO.controller.controller
import UNO.model.Card

import scala.swing.{Color, FlowPanel}

class CardPanel(list:Card,controller:controller) extends FlowPanel{
  val bluecolor = new Color(0,0,255)
  val redcolor = new Color(255,0,0)
  val greencolor = new Color(0,255,0)
  val yellowcolor = new Color(255,255,0)

/*  def mycard():List[Card] = {
    list match{
      case 0 => controller.playerList(0).playerCards
      case 1 => controller.playerList(1).playerCards
    }
  }*/





}

