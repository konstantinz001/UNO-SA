package UNO

object GameBoard {

  def board(cardNumber: Int, cardName: Array[String], playerNum: Int, pullDeck: Int, pushDeck: Int, playerTurn: Int) {
    def hand(): String = {

      val a = " __________ "
      val b = "|          |"
      val c = "|          |"
      val d = "|" + cardName(0) +
        (" " * (a.length - cardName(0).length - 2)) + "|"
      val e = "|          |"
      val f = "|          |"
      val g = " ---------- "

      return ((a + " ") * cardNumber) + "\n" +
        ((b + " ") * cardNumber) + "\n" +
        ((c + " ") * cardNumber) + "\n" +
        ((d + " ") * cardNumber) + "\n" +
        ((e + " ") * cardNumber) + "\n" +
        ((f + " ") * cardNumber) + "\n" +
        ((g + " ") * cardNumber)
    }

    def playerHand(): Array[String] = {

      val playerHand = new Array[String](playerNum)
      for (x <- 0 until playerNum) {
        playerHand(x) = hand()
      }
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

      val a = " __________ "
      val b = "|          |"
      val c = "|          |"
      val d = "|" + cardName(0) +
        (" " * (a.length - cardName(0).length - 2)) + "|"
      val e = "|          |"
      val f = "|          |"
      val g = " ---------- "

      return (" " * 40 + a + " " * 40 + "\n"
        + " " * 40 + b + " " * 40 + "\n"
        + " " * 40 + c + " " * 40 + "\n"
        + " " * 40 + d + " " * 40 + "\n"
        + " " * 40 + e + " " * 40 + "\n"
        + " " * 40 + f + " " * 40 + "\n"
        + " " * 40 + g + " " * 40 + "\n")

    }

    def printGameBoard(): Unit = {

      def yourturn(): String = {
        val a = "* " * 50 + "\n"
        var b = ((" " * (a.length / 2 - ("PLAYER x").length / 2))
          + "PLAYER " + playerTurn + "\n")
        return a + b + a + "\n"
      }

      print((yourturn() + pullStack() + "\n\n" +
        putStack() + "\n\n" + hand() + "\n"))
    }
    printGameBoard() // gibt spielboard aus
  }
}
