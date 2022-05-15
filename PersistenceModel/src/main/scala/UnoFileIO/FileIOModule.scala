package UnoFileIO

import UnoFileIO.database
import UnoFileIO.database.DaoInterface
import com.google.inject.AbstractModule
import net.codingwell.scalaguice.ScalaModule

class FileIOModule extends AbstractModule :

  override def configure(): Unit =
    //bind(classOf[DaoInterface]).to(classOf[database.mongoDB.DaoMongoDB])
    bind(classOf[DaoInterface]).to(classOf[database.slick.DaoSlick])

    bind(classOf[FileIOTrait]).to(classOf[fileIOJsonImp.FileIO])