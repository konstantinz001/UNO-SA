package UNO.util

object Strategy:
  // closure
  var strategy = false

  def handle(e: Event2, index: Int): Boolean =
    e match
      case a: removeCardEvent => strategy = removeCardEvent(index).removeCard
    strategy