
def hand(): String = {

  val CardNumber = 7
  val CardName = "KARTENNAME"

  val a = " __________ "
  val b = "|          |"
  val c = "|          |"
  val d = "|" + CardName +
    (" "*(a.length-CardName.length-2)) +"|"
  val e = "|          |"
  val f = "|          |"
  val g = " ---------- "

  return ((a + " ") * CardNumber) + "\n" +
    ((b + " ") * CardNumber) + "\n" +
    ((c + " ") * CardNumber) + "\n" +
    ((d + " ") * CardNumber) + "\n" +
    ((e + " ") * CardNumber) + "\n" +
    ((f + " ") * CardNumber) + "\n" +
    ((g + " ") * CardNumber)

}

def playerHand(): Array[String] ={
  val Player = 5

  val playerHand = new Array[String](Player)
  (0 until Player)foreach(_ =>
    playerHand(_) = hand()
    )
  return playerHand
}

def pullStack(): String = {

  val a = " ________________ "
  val b = "|                |"
  val c = "|       UNO      |"
  val d = "|                |"
  val e = " ________________ "

  val cardStack = (a + "\n" + b + "\n" + c + "\n"
    + d + "\n" + e + "\n")

  return cardStack
}

def putStack(): String = {

  val CardName = "KARTENNAME"

  val a = " __________ "
  val b = "|          |"
  val c = "|          |"
  val d = "|" + CardName +
    (" "*(a.length-CardName.length-2)) +"|"
  val e = "|          |"
  val f = "|          |"
  val g = " ---------- "

  return (" " * 40 + a +" " * 40 + "\n"
    +" " * 40 + b +" " * 40 + "\n"
    +" " * 40 + c +" " * 40 + "\n"
    +" " * 40 + d +" " * 40 + "\n"
    +" " * 40 + e +" " * 40 + "\n"
    +" " * 40 + f +" " * 40 + "\n"
    +" " * 40 + g +" " * 40 + "\n")

}

def printGameBoard(): Unit = {
  val player = 1

  def yourturn(): String = {
    val a = "* " * 50 + "\n"
    var b = ((" " * (a.length/2 - ("PLAYER x").length/2))
      + "PLAYER " + player + "\n")
    return a + b + a + "\n"
  }
  print((yourturn()+pullStack()+"\n\n" +
    putStack() + "\n\n" + hand()))
}

printGameBoard()