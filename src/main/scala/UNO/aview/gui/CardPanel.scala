
package UNO.aview.gui

import UNO.controller.controllerComponent.controllerBaseImp.endStates
import UNO.controller.controllerComponent.controllerInterface
import UNO.model.cardComponent.cardBaseImp.Card
import UNO.util.{Strategy, removeCardEvent}

import java.awt.Image
import javax.swing.ImageIcon
import scala.swing._
import scala.swing.{BoxPanel, Button, FlowPanel, Orientation}

class CardPanel(list:Int, index: Int ,controller:controllerInterface) extends FlowPanel{

  def mycard():List[Card] = {
    list match{
      case 0 => controller.playerList.head.playerCards
      case 1 => controller.playerList(1).playerCards
      case 3 => controller.playStack2
      case 4 => controller.stackCard.stackCards
    }
  }

  def cardValue(cardList:List[Card], cardIndex: Int) : String = {
    if (cardList(cardIndex).value == "<-->")
      "Reverse.png"
    else if (cardList(cardIndex).value == "Ø")
      "Skip.png"
    else if (cardList(cardIndex).value == "")
      "Radio.png"
    else
      cardList(cardIndex).value + ".png"
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
      "Green_"
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
              || controller.playerList.head.playerCards.size == 2 && controller.unoCall) {
              controller.removeCard(index)
            }
            else if (controller.playerList.head.playerCards.size == 1 && controller.unoCall) {
              controller.publish(new endStates)
              // UnoGame.gui.redraw2
            }
            else if (!Strategy.handle(removeCardEvent(index),index)){}

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