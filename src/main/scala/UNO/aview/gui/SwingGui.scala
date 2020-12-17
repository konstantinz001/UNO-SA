package UNO.aview.gui

import UNO.controller.{controller,playerhandChanged,playerturnChanged,playfieldChanged,playstackChanged,blackCard}

import javax.swing.SwingConstants

import scala.swing.BorderPanel.Position
import scala.swing._
import scala.swing.event.Key
import scala.swing.Swing.LineBorder

class SwingGui(controller: controller) extends Frame {

  listenTo(controller)

  title = " UNO Game"



  def gamePanel = new GridPanel(3, 1) {
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
    }




    contents += new GridPanel(1, controller.playerList(0).playerCards.size) { //1 Zeile 20 Felder hinzufügen
      border = LineBorder(java.awt.Color.lightGray, 50)
      background = java.awt.Color.lightGray

      for (i <- 1 to controller.playerList(0).playerCards.length) {

        val cardPanel = new CardPanel(0, i - 1, controller)
        contents += cardPanel.card
      }
    }
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
    case event: playerhandChanged => redraw
    case event: playerturnChanged => redraw
    case event: playfieldChanged => redraw
    case event: playstackChanged => redraw
    case event: blackCard => redraw
  }

  visible = true
  redraw



}
