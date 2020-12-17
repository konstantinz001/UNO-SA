package UNO.aview.gui

import UNO.controller.controller

import scala.swing.Swing.LineBorder
import scala.swing.event.{Key, KeyPressed}
import scala.swing.{BoxPanel, Button, Frame, Orientation, TextField}
import scala.swing._

class SwingGui(controller: controller) extends Frame {

  listenTo(controller)

  title = " UNO Game"
  contents = new FlowPanel{
    contents += new Label{
      text = "this"
    }
  }

  def gamepanel = new GridPanel(3,1) {
    border = LineBorder(java.awt.Color.WHITE, 20)
    background = java.awt.Color.WHITE
  }




  contents = new Button("Click Me!")
  def welcomePanel: BoxPanel = new BoxPanel(Orientation.Vertical) {
    centerOnScreen()

    val playerNameTextField: TextField = new TextField() {
      listenTo(keys)
      reactions += {
        case KeyPressed(_, Key.Enter, _, _) => controller.createPlayer()
      }
    }
  }
  visible = true

}
