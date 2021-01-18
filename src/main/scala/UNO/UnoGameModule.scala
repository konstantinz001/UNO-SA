package UNO

import com.google.inject.AbstractModule
import net.codingwell.scalaguice.ScalaModule
import UNO.controller.controllerComponent._
import UNO.model.fileIOComponent._

class UnoGameModule extends AbstractModule with ScalaModule{

  override def configure() = {
    bind[controllerInterface].to[controllerBaseImp.controller]
    //bind[controllerInterface].to[controllerStubImp.Controller]
    //bind[FileIOTrait].to[fileIOJsonImp.FileIO]
    bind[FileIOTrait].to[fileIOXmlImp.FileIO]
  }
}