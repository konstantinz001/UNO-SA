package UNO.database
import scala.concurrent.Future
import UnoPlayer.playerBaseImp.Player
import UnoCards.cardBaseImp.Card


trait DaoInterface  {
  def load():Unit
  def save(playerlist:List[Player], playerstack:List[Card]):Future[Unit]

}