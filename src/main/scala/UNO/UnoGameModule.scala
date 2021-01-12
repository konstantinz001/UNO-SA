package UNO

import com.google.inject.AbstractModule
import net.codingwell.scalaguice.ScalaModule
import UNO.controller.controllerComponent._

class UnoGameModule extends AbstractModule with ScalaModule{

  override def configure() = {
    bind[controllerInterface].to[controllerBaseImp.controller]
    //bind[controllerInterface].to[controllerStubImp.Controller]
  }



}