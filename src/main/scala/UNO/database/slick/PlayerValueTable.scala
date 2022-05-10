package UNO.database.slick
import UnoCards.cardBaseImp.Card
import slick.jdbc.MySQLProfile.api.*
import slick.lifted.ProvenShape
import slick.jdbc.MySQLProfile.api.valueToConstColumn
import slick.jdbc.MySQLProfile.api.anyToShapedValue

class PlayerValueTable(tag:Tag)extends Table[String](tag,"TEST"){
  def name = column[String]("NAME")

  def * = (name)
}



