package UNO.database


import UnoPlayer.playerBaseImp.Player
import UnoCards.cardBaseImp.Card
import slick.jdbc.PostgresProfile.api._

trait DatabaseSchema {

  class Players(tag: Tag) extends Table[(String,List[Card])](tag, "PLAYERS") {

    def name = column[String]("NAME", O.PrimaryKey)

    def color = column[List[Card]]("COLOR")

    ///Def value = column[String]("VALUE")

    def * = (name, color)


  }

  val players = TableQuery[Players]
}