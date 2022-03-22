package scala.util

import UNO.util._
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class ObservableSpec extends AnyWordSpec with Matchers {
  "An Observable" should {

    val observable = new Observable
    val observer = new Observer {
      var updated: Boolean = false
      def isUpdated: Boolean = updated
      override def update: Boolean = {updated = true; updated}
    }
    "add an Observer" in {

      add(observer)
      subscribers should contain (observer)
    }
    "notify an Observer" in {
      observer.update should be(true)
      notifyObservers()
      observer.update should be(true)
    }
    "remove an Observer" in {
      remove(observer)
      subscribers should not contain (observer)
    }

  }

}