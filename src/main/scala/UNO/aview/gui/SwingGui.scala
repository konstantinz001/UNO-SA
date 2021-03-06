package UNO.aview.gui

import UNO.controller.controllerComponent.controllerBaseImp._
import UNO.controller.controllerComponent.controllerInterface
import java.awt.{Color, Graphics, GraphicsEnvironment, Image, Toolkit}
import java.io.File
import javax.imageio.ImageIO
import javax.swing.{ImageIcon, JComponent, JLabel, SwingConstants}
import scala.swing.BorderPanel.Position
import scala.swing.*
import scala.swing.Swing.LineBorder
import scala.swing.event.{ButtonClicked, Key}


class SwingGui(controller: controllerInterface) extends Frame :
  listenTo(controller)
  title = " UNO Game"
  peer.setPreferredSize(new Dimension(Toolkit.getDefaultToolkit().getScreenSize()))
  peer.setResizable(false)
  peer.setUndecorated(true);
  peer.validate()

  def gamePanel: GridPanel = new GridPanel(5, 1) :

    contents += new GridPanel(1, controller.playerList(1).playerCards.size +1) :
      border = LineBorder(java.awt.Color.decode("#003366"), 10)
      background = java.awt.Color.decode("#003366")

      for (i <- (1 to controller.playerList(1).playerCards.length))
        val cardPanel =  CardPanel(1, i - 1, controller)
        cardPanel.border = LineBorder(java.awt.Color.decode("#003366"), 10)
        contents += cardPanel.card


    contents += new GridPanel(1, 4) :
      border = LineBorder(java.awt.Color.decode("#003366"), 10)
      background = java.awt.Color.decode("#003366")
      val cardStack =  CardPanel(4, 0, controller)
      contents += cardStack.card
      val playStack =  CardPanel(3, 0, controller)
      contents += playStack.card
      val unoCall = new Button()
      unoCall.icon = scaledImageIcon("Pics" + File.separator + "UNO-Button.png", 100, 100)
      unoCall.background = java.awt.Color.decode("#003366")
      unoCall.border = LineBorder(java.awt.Color.decode("#003366"), 10)
      unoCall.horizontalAlignment = Alignment.Right
      contents += unoCall
      listenTo(unoCall)
      reactions += {
        case ButtonClicked(`unoCall`) =>
          if controller.unoCall then
            unoCall.icon = scaledImageIcon("Pics" + File.separator + "UNO-Button.png", 100, 100)
            controller.unoCall = false
          else
            controller.unoCall = true
            unoCall.icon = scaledImageIcon("Pics" + File.separator + "CallUno.png", 100, 100)
      }


    contents += new GridPanel(1, controller.playerList.head.playerCards.size + 1):
      border = LineBorder(java.awt.Color.decode("#003366"), 10)
      background = java.awt.Color.decode("#003366")
      var cards: List[BoxPanel] = List.empty
      for (i <- (1 to controller.playerList.head.playerCards.length))
        val cardPanel =  CardPanel(0, i - 1, controller)
        cards = cardPanel.card :: cards
      cards.map(x => x.visible = false)

      val showButton = new Button()
      showButton.background = java.awt.Color.decode("#003366")
      showButton.border = LineBorder(java.awt.Color.decode("#003366"), 10)
      showButton.icon = scaledImageIcon("Pics" + File.separator + "Show.png", 100, 100)
      showButton.horizontalAlignment = Alignment.Right

      listenTo(showButton)
      reactions += {
        case ButtonClicked(`showButton`) =>
          if cards.head.visible then
            cards.map(x => x.visible = false)
            showButton.icon = scaledImageIcon("Pics" + File.separator +"Show.png", 100, 100)
          else if !cards.head.visible then
            cards.map(x => x.visible = true)
            showButton.icon = scaledImageIcon("Pics" + File.separator +"NotShow.png", 100, 100)
      }
      contents ++= cards.reverse
      contents += showButton

    contents += new GridPanel(1, 4):
      border = LineBorder(java.awt.Color.decode("#003366"), 10)
      background = java.awt.Color.decode("#003366")

      val buttonGroup = new ButtonGroup
      val red = new RadioButton("")
      red.background = java.awt.Color.decode("#003366")
      red.icon = scaledImageIcon("Pics" + File.separator +"Red_Radio.png", 70, 70)
      val blue = new RadioButton("")
      blue.background = java.awt.Color.decode("#003366")
      blue.icon = scaledImageIcon("Pics" + File.separator +"Blue_Radio.png", 70, 70)
      val green = new RadioButton("")
      green.background = java.awt.Color.decode("#003366")
      green.icon = scaledImageIcon("Pics" + File.separator +"Green_Radio.png", 70, 70)
      val yellow = new RadioButton("")
      yellow.background = java.awt.Color.decode("#003366")
      yellow.icon = scaledImageIcon("Pics" + File.separator +"Yellow_Radio.png", 70, 70)
      buttonGroup.buttons ++= List(red, blue, green, yellow)
      buttonGroup.select(red)
      contents ++= List(red, blue, green, yellow)
      listenTo(red, green, blue, green, yellow)
      reactions += {
        case ButtonClicked(`yellow`) =>
          if controller.colorSet == "yellow" then
            controller.colorSet = ""
            yellow.icon = scaledImageIcon("Pics" + File.separator +"Yellow_Radio.png", 70, 70)
          else
            controller.colorSet = "yellow"
            yellow.icon = scaledImageIcon("Pics" + File.separator +"Yellow_Radio_Selected.png", 70, 100)
            red.icon = scaledImageIcon("Pics" + File.separator +"Red_Radio.png", 70, 70)
            blue.icon = scaledImageIcon("Pics" + File.separator +"Blue_Radio.png", 70, 70)
            green.icon = scaledImageIcon("Pics" + File.separator +"Green_Radio.png", 70, 70)

        case ButtonClicked(`red`) =>
          if controller.colorSet == "red" then
            controller.colorSet = ""
            red.icon = scaledImageIcon("Pics" + File.separator +"Red_Radio.png", 70, 70)
          else
            controller.colorSet = "red"
            red.icon = scaledImageIcon("Pics" + File.separator +"Red_Radio_Selected.png", 70, 100)
            blue.icon = scaledImageIcon("Pics" + File.separator +"Blue_Radio.png", 70, 70)
            green.icon = scaledImageIcon("Pics" + File.separator +"Green_Radio.png", 70, 70)
            yellow.icon = scaledImageIcon("Pics" + File.separator +"Yellow_Radio.png", 70, 70)

        case ButtonClicked(`blue`) =>
          if controller.colorSet == "blue" then
            controller.colorSet = ""
            blue.icon = scaledImageIcon("Pics" + File.separator +"Blue_Radio.png", 70, 70)
          else
            controller.colorSet = "blue"
            blue.icon = scaledImageIcon("Pics" + File.separator +"Blue_Radio_Selected.png", 70, 100)
            red.icon = scaledImageIcon("Pics" + File.separator +"Red_Radio.png", 70, 70)
            green.icon = scaledImageIcon("Pics" + File.separator +"Green_Radio.png", 70, 70)
            yellow.icon = scaledImageIcon("Pics" + File.separator +"Yellow_Radio.png", 70, 70)

        case ButtonClicked(`green`) =>
          if controller.colorSet == "green" then
            controller.colorSet = ""
            green.icon = scaledImageIcon("Pics" + File.separator +"Green_Radio.png", 70, 70)
          else
            controller.colorSet = "green"
            green.icon = scaledImageIcon("Pics" + File.separator +"Green_Radio_Selected.png", 70, 100)
            red.icon = scaledImageIcon("Pics" + File.separator +"Red_Radio.png", 70, 70)
            blue.icon = scaledImageIcon("Pics" + File.separator +"Blue_Radio.png", 70, 70)
            yellow.icon = scaledImageIcon("Pics" + File.separator +"Yellow_Radio.png", 70, 70)
      }
    contents += new GridPanel(2, 1):
      background = java.awt.Color.decode("#003366")
      val label: Label = new Label:
        icon = scaledImageIcon("Pics" + File.separator +"Player" + controller.playerList.head.name +".png", 180, 70)
      label.horizontalAlignment = Alignment.Center
      contents += label

    menuBar = new MenuBar:
      contents += new Menu("File"):
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
        contents += new MenuItem(Action("Save in DB") {
          controller.saveInDb()
        })
        contents += new MenuItem(Action("Load from DB") {
          controller.loadFromDB()
        })
        contents += new MenuItem(Action("Quit") {
          System.exit(0)
        })

      contents += new Menu("Edit"):
        mnemonic = Key.E
        contents += new MenuItem(Action("Undo") {
          controller.undoGet
        })
        contents += new MenuItem(Action("Redo") {
          controller.redoGet
        })
      contents += new Menu("Info"):
        mnemonic = Key.V
        contents += new MenuItem(Action("Gamerule") {
        })

  contents = new BorderPanel:
    add(welcomePanel, Position.Center)

  def endGamePanel: GridPanel = new GridPanel(2, 1):

    contents += new GridPanel(2, 1):
      border = LineBorder(java.awt.Color.decode("#003366"), 50)
      background = java.awt.Color.decode("#003366")

      val winLabel = new Label("PLAYER " + controller.playerList.head.name.toUpperCase + ": YOU ARE WINNING!")
      winLabel.foreground = java.awt.Color.WHITE
      winLabel.font = new Font("Comic Sans MS", java.awt.Font.BOLD, 50)
      val againLabel = new Label("Play Again?")
      againLabel.foreground = java.awt.Color.WHITE
      againLabel.font = new Font("Comic Sans MS", java.awt.Font.BOLD, 20)
      contents += winLabel
      contents += againLabel

    contents += new GridPanel(1, 2):
      border = LineBorder(java.awt.Color.decode("#003366"), 50)
      background = java.awt.Color.decode("#003366")

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

  def welcomePanel = new GridPanel(2, 1):

    contents += new GridPanel(1, 1):
      border = LineBorder(java.awt.Color.decode("#003366"), 150)
      background = java.awt.Color.decode("#003366")

      val WelcomeLabel = new Label("Welcome to UNO!")
      WelcomeLabel.foreground = java.awt.Color.WHITE
      WelcomeLabel.font = new Font("Comic Sans MS", java.awt.Font.BOLD, 120)
      contents += WelcomeLabel

    contents += new GridPanel(1, 4):
      border = LineBorder(java.awt.Color.decode("#003366"), 150)
      background = java.awt.Color.decode("#003366")

      val enterButton = new Button()
      enterButton.background = java.awt.Color.decode("#003366")
      enterButton.border = LineBorder(java.awt.Color.decode("#003366"), 10)
      enterButton.icon = scaledImageIcon("Pics" + File.separator +"Enter.png", 70, 70)

      val exitButton = new Button()
      exitButton.background = java.awt.Color.decode("#003366")
      exitButton.border = LineBorder(java.awt.Color.decode("#003366"), 10)
      exitButton.icon = scaledImageIcon("Pics" + File.separator +"Exit.png", 70, 70)

      contents += enterButton
      contents += new Label()
      contents += new Label()
      contents += exitButton

      listenTo(enterButton, exitButton)
      reactions += {
        case ButtonClicked(`enterButton`) =>
          redrawGame
        case ButtonClicked(`exitButton`) =>
          System.exit(0)
      }

  def instructionPanel(labelMessage: String) = new GridPanel(1, 1):

    contents += new GridPanel(1, 1):
      border = LineBorder(java.awt.Color.decode("#003366"), 150)
      background = java.awt.Color.decode("#003366")

      val WelcomeLabel = new Label(labelMessage)
      WelcomeLabel.foreground = java.awt.Color.WHITE
      WelcomeLabel.font = new Font("Comic Sans MS", java.awt.Font.BOLD, 25)

      val okButton = new Button()
      okButton.background = java.awt.Color.decode("#003366")
      okButton.border = LineBorder(java.awt.Color.decode("#003366"), 10)
      okButton.icon = scaledImageIcon("Pics" + File.separator +"OKAY.png", 70, 70)

      contents += WelcomeLabel
      contents += okButton

      listenTo(okButton)
      reactions += {
        case ButtonClicked(`okButton`) =>
          redrawGame
      }

  def redrawGame: Unit =
    contents = new BorderPanel:
      add(gamePanel, BorderPanel.Position.Center)

  def redrawWinning: Unit =
    contents = new BorderPanel:
      add(endGamePanel, BorderPanel.Position.Center)

  def redrawMessageLoad: Unit =
    contents = new BorderPanel:
      add(instructionPanel("Your Gamestate was loaded!"), BorderPanel.Position.Center)

  def redrawMessageSave: Unit =
    contents = new BorderPanel:
      add(instructionPanel("Your Gamestate was saved!"), BorderPanel.Position.Center)

  def redrawMessageUndo: Unit =
    contents = new BorderPanel:
      add(instructionPanel("You have undo your last move!"), BorderPanel.Position.Center)

  def redrawMessageRedo: Unit =
    contents = new BorderPanel:
      add(instructionPanel("You have redo your last move!"), BorderPanel.Position.Center)

  def redrawFailure: Unit =
    contents = new BorderPanel:
      add(instructionPanel("Your Instruction could not served!"), BorderPanel.Position.Center)

  def redrawNewGame: Unit =
    contents = new BorderPanel:
      add(instructionPanel("New Game is loading..."), BorderPanel.Position.Center)

  reactions += {
    case event: updateStates => redrawGame
    case event: saveStates => redrawMessageSave
    case event: loadStates => redrawMessageLoad
    case event: undoStates => redrawMessageUndo
    case event: redoStates => redrawMessageRedo
    case event: endStates => redrawWinning
    case event: failureStates => redrawFailure
    case event: newgameStates =>redrawNewGame
  }

  visible = true