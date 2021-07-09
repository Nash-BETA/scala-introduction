package controllers

import java.text.SimpleDateFormat
import java.util.{TimeZone, Locale, Date}

import play.api.Play.current
import play.api.libs.concurrent.Execution.Implicits._
import play.api.libs.json.{JsString, JsNumber, JsValue, Json}
import play.api.libs.ws.WS
import play.api.mvc._

import scala.concurrent.Future

class Application extends Controller {
  private val lgtmRegex = """value="([^"]+)" class="form-control" id="imageUrl"""".r
  def lgtm = Action.async { implicit req =>
    req.body.asJson.map {json =>
      val postId = (json \ "post" \ "id").as[Long]
      WS.url("http://www.lgtm.in/g").get().map { response =>
        lgtmRegex.findFirstMatchIn(response.body).map(_.group(1)).get
      }.map { url =>
        Ok(Json.obj(
          "message" -> url,
          "replyTo" -> postId
        ))
      }
    }.getOrElse {
      Future.successful(BadRequest)
    }
  }
}
