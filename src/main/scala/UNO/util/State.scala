package UNO.util

object State {
  var state = gameStartEvent().gameStart
  def handle(e: Event, index:Int) = {
    e match {
      case a: callFirstUnoEvent => state = callFirstUnoEvent(index).callFirstUno
      case b: removePlayerCardEvent => state = removePlayerCardEvent(index).removePlayerCard
    }
    state
  }

  def handle(e: Event) = {
    e match {
      case a: setPlayerCardEvent => state = setPlayerCardEvent().setPlayerCard
      case b: removeFalseCardEvent => state = removeFalseCardEvent().removeFalseCard
      case c: callSecondUnoEvent => state = callSecondUnoEvent().callSecondUno
      case d: toManyCardsEvent => state = toManyCardsEvent().toManyCards
      case e: instructionEvent => state = instructionEvent().instruction
      case f: gameStartEvent => state = gameStartEvent().gameStart
      case g: gameStatsEvent => state = gameStatsEvent().gameStats
      case h: exitGameEvent => state = exitGameEvent().exitGame
      case i: forgotCallUnoEvent => state = forgotCallUnoEvent().forgotCallUno
    }
    state
  }
}