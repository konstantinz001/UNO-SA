package UNO.aview

import UNO.controller.controllerComponent.controllerBaseImp.{updateStates}
import UNO.util.{State, Strategy, callFirstUnoEvent, callSecondUnoEvent, exitGameEvent, forgotCallUnoEvent, gameStatsEvent, removeCardEvent, removeFalseCardEvent, removePlayerCardEvent, setPlayerCardEvent, toManyCardsEvent}
import UNO.controller.controllerComponent.controllerInterface

import scala.swing.Reactor

def print1: Unit =
  print(State.handle(gameStatsEvent()))



class TUI(controller: controllerInterface) extends Reactor:
  
  listenTo(controller)

  def processInputLine(input: String): String =

    val is: Array[String] = input.split(" ")
    is(0) match

      case "s" =>
        controller.getCard()
        State.handle(setPlayerCardEvent())
      case "r" =>
        if controller.playerList(0).playerCards(is(1).toInt).color.equals("black") then
          controller.colorSet = is(2)
        if Strategy.handle(removeCardEvent(is(1).toInt), is(1).toInt) && controller.playerList(0).playerCards.size >= 3 then
          controller.removeCard(is(1).toInt)
          State.handle(removePlayerCardEvent(is(1).toInt), is(1).toInt)
        else if !Strategy.handle(removeCardEvent(is(1).toInt), is(1).toInt) && controller.playerList(0).playerCards.size >= 3 then
          State.handle(removeFalseCardEvent())
        else
          controller.removeCard(is(1).toInt)
          controller.getCard()
          controller.playerList = controller.playerList.reverse
          controller.getCard()
          State.handle(forgotCallUnoEvent())
      case "u" =>
        controller.unoCall = true
        if controller.playerList(0).playerCards.size.equals(2) then
          controller.removeCard(is(1).toInt)
          State.handle(callFirstUnoEvent(is(1).toInt), is(1).toInt)
        else if controller.playerList(0).playerCards.size.equals(1) then
          State.handle(callSecondUnoEvent())
        else
          controller.getCard()
          controller.playerList = controller.playerList.reverse
          controller.getCard()
          State.handle(toManyCardsEvent())
      case "q" =>
        State.handle(exitGameEvent())

      case "undo" =>
        controller.undoGet
        "undo"
      case "redo" =>
        controller.redoGet
        "redo"
      case "load" =>
        controller.load
        "Loading Game!"
      case "save" =>
        controller.save
        "Saved Game!"
      case _ =>
        "Wrong command!"

  reactions += {
    case event: updateStates => print1
  }

