
package UNO.aview.gui

import UNO.UnoGame.controller
import UNO.controller.controller
import UNO.model.Card
import UNO.util.{State, Strategy, forgotCallUnoEvent, removeCardEvent, removeFalseCardEvent, removePlayerCardEvent}

import java.awt
import javax.swing.GroupLayout.Alignment
import scala.swing
import scala.swing.BorderPanel.Position
import scala.swing.Swing.LineBorder
import scala.swing._
import scala.swing.event.MouseClicked
import scala.swing.{BoxPanel, Button, Color, FlowPanel, Font, Label, Orientation}

class CardPanel(list:Int, index: Int ,controller:controller) extends FlowPanel{
  val bluecolor = new Color(0,0,255)
  val redcolor = new Color(255,0,0)
  val greencolor = new Color(0,255,0)
  val yellowcolor = new Color(255,255,0)
  val darkcolor = new Color(105,105,105)



  def mycard():List[Card] = {
    list match{
      case 0 => controller.playerList(0).playerCards
      case 1 => controller.playerList(1).playerCards
      case 3 => controller.playStack2
      case 4 => controller.stackCard.stackCards
      case default => List(Card("","green"), Card("","red"), Card((""),"yellow"), Card((""),"blue"))
    }
  }

  def cardValue(cardList:List[Card], cardIndex: Int) : String = {
    return cardList(cardIndex).value
  }

  def cardColor(cardList:List[Card], cardIndex: Int) : Color = {
    if(cardList(cardIndex).color == "red") {
      redcolor
    }
    else if (cardList(cardIndex).color == "blue") {
      bluecolor
    }
    else if (cardList(cardIndex).color == "yellow") {
      yellowcolor
    }
    else if (cardList(cardIndex).color == "green") {
      greencolor
    }
    else {
      darkcolor
    }
  }

  /*val label =
    new Label {
      text = cardValue(controller.playerList(index).playerCards, index)
      font = new Font("Verdana", 1, 36) //TODO
    }
   */


  val card = new BoxPanel(Orientation.Vertical) {
    val button = new Button(if (list == 1) {
      "UNO"
    } else if (list == 4) {
      "Stack"
    }
    else {
      cardValue(mycard(), index)
    }) {
      if (list == 0) {
        reactions += {
        case event.ButtonClicked(_) =>
          if (Strategy.handle(removeCardEvent(index),index) && controller.playerList(0).playerCards.size >= 3) {
            if (controller.playerList(0).playerCards(index).color == "black") {
              controller.colorSet = "green"
            }
            controller.removeCard(index)
          }

          else {
            //TODO Remove Card => if you have forgot to Call UNO you have to take 2 Cards: 1 Card Remove, 2 Cards Get
            controller.getCard()
            controller.playerList = controller.playerList.reverse
            controller.getCard()
          }
        }
      } else if (list == 4) {
        reactions += {
          case event.ButtonClicked(_) => controller.getCard()
        }
      }
    }
    button.font = new Font("Verdana", 1, 15)
    button.preferredSize_=(new Dimension(100,100))
    button.maximumSize_= (new Dimension(100, 100))
    button.minimumSize_=(new Dimension(100, 100))
    if (list == 1) {
      button.background = new Color(0,0,0)
    } else if (list == 4) {
      button.background = new Color(255,165,0)
    }
    else {
      button.background = cardColor(mycard(), index)
    }
    contents += button
    background = java.awt.Color.lightGray
  }

  val colorChange = new BoxPanel(Orientation.Vertical) {
    val button = new Button("red")
    button.font = new Font("Verdana", 1, 15)
    button.preferredSize_=(new Dimension(100,100))
    button.maximumSize_= (new Dimension(100, 100))
    button.minimumSize_=(new Dimension(100, 100))
    button.background = cardColor(mycard(), index)
    contents += button
    background = java.awt.Color.lightGray
  }

}

