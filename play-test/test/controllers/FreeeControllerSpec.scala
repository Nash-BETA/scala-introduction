package controllers

import org.scalatestplus.play._
import org.scalatestplus.play.guice._
import play.api.test._
import play.api.test.Helpers._


class FreeeControllerSpec extends PlaySpec with GuiceOneAppPerTest with Injecting {

  "HomeController GET" must {

    "フェイクリクエスト" in {
      val request = FakeRequest(GET, "/hello")
      val response = route(app, request).get
      
      status(response) mustBe OK
    }
  }
}
