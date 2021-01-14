package UNO.aview.gui

import UNO.controller.controllerComponent.controllerInterface

import scala.swing.BorderPanel.Position
import scala.swing.{Action, BorderPanel, Button, Dimension, Font, Frame, GridPanel, Label, Menu, MenuBar, MenuItem, TextField}
import scala.swing.Swing.LineBorder
import scala.swing.event.{ButtonClicked, Key}

class NameGui(controller: controllerInterface) extends  Frame{

  listenTo(controller)
  title = "UNO Game"
  peer.setPreferredSize(new Dimension(1200, 900))
  peer.setResizable(true)
  peer.setBackground(java.awt.Color.DARK_GRAY)

  def namePanel = new GridPanel(2, 1) {

    contents += new GridPanel(1, 1) {
      border = LineBorder(java.awt.Color.DARK_GRAY, 50)
      background = java.awt.Color.DARK_GRAY

      val WelcomeLabel = new Label("Welcome to UNO!")
      WelcomeLabel.foreground = java.awt.Color.WHITE
      WelcomeLabel.font = new Font("Arial Black", java.awt.Font.BOLD, 50)
      contents += WelcomeLabel
    }

    contents += new GridPanel(3, 2) {
      border = LineBorder(java.awt.Color.DARK_GRAY, 50)
      background = java.awt.Color.DARK_GRAY

      val player1Label = new Label("Player1")
      player1Label.foreground = java.awt.Color.WHITE
      player1Label.font = new Font("Arial Black", java.awt.Font.BOLD, 20)
      val player1tf = new TextField()
      player1tf.background = java.awt.Color.LIGHT_GRAY
      player1tf.foreground = java.awt.Color.WHITE
      player1tf.font = new Font("Arial Black", java.awt.Font.BOLD, 20)
      val player2Label = new Label("Player2")
      player2Label.foreground = java.awt.Color.WHITE
      player2Label.font = new Font("Arial Black", java.awt.Font.BOLD, 20)
      val player2tf = new TextField()
      player2tf.background = java.awt.Color.LIGHT_GRAY
      player2tf.foreground = java.awt.Color.WHITE
      player2tf.font = new Font("Arial Black", java.awt.Font.BOLD, 20)
      val enterButton = new Button("Enter")
      val exitButton = new Button("Exit")
      contents += player1Label
      contents += player1tf
      contents += player2Label
      contents += player2tf
      contents += enterButton
      contents += exitButton

      listenTo(enterButton, exitButton)
      reactions += {
        case ButtonClicked(`enterButton`) => {
          controller.playername1 = player1tf.text
          controller.playername2 = player2tf.text
          println(controller.playername1)
          println(controller.playername2)
          close()
        }
        case ButtonClicked(`exitButton`) => {
          System.exit(0)
        }
      }
    }
  }

  contents = new BorderPanel {
    add(namePanel, Position.Center)
  }

  def redraw = {
    contents = new BorderPanel {
      add(namePanel, BorderPanel.Position.Center)
    }
  }

  visible = true
  redraw
}