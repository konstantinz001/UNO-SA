package UNO

import com.google.inject.AbstractModule
import net.codingwell.scalaguice.ScalaModule
import controller.controllerComponent._
import UNO.model.fileIOComponent._

class UnoGameModule extends AbstractModule:

  override def configure() =
    bind(classOf[controllerInterface]).to(classOf[controllerBaseImp.controller])
    //bind[controllerInterface].to[controllerStubImp.Controller]
    //bind[FileIOTrait].to[fileIOJsonImp.FileIO]
    bind(classOf[FileIOTrait]).to(classOf[fileIOXmlImp.FileIO])
