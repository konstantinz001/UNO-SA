package UNO.aview.gui

import UNO.controller.{controller, updateStates}

import scala.swing.BorderPanel.Position
import scala.swing.{_}
import scala.swing.Swing.{LineBorder}
import scala.swing.event.ButtonClicked

class SwingGui(controller: controller) extends Frame {

  listenTo(controller)

  title = " UNO Game"



  def gamePanel = new GridPanel(4, 1) {
    contents += new GridPanel(1, controller.playerList(1).playerCards.size) {
      border = LineBorder(java.awt.Color.lightGray,50)
      background = java.awt.Color.lightGray

      for (i <- 1 to controller.playerList(1).playerCards.length) {

        val cardPanel = new CardPanel(1, i - 1, controller)
        contents += cardPanel.card //////////////TODO
      }
    }


    contents += new GridPanel(1, 3) {
      border = LineBorder(java.awt.Color.lightGray, 50)
      background = java.awt.Color.lightGray
      val cardStack = new CardPanel(4, 0, controller)
      contents += cardStack.card
      val playStack = new CardPanel(3, 0, controller)
      contents += playStack.card
      val unoCall = new CheckBox("Call UNO!")
      contents += unoCall
      reactions += {
        case ButtonClicked(`unoCall`) =>
          controller.unoCall = true
      }
    }

    contents += new GridPanel(1, controller.playerList(0).playerCards.size) { //1 Zeile 20 Felder hinzufügen
      border = LineBorder(java.awt.Color.lightGray, 50)
      background = java.awt.Color.lightGray

      for (i <- 1 to controller.playerList(0).playerCards.length) {

        val cardPanel = new CardPanel(0, i - 1, controller)
        contents += cardPanel.card
      }
    }
    contents += new GridPanel(1, 4) {
      border = LineBorder(java.awt.Color.lightGray, 50)
      background = java.awt.Color.lightGray
      val red = new CheckBox("RED")
      red.background = java.awt.Color.red
      val blue = new CheckBox("BLUE")
      blue.background = java.awt.Color.blue
      val green = new CheckBox("GREEN")
      green.background = java.awt.Color.green
      val yellow = new CheckBox("YELLOW")
      yellow.background = java.awt.Color.yellow
      contents+= red
      contents+= blue
      contents+=green
      contents+= yellow
      listenTo(yellow,red,blue)
      reactions += {
        case ButtonClicked(`yellow`) =>
          controller.colorSet = "yellow"
        case ButtonClicked(`red`) =>
          controller.colorSet = "red"
        case ButtonClicked(`blue`) =>
          controller.colorSet = "blue"
        case ButtonClicked(`yellow`) =>
          controller.colorSet = "green"
        case default =>
          controller.colorSet = "green"
      }
    }


   /* contents += new GridPanel(1, 5) {
      border = LineBorder(java.awt.Color.lightGray, 50)
      background = java.awt.Color.lightGray

      for (i <- 1 to 4) {
        val cardPanel = new CardPanel(5, i - 1, controller)
        contents += cardPanel.card
      }
    }

    */
  }

  contents = new BorderPanel {
    add(gamePanel, Position.Center)
  }

  def redraw = {
    contents = new BorderPanel {
      add(gamePanel, BorderPanel.Position.Center)
    }
    repaint
  }



  reactions += {
    case event: updateStates => redraw

  }

  visible = true
  redraw



}
