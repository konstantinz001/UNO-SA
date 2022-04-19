package UNO.aview

import UNO.controller.controllerComponent.GameStatus.IDLE
import UNO.controller.controllerComponent.controllerBaseImp.*

import scala.util.{Failure, Success, Try}
import UNO.util.*
import UNO.controller.controllerComponent.{GameStatus, controllerInterface}

import scala.swing.Reactor

enum Letter(val letter_string: String):
  case U extends Letter("u")
  case R extends Letter("r")


class TUI(controller: controllerInterface) extends Reactor:
  
  listenTo(controller)

  def case_u(is:Array[String]):Unit= unifiedcases(Letter.U.letter_string)(is)
  def case_r(is:Array[String]):Unit = unifiedcases(Letter.R.letter_string)(is)

  def processInputLine(input: String): Unit =

    val is: Array[String] = input.split(" ")
    is(0) match
      case "s" => controller.getCard()
      case "r" => case_r(is)
      case "u" => case_u(is)
      case "q" => System.exit(0)
      case "undo" => controller.undoGet
      case "redo" => controller.redoGet
      case "load" => controller.load
      case "save" => controller.save
      case _ => controller.wrongCommand


  def unifiedcases(value:String)(is:Array[String]):Unit=
    value match {
      case "u"=> controller.removeUnoCard(is(1).toInt)
      case "r"=>
        println(is(1))
        if(is.size == 2) then
          controller.removeCard(is(1).toInt)
        else
          controller.removeBlackCard(is(1).toInt, is(2))
    }

  reactions += {
    case event: updateStates => print(GameStatus.handleStatus(controller.gameStatus, controller))
    case event: welcomeStates => print(GameStatus.handleStatus(controller.gameStatus, controller))
    case event: endStates => print(GameStatus.handleStatus(controller.gameStatus, controller))
    case event: failureStates => print(GameStatus.handleStatus(controller.gameStatus, controller))
    case event: saveStates => print(GameStatus.handleStatus(controller.gameStatus, controller))
    case event: loadStates => print(GameStatus.handleStatus(controller.gameStatus, controller))
    case event: undoStates => print(GameStatus.handleStatus(controller.gameStatus, controller))
    case event: redoStates => print(GameStatus.handleStatus(controller.gameStatus, controller))
    case event: newgameStates => print(GameStatus.handleStatus(controller.gameStatus, controller))
  }
