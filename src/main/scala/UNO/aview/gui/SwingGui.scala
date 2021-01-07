package UNO.aview.gui

import UNO.controller.controllerComponent.controllerBaseImp.{controller, updateStates}
import UNO.controller.controllerComponent.controllerInterface

import java.awt.{Image}
import javax.swing.ImageIcon
import scala.swing.BorderPanel.Position
import scala.swing._
import scala.swing.Swing.LineBorder
import scala.swing.event.ButtonClicked

class SwingGui(controller: controllerInterface) extends Frame {

  listenTo(controller)
  title = " UNO Game"
  peer.setPreferredSize(new Dimension(1200, 900))
  peer.setResizable(true)




  def gamePanel = new GridPanel(5, 1) {


    contents += new GridPanel(1, controller.playerList(1).playerCards.size) {
      border = LineBorder(java.awt.Color.DARK_GRAY,50)
      background = java.awt.Color.DARK_GRAY

      for (i <- 1 to controller.playerList(1).playerCards.length) {

        val cardPanel = new CardPanel(1, i - 1, controller)
        contents += cardPanel.card
      }

    }


    contents += new GridPanel(1, 4) {
      border = LineBorder(java.awt.Color.DARK_GRAY, 50)
      background = java.awt.Color.DARK_GRAY
      val cardStack = new CardPanel(4, 0, controller)
      contents += cardStack.card
      val playStack = new CardPanel(3, 0, controller)
      contents += playStack.card
      val unoCall = new Button("")
      unoCall.background = java.awt.Color.DARK_GRAY
      unoCall.icon = scaledImageIcon("src\\main\\Pics\\UNO-Button.png", 110, 100)
      contents += unoCall
      listenTo(unoCall)
      reactions += {
        case ButtonClicked(`unoCall`) =>
          controller.unoCall = true
          unoCall.background = java.awt.Color.RED
      }
    }

    contents += new GridPanel(1, controller.playerList(0).playerCards.size) {
      border = LineBorder(java.awt.Color.DARK_GRAY, 50)
      background = java.awt.Color.DARK_GRAY

      for (i <- 1 to controller.playerList(0).playerCards.length) {

        val cardPanel = new CardPanel(0, i - 1, controller)
        contents += cardPanel.card
      }
    }

  contents += new GridPanel(1, 4) {
    border = LineBorder(java.awt.Color.DARK_GRAY, 50)
    background = java.awt.Color.DARK_GRAY

    val buttonGroup = new ButtonGroup
    val red = new RadioButton("")
    red.background = java.awt.Color.DARK_GRAY
    red.icon = scaledImageIcon("src\\main\\Pics\\Red_Radio.png", 110, 100)
    val blue = new RadioButton("")
    blue.background = java.awt.Color.DARK_GRAY
    blue.icon = scaledImageIcon("src\\main\\Pics\\Blue_Radio.png", 110, 100)
    val green = new RadioButton("")
    green.background = java.awt.Color.DARK_GRAY
    green.icon = scaledImageIcon("src\\main\\Pics\\Green_Radio.png", 110, 100)
    val yellow = new RadioButton("")
    yellow.background = java.awt.Color.DARK_GRAY
    yellow.icon = scaledImageIcon("src\\main\\Pics\\Yellow_Radio.png", 110, 100)
    buttonGroup.buttons ++= List(red,blue,green,yellow)
    buttonGroup.select(red)
    contents ++= List(red,blue,green,yellow)
    listenTo(red,green,blue,green,yellow)
    reactions += {
      case ButtonClicked(`yellow`) => {
        controller.colorSet = "yellow"
        yellow.background = java.awt.Color.YELLOW
      }
      case ButtonClicked(`red`) => {
        controller.colorSet = "red"
        red.background = java.awt.Color.RED
      }
      case ButtonClicked(`blue`) => {
        controller.colorSet = "blue"
        blue.background = java.awt.Color.BLUE
      }
      case ButtonClicked(`green`) => {
        controller.colorSet = "green"
        green.background = java.awt.Color.GREEN
      }
    }
  }
    contents += new GridPanel(2, 1) {
      border = LineBorder(java.awt.Color.DARK_GRAY, 50)
      background = java.awt.Color.DARK_GRAY
      val showButton = new Button ("Show me my Cards!")
      val label = new Label {
        text = "Player: " + controller.playerList(0).name
        font = new Font("Arial Black", java.awt.Font.BOLD, 20)
        foreground = java.awt.Color.WHITE
      }

      contents += label
    }
}
  contents = new BorderPanel {
    add(gamePanel, Position.Center)
  }

  def redraw = {
    contents = new BorderPanel {
      add(gamePanel, BorderPanel.Position.Center)
    }
  }



  reactions += {
    case event: updateStates => redraw

  }

  visible = true
  redraw

  def scaledImageIcon(path: String, width: Int, height: Int): ImageIcon = {
    val orig = new ImageIcon(path)
    val scaledImage = orig.getImage.getScaledInstance(width, height, Image.SCALE_REPLICATE)
    new ImageIcon(scaledImage)
  }


}
