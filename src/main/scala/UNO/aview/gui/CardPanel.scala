
package UNO.aview.gui

import UNO.controller.controller
import UNO.model.cardComponent.cardBaseImp.Card
import UNO.util.{Strategy, removeCardEvent}

import java.awt.Image
import javax.swing.ImageIcon
import javax.swing.text.html.ImageView
import scala.swing._
import scala.swing.{BoxPanel, Button, Color, FlowPanel, Font, Label, Orientation}

class CardPanel(list:Int, index: Int ,controller:controller) extends FlowPanel{

  def mycard():List[Card] = {
    list match{
      case 0 => controller.playerList.head.playerCards
      case 1 => controller.playerList(1).playerCards
      case 3 => controller.playStack2
      case 4 => controller.stackCard.stackCards
      case default => List(Card("","green"), Card("","red"), Card((""),"yellow"), Card((""),"blue"))
    }
  }

  def cardValue(cardList:List[Card], cardIndex: Int) : String = {
    if (cardList(cardIndex).value == "<-->")
      return "Reverse.png"
    else if (cardList(cardIndex).value == "Ø")
      return "Skip.png"
    else if (cardList(cardIndex).value == "")
      return "Radio.png"
    else
      return cardList(cardIndex).value + ".png"
  }

  def cardColor(cardList:List[Card], cardIndex: Int) : String = {
    if(cardList(cardIndex).color == "red") {
      "Red_"
    }

    else if (cardList(cardIndex).color == "blue") {
      "Blue_"
    }
    else if (cardList(cardIndex).color == "yellow") {
      "Yellow_"
    }
    else if (cardList(cardIndex).color == "green") {
      "Red_"
    }
    else {
      "Black_"
    }
  }

  def scaledImageIcon(path: String, width: Int, height: Int): ImageIcon = {
    val orig = new ImageIcon(path)
    val scaledImage = orig.getImage.getScaledInstance(width, height, Image.SCALE_REPLICATE)
    new ImageIcon(scaledImage)
  }


  val card: BoxPanel = new BoxPanel(Orientation.Vertical) {
    val button: Button = new Button(if (list == 1) {
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
          if ((Strategy.handle(removeCardEvent(index),index) && controller.playerList.head.playerCards.size >= 3 && !controller.unoCall)
                    || controller.playerList.head.playerCards.size == 2 && controller.unoCall) { //unoCall = true überprüfen
            controller.removeCard(index)
          }
          else if (controller.playerList.head.playerCards.size == 1 && controller.unoCall) {
            System.exit(0)
          }
          //else if (!Strategy.handle(removeCardEvent(index),index) && controller.playerList(0).playerCards.size >= 3 && !controller.unoCall){}

          else {
            controller.removeCard(index)
            controller.playerList = controller.playerList.reverse
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

    //button.font = new Font("Verdana", 1, 15)
    button.preferredSize_=(new Dimension(97,100))
    button.maximumSize_= (new Dimension(97, 100))
    button.minimumSize_=(new Dimension(77, 80))
    button.background = java.awt.Color.DARK_GRAY
    if (list == 1) {
      button.icon = scaledImageIcon("src\\main\\Pics\\Card_Back.png", 110, 100)
    } else if (list == 4) {
      button.icon = scaledImageIcon("src\\main\\Pics\\Stack.png", 110, 100)
    }
    else if (list == 3) {
      button.icon = scaledImageIcon("src\\main\\Pics\\" + cardColor(mycard(), index) + cardValue(mycard(),index),
        110, 100)
      if (cardColor(mycard(), index) == "Black_") {
        button.icon = scaledImageIcon("src\\main\\Pics\\" + cardColor(List(Card("", controller.colorSet)), 3) + "Radio.png",
          110, 100)
        controller.colorSet = ""
      }
    }
    else {
      button.icon = scaledImageIcon("src\\main\\Pics\\" + cardColor(mycard(), index) + cardValue(mycard(), index),
        110, 100)
    }
    contents += button
    background = java.awt.Color.DARK_GRAY
  }
}


