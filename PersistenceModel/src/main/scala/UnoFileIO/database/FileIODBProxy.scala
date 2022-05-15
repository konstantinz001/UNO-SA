package UnoFileIO.database

import UnoFileIO.FileIOModule
import com.google.inject.Guice

class FileIODBProxy extends DaoInterface {

  val injector = Guice.createInjector(new FileIOModule)
  val db = injector.getInstance(classOf[DaoInterface])

  def load(gameid:String):String = db.load("1")
  def save(game: String): Unit = db.save(game)

}
