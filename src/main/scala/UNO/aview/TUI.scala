package UNO.aview

import UNO.controller.controllerComponent.GameStatus.IDLE
import UNO.controller.controllerComponent.controllerBaseImp.updateStates

import scala.util.{Failure, Success, Try}
import UNO.util.*
import UNO.controller.controllerComponent.controllerInterface

import scala.swing.Reactor


def print1: Unit =
  print(State.handle(gameStatsEvent()))

def printGameStatus(controller: controllerInterface): String =
  val gameStatePrint = controller.gameStatus.toString()
  controller.gameStatus = IDLE
  gameStatePrint

enum Letter(val letter_string: String):
  case U extends Letter("u")
  case R extends Letter("r")


class TUI(controller: controllerInterface) extends Reactor:
  
  listenTo(controller)

  def case_u(is:Array[String]):String= unifiedcases(Letter.U.letter_string) (is)
  def case_r(is:Array[String]):String = unifiedcases(Letter.R.letter_string) (is)

  def tryColorSwitch(is_2 : String) :  Option[String] =
    Try((List("blue", "red", "yellow", "green").filter(x => x.equals(is_2))(0))) match
      case Success(color: String) => Some(color)
      case Failure(_) => None

  def processInputLine(input: String): String =

    val is: Array[String] = input.split(" ")
    is(0) match
      case "s" =>
        controller.getCard()
        State.handle(setPlayerCardEvent())
      case "r" =>
        case_r(is)
      case "u" =>
        case_u(is)
      case "q" =>
        State.handle(exitGameEvent())
      case "undo" =>
        controller.undoGet
        printGameStatus(controller)
      case "redo" =>
        controller.redoGet
        printGameStatus(controller)
      case "load" =>
        controller.load
        printGameStatus(controller)
      case "save" =>
        controller.save
        printGameStatus(controller)
      case _ =>
        "Wrong command!"


  def unifiedcases(value:String)(is:Array[String]):String=
    value match {
      case "u"=>
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

      case "r"=>
        if is(1).toInt >= controller.playerList(0).playerCards.size then
          State.handle(wrongIndexEvent())
        else
          if controller.playerList(0).playerCards(is(1).toInt).color.equals("black") then
          //Try Monad
            tryColorSwitch(is(2)) match
              case Some(color: String) => controller.colorSet = color
              //case None => throw new Exception("Color could not change!\n")
              case None => "Color could not change!\n"

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
    }

  reactions += {
    case event: updateStates => print1
  }
