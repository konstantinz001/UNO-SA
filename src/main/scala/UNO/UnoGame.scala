import scala.io.StdIn.readLine


object UnoGame {
  def main(args: Array[String]): Unit = {
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
    //(cardNumber: Int, cardName: Array[String], playerNum: Int, pullDeck: Int, pushDeck: Int, playerTurn: Int)
    UNO.GameBoard.board(3,Array("Karte1","Karte2","Karte3"),anzahlPlayer,1,107,1)
    UNO.GameBoard.board(4,Array("Karte1","Karte2","Karte3","Karte4"),anzahlPlayer,100,50,2)
  }

  def Player(playerNames: Array[String], anzahl: Int): String = {

    if (playerNames.length > 0)
      playerNames.head
    else
      readLine("\nPlayer " + anzahl + "!\nBitte gib deinen Namen ein: ")
  }
}