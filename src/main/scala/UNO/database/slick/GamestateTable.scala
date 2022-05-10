package UNO.database.slick


import UnoPlayer.playerBaseImp.Player
import UnoCards.cardBaseImp.Card
import slick.jdbc.MySQLProfile.api.*
import slick.lifted.ProvenShape
import slick.jdbc.MySQLProfile.api.valueToConstColumn
import slick.jdbc.MySQLProfile.api.anyToShapedValue




class GamestateTable(tag: Tag) extends Table[(String,String,String,String)](tag, "GAMESTATE") {

  def id = column[String]("GAMEID")

  def player = column[String]("PLAYER")

  def value = column[String]("VALUE")

  def color = column[String]("COLOR")

  override def * = (id,player,value,color)/*<>(create,extract)

  def create(t:(String,String,String)):Player= {
    Player(t._1,List(Card(t._2,t._3))
  }
  def extract(c:Player): Option[(String,String,String)]= {
    Some((c.name,c.playerCards))
  }*/
}


