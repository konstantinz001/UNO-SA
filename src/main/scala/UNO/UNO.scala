import scala.io.StdIn.readLine

object UNO {
  def main(args: Array[String]): Unit = {
    printKarten()
    println("_________________")
    println("UNO! ")
    println("_________________\n\n")
    val anzahlPlayer = readLine("Wie viele Spieler gibt es (2-10)?\n").toInt
    if (anzahlPlayer > 10) {
      Console.err.println("Zu viele Spieler!")
      sys.exit(1)
    }
    else if (anzahlPlayer < 2) {
      Console.err.println("Zu wenig Spieler!")
      sys.exit(1)
    }

    val a = 0
    for (a <- 1 to anzahlPlayer) {

      val player = new Array[String](anzahlPlayer + 1)
      player(a) = Player(args, a)
      println("Hallo " + player(a))
    }
  }

  def Player(playerNames: Array[String], anzahl: Int): String = {

    if (playerNames.length > 0)
      playerNames.head
    else
      readLine("\nPlayer " + anzahl + "!\nBitte gib deinen Namen ein: ")
  }
  def printKarten(): Unit = {

    val Player = 5
    val CardNumber = 7
    val CardName = "KARTENNAME"

    val a = " _______________"
    val b = "|               |"
    val c = "|               |"
    val d = "|  " + CardName
    val e = "|               |"
    val f = "|               |"
    val g = " ---------------"

    val handCards = ((a + "\t") * CardNumber) + "\n" +
    ((b + "\t") * CardNumber) + "\n" +
      ((c + "\t") * CardNumber) + "\n" +
      ((d + "\t") * CardNumber) + "\n" +
      ((e + "\t") * CardNumber) + "\n" +
      ((f + "\t") * CardNumber) + "\n" +
      ((g + "\t") * CardNumber)


    print(handCards)
  }
}