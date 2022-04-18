package UNO

import com.google.inject.AbstractModule
import net.codingwell.scalaguice.ScalaModule
import controller.controllerComponent._
import UnoFileIO._

class UnoGameModule extends AbstractModule:

  override def configure() =
    bind(classOf[controllerInterface]).to(classOf[controllerBaseImp.controller])
    //bind[controllerInterface].to[controllerStubImp.Controller]
    bind(classOf[FileIOTrait]).to(classOf[fileIOJsonImp.FileIO])
    //bind(classOf[FileIOTrait]).to(classOf[fileIOXmlImp.FileIO])