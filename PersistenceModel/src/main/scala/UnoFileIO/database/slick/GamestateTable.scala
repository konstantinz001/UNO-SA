package UnoFileIO.database.slick

import slick.jdbc.MySQLProfile.api.*
import slick.lifted.ProvenShape
import slick.jdbc.MySQLProfile.api.valueToConstColumn
import slick.jdbc.MySQLProfile.api.anyToShapedValue



class GamestateTable(tag: Tag) extends Table[(String,String,String,String)](tag, "GAMESTATE") {

  def id = column[String]("GAMEID")

  def player = column[String]("PLAYER")

  def value = column[String]("VALUE")

  def color = column[String]("COLOR")

  override def * = (id,player,value,color)
}


