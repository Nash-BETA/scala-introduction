package controllers

import org.scalatestplus.play._
import org.scalatestplus.play.guice._
import play.api.test._
import play.api.test.Helpers._
//json
import play.api.libs.json.Json

class FreeeControllerSpec extends PlaySpec with GuiceOneAppPerTest with Injecting {

  "HomeController GET" must {

    "フェイクリクエスト" in {
      val request = FakeRequest(GET, "/hello")
      val response = route(app, request).get

      status(response) mustBe OK
      contentType(response) mustBe Some("text/plain")
      contentAsString(response) mustBe "Hello World"
    }
  }

  "HelloController POST" must {

    "「/hello」にPOSTメソッドでアクセスするとJsonが返る" in {
      val request  = FakeRequest(POST, "/hello")
      val response = route(app, request).get

      status(response) mustBe OK
      contentType(response) mustBe Some("application/json")
      contentAsJson(response) mustBe Json.obj(
        "hello"    -> "world",
        "language" -> "scala"
      )
    }
  }
}
