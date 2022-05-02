package UNO.database.slick


import UnoCards.cardBaseImp.Card
import slick.jdbc.MySQLProfile.api.*
import slick.lifted.ProvenShape
import slick.jdbc.MySQLProfile.api.valueToConstColumn
import slick.jdbc.MySQLProfile.api.anyToShapedValue




  class CardsTable(tag: Tag) extends Table[Card](tag, "CARDS") {

    def value = column[String]("VALUE")

    def color = column[String]("COLOR")


    //def * = ProvenShape(color, value)
    //def * = (value,color)<> (Card.tupled, Card.unapply)
    override def * = (value,color)<>(create,extract)
    def create(t:(String,String)):Card = {
      Card(t._1,t._2)
    }
    def extract(c:Card): Option[(String,String)]= {
      Some((c.value,c.color))
    }
  }


