package UNO.util
object ChooseStrategy{



  var strategy = {}

  def choose(e: Event, index: Int) = {
    e match {
      case a: strategyEvent2 => strategy = strategyEvent2(index).strategy2
    }
  }
  def choose(e: Event) = {
    e match {
      case a: strategyEvent1 => strategy = strategyEvent1().strategy1
    }
  }
}
