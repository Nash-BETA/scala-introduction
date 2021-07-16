package controllers

import org.scalatestplus.play_
import org.scalatestplus.play.guice._
import play.api.test._
import play.api.test.Helpers._

//json
import play.api.libs.json.Json

class ApplicationControllerSpec extends PlaySpec with GuiceOneAppPerTest with Injecting {
//a0afcf0811e09e4dc0fd3b65f7dd7527e18de1a3dd146bddb91dc988ac8a0267
	"AppController POST TEST" must {
		"TEST REQUEST" in {
			//FakeRequestオブジェクトを使うことで、HTTPメソッドとパスを指定して擬似的なリクエストを作成
			val company_id = "00000"

			//出勤報告
			val request  = FakeRequest(POST, "/freee/commuting")
			val response = route(app, request)get

			//200番が返ってきている
			status(response) mustBe OK
			//Json形式で返ってきている
			contentType(response) mustBe Some("application/json")

		}
	}




	//Leave - 退勤
}
