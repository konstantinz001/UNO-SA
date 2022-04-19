package UNO.aview.gui

import UNO.controller.controllerComponent.controllerBaseImp.endStates
import UNO.controller.controllerComponent.controllerInterface
import UnoCards.cardBaseImp.Card
import java.awt.Image
import javax.swing.{ImageIcon, SwingConstants}
import scala.swing.*
import scala.swing.Swing.LineBorder
import scala.swing.{BoxPanel, Button, FlowPanel, Orientation}


def scaledImageIcon(path: String, width: Int, height: Int): ImageIcon =
  val orig = new ImageIcon(path)
  val scaledImage = orig.getImage.getScaledInstance(width, height, Image.SCALE_REPLICATE)
  new ImageIcon(scaledImage)

class CardPanel(list: Int, index: Int, controller: controllerInterface) extends FlowPanel:

  def mycard(): List[Card] =
    list match
      case 0 => controller.playerList.head.playerCards
      case 1 => controller.playerList(1).playerCards
      case 3 => controller.playStack2
      case 4 => controller.stackCard.stackCards


  def cardValue(cardList: List[Card], cardIndex: Int): String =
    cardList(cardIndex).value match {
      case "<-->" =>"Reverse.png"
      case "Ø" =>"Skip.png"
      case "" =>"Radio.png"
      case _ => cardList(cardIndex).value + ".png"
    }


  def cardColor(cardList:List[Card], cardIndex:Int):String=
    cardList(cardIndex).color match{
      case "red" => "Red_"
      case "blue" => "Blue_"
      case "yellow" => "Yellow_"
      case "green" => "Green_"
      case _ => "Black_"
    }


  val card: BoxPanel = new BoxPanel(Orientation.Vertical):
    val button: Button = new Button(
      if list == 1 then
        "UNO"
      else if list == 4 then
        "Stack"
      else
        cardValue(mycard(), index)):
      if list == 0 then
        reactions += {
          case event.ButtonClicked(_) =>
            if !controller.unoCall then
              controller.removeCard(index)
            else
              controller.removeUnoCard(index)
        }
      else if list == 4 then
        reactions += {
          case event.ButtonClicked(_) => controller.getCard()
        }
    button.preferredSize_=(new Dimension(97, 200))
    button.maximumSize_=(new Dimension(97, 200))
    button.minimumSize_=(new Dimension(77, 200))
    button.background = java.awt.Color.decode("#003366")
    list match {
      case 1 => button.icon = scaledImageIcon("src\\main\\Pics\\Card_Back.png", 70, 100)
      case 4 => button.icon = scaledImageIcon("src\\main\\Pics\\Stack.png", 70, 100)
      case 3 => button.icon = scaledImageIcon("src\\main\\Pics\\" + cardColor(mycard(), index) + cardValue(mycard(), index), 70, 100)
        if cardColor(mycard(), index) == "Black_" then
          button.icon = scaledImageIcon("src\\main\\Pics\\" + cardColor(List(Card("", controller.colorSet)), 3) + "Radio.png",
            70, 100)
        controller.colorSet = ""
      case _=> button.icon = scaledImageIcon("src\\main\\Pics\\" + cardColor(mycard(), index) + cardValue(mycard(), index), 70, 100)
    }
    button.horizontalAlignment = Alignment.Center
    button.text = ""
    button.background = java.awt.Color.decode("#003366")
    button.border = LineBorder(java.awt.Color.decode("#003366"), 10)
    contents += button
    background = java.awt.Color.decode("#003366")