package UNO

import com.google.inject.AbstractModule
import net.codingwell.scalaguice.ScalaModule
import controller.controllerComponent.*
import UnoFileIO.*

class UnoGameModule extends AbstractModule:

  override def configure() =
    bind(classOf[controllerInterface]).to(classOf[controllerBaseImp.controller])
    //bind[controllerInterface].to[controllerStubImp.Controller]
    bind(classOf[FileIOTrait]).to(classOf[fileIOJsonImp.FileIO])
    //bind(classOf[FileIOTrait]).to(classOf[fileIOXmlImp.FileIO])
    //bind(classOf[DaoInterface]).to(classOf[database.slick.DaoSlick])
    //bind(classOf[DaoInterface]).to(classOf[database.mongoDB.DaoMongoDB])