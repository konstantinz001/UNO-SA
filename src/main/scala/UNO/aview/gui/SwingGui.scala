package UNO.aview.gui

import UNO.controller.controllerComponent.controllerBaseImp.{endStates, updateStates}
import UNO.controller.controllerComponent.controllerInterface

import java.awt.Image
import javax.swing.ImageIcon
import scala.swing.BorderPanel.Position
import scala.swing._
import scala.swing.Swing.LineBorder
import scala.swing.event.{ButtonClicked, Key}

class SwingGui(controller: controllerInterface) extends Frame {

  listenTo(controller)
  title = " UNO Game"
  peer.setPreferredSize(new Dimension(1200, 900))
  peer.setResizable(true)
  peer.setBackground(java.awt.Color.DARK_GRAY)

  def gamePanel: GridPanel = new GridPanel(5, 1) {

    contents += new GridPanel(1, controller.playerList(1).playerCards.size) {
      border = LineBorder(java.awt.Color.DARK_GRAY, 50)
      background = java.awt.Color.DARK_GRAY

      (1 to controller.playerList(1).playerCards.length).foreach(i => {
        val cardPanel = new CardPanel(1, i - 1, controller)
        contents += cardPanel.card
      })
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
          if (controller.unoCall) {
            unoCall.background = java.awt.Color.DARK_GRAY
            controller.unoCall = false
          }else {
            controller.unoCall = true
            unoCall.background = java.awt.Color.RED
          }
      }
    }


    contents += new GridPanel(1, controller.playerList.head.playerCards.size+1) {
      border = LineBorder(java.awt.Color.DARK_GRAY, 50)
      background = java.awt.Color.DARK_GRAY

      var cards: List[BoxPanel]  = List.empty
      (1 to controller.playerList.head.playerCards.length).foreach(i => {
        val cardPanel = new CardPanel(0, i - 1, controller)
        cards = cardPanel.card :: cards
      })

      cards.map(x=> x.visible = false)

      val showButton = new Button("Show Cards!")
      listenTo(showButton)
      reactions += {
        case ButtonClicked(`showButton`) =>
          if (cards.head.visible)
            cards.map(x => x.visible = false)
          else if (!cards.head.visible)
            cards.map(x => x.visible = true)
      }
      contents ++= cards.reverse
      contents += showButton
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
      buttonGroup.buttons ++= List(red, blue, green, yellow)
      buttonGroup.select(red)
      contents ++= List(red, blue, green, yellow)
      listenTo(red, green, blue, green, yellow)
      reactions += {
        case ButtonClicked(`yellow`) =>
          controller.colorSet = "yellow"
          yellow.background = java.awt.Color.YELLOW
          reactions += {
            case ButtonClicked(`yellow`) =>
              if (controller.colorSet == "yellow") {
                controller.colorSet = ""
                yellow.background = java.awt.Color.DARK_GRAY
              } else {
                controller.colorSet = "yellow"
                yellow.background = java.awt.Color.YELLOW
                red.background = java.awt.Color.DARK_GRAY
                blue.background = java.awt.Color.DARK_GRAY
                green.background = java.awt.Color.DARK_GRAY
              }
          }
        case ButtonClicked(`red`) =>
          if (controller.colorSet == "red") {
            controller.colorSet = ""
            red.background = java.awt.Color.DARK_GRAY
          } else {
            controller.colorSet = "red"
            red.background = java.awt.Color.RED
            blue.background = java.awt.Color.DARK_GRAY
            green.background = java.awt.Color.DARK_GRAY
            yellow.background = java.awt.Color.DARK_GRAY
          }
        case ButtonClicked(`blue`) =>
          if (controller.colorSet == "blue") {
            controller.colorSet = ""
            blue.background = java.awt.Color.DARK_GRAY
          } else {
            controller.colorSet = "blue"
            blue.background = java.awt.Color.BLUE
            red.background = java.awt.Color.DARK_GRAY
            green.background = java.awt.Color.DARK_GRAY
            yellow.background = java.awt.Color.DARK_GRAY
          }
        case ButtonClicked(`green`) =>
          if (controller.colorSet == "green") {
            controller.colorSet = ""
            green.background = java.awt.Color.DARK_GRAY
          } else {
            controller.colorSet = "green"
            green.background = java.awt.Color.GREEN
            red.background = java.awt.Color.DARK_GRAY
            blue.background = java.awt.Color.DARK_GRAY
            yellow.background = java.awt.Color.DARK_GRAY
          }
      }
    }
    contents += new GridPanel(2, 1) {
      border = LineBorder(java.awt.Color.DARK_GRAY, 50)
      background = java.awt.Color.DARK_GRAY
      val label: Label = new Label {
        text = "Player: " + controller.playerList.head.name
        font = new Font("Arial Black", java.awt.Font.BOLD, 20)
        foreground = java.awt.Color.WHITE
      }

      contents += label
    }
    menuBar = new MenuBar {
      contents += new Menu("File") {
        mnemonic = Key.F
        contents += new MenuItem(Action("New") {
          controller.setDefault()
        })
        contents += new MenuItem(Action("Save") {
          controller.save
        })
        contents += new MenuItem(Action("Load") {
          controller.load
        })
        contents += new MenuItem(Action("Quit") {
          System.exit(0)
        })
      }
      contents += new Menu("Edit") {
        mnemonic = Key.E
        contents += new MenuItem(Action("Undo") {
          controller.undoGet
        })
        contents += new MenuItem(Action("Redo") {
          controller.redoGet
        })
      }
      contents += new Menu("Info") {
        mnemonic = Key.V
        contents += new MenuItem(Action("Gamerule") {
        })
      }
    }
  }

  contents = new BorderPanel {
    add(welcomePanel, Position.Center)
  }

  def endGamePanel: GridPanel = new GridPanel(2, 1) {

    contents += new GridPanel(2, 1) {
      border = LineBorder(java.awt.Color.DARK_GRAY, 50)
      background = java.awt.Color.DARK_GRAY

      val winLabel = new Label("PLAYER " + controller.playerList.head.name.toUpperCase +": YOU ARE WINNING!")
      winLabel.foreground = java.awt.Color.WHITE
      winLabel.font = new Font("Arial Black", java.awt.Font.BOLD, 50)
      val againLabel = new Label("Play Again?")
      againLabel.foreground = java.awt.Color.WHITE
      againLabel.font = new Font("Arial Black", java.awt.Font.BOLD, 20)
      contents += winLabel
      contents += againLabel
    }

    contents += new GridPanel(1, 2) {
      border = LineBorder(java.awt.Color.DARK_GRAY, 50)
      background = java.awt.Color.DARK_GRAY

      val yesButton = new Button("YES")
      val noButton = new Button("NO")
      contents += yesButton
      contents += noButton
      listenTo(yesButton, noButton)
      reactions += {
        case ButtonClicked(`yesButton`) =>
          controller.setDefault()
        case ButtonClicked(`noButton`) =>
          System.exit(0)
      }
    }
    menuBar = new MenuBar {
      contents += new Menu("File") {
        mnemonic = Key.F
        contents += new MenuItem(Action("New") {
          controller.setDefault()
        })
        contents += new MenuItem(Action("Save") {
          controller.save
        })
        contents += new MenuItem(Action("Load") {
          controller.load
        })
        contents += new MenuItem(Action("Quit") {
          System.exit(0)
        })
      }
      contents += new Menu("Edit") {
        mnemonic = Key.E
        contents += new MenuItem(Action("Undo") {
          controller.undoGet
        })
        contents += new MenuItem(Action("Redo") {
          controller.redoGet
        })
      }
    }
  }

  def welcomePanel = new GridPanel(2, 1) {

    contents += new GridPanel(1, 1) {
      border = LineBorder(java.awt.Color.DARK_GRAY, 50)
      background = java.awt.Color.DARK_GRAY

      val WelcomeLabel = new Label("Welcome to UNO!")
      WelcomeLabel.foreground = java.awt.Color.WHITE
      WelcomeLabel.font = new Font("Arial Black", java.awt.Font.BOLD, 50)
      contents += WelcomeLabel
    }

    contents += new GridPanel(1, 2) {
      border = LineBorder(java.awt.Color.DARK_GRAY, 50)
      background = java.awt.Color.DARK_GRAY

      val enterButton = new Button("Enter")
      val exitButton = new Button("Exit")
      contents += enterButton
      contents += exitButton

      listenTo(enterButton, exitButton)
      reactions += {
        case ButtonClicked(`enterButton`) =>
          redraw
        case ButtonClicked(`exitButton`) =>
          System.exit(0)
      }
    }
  }

  def redraw:Unit = {
    contents = new BorderPanel {
      add(gamePanel, BorderPanel.Position.Center)
    }
  }

  def redraw2: Unit = {
    contents = new BorderPanel {
      add(endGamePanel, BorderPanel.Position.Center)
    }
  }
  def redraw3: Unit = {
    contents = new BorderPanel {
      add(welcomePanel, BorderPanel.Position.Center)
    }
  }

  reactions += {
    case event: updateStates => redraw
    case event: endStates => redraw2
  }

  visible = true

  def scaledImageIcon(path: String, width: Int, height: Int): ImageIcon = {
    val orig = new ImageIcon(path)
    val scaledImage = orig.getImage.getScaledInstance(width, height, Image.SCALE_REPLICATE)
    new ImageIcon(scaledImage)
  }
}