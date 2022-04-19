package UNO.util

import UNO.UnoGame.Controller

trait Event


case class instructionEvent() extends Event:
  def instruction: String =
    "\nPossible instructions:\n"+
      "\tq = Quit\n" +
      "\ts = Take a new Card from Stack\n"+
      "\tr = Put a Card from Hand into GameBoard\n"+
      "\tu = Call UNO/ UNO-UNO\n"+
      "\n"+"_" * 50 + "\n"

case class gameStartEvent() extends Event:
  def gameStart: String =
    "\n"+"_" * 50 + "\n" +
      "\nUNO! "+ "\n" +
      "\n" + "_" * 50 + "\n"

case class gameStatsEvent() extends Event:
  def gameStats: String =
      "\n" + "_" * 50 + "\nPLAYER " + Controller.playerList(0).name.toUpperCase() +
      "\n\nPlayStack: \t" + Controller.playStack2(0) +
      "\n\nHandcards: \t" + Controller.playerList(0).playerCards + "\n"

case class exitGameEvent() extends Event:
  def exitGame:String = "\nGame exit\n"

case class setPlayerCardEvent() extends Event:
  def setPlayerCard:String = "\n--Handcards:\t" + Controller.playerList(1).playerCards

case class removePlayerCardEvent(index:Int) extends Event:
  def removePlayerCard:String =
    "\n\n--Handcards:\t" + Controller.playerList(1).playerCards + "\n"

case class removeFalseCardEvent() extends Event:
  def removeFalseCard:String = "\nWrong Card!\n"

case class callFirstUnoEvent(index:Int) extends Event:
  def callFirstUno:String =
    "\nUNO\n" +
      removePlayerCardEvent(index) + "\n"

case class callSecondUnoEvent() extends Event:
  def callSecondUno:String =
    "\nUNO - UNO!\n" +
      "Player " + Controller.playerList(0).name.toUpperCase()+ ": WON\n"

case class toManyCardsEvent() extends Event:
  def toManyCards:String =
    "\nTo many Cards\n"+
      "\n--Handcards:\t" + Controller.playerList(1).playerCards + "\n"

case class forgotCallUnoEvent() extends Event:
  def forgotCallUno:String =
    "\nYou have forgot to Call UNO\n" +
      "\n--Handcards:\t" + Controller.playerList(1).playerCards + "\n"

case class wrongIndexEvent() extends Event:
  def worngIndex:String =
    "\nYou have set the wrong Index\n"
