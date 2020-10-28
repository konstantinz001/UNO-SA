import scala.io.StdIn.readLine

object UNO{
  def main(args:Array[String]) = {
    println("_________________")
    println("UNO! ")
    println("_________________\n\n")
    Thread.sleep(500)
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
    for(a <- 1 to anzahlPlayer){

      val player = new Array[String](anzahlPlayer+1)
      Thread.sleep(1000)
        player(a) = Player(args, a)
      Thread.sleep(1000)
      println("Hallo " + player(a))
      }
  }

  def Player(playerNames:Array[String], anzahl: Int):String = {

    if (playerNames.length > 0)
      playerNames.head
    else
      readLine("\nPlayer " + anzahl + "!\nBitte gib deinen Namen ein: ")
  }
}
