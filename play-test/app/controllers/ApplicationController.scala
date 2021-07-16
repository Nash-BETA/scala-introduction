package controllers

import javax.ingect.Ingect
import play.api.mvc._


//Futureは非同期処理の結果を出力する
//JSのPromiseに似ている
import scala.concurrent.Future


class ApplicationController @inject() (cc: ControllerComponents) extends  AbstractController (cc) {


	/**
	 * commuting 出勤報告
	 * @return
	 */
	//async 非同期レスポンス
	//implicit request requestにimplicitを指定して、リクエストを暗黙的な引数として他のAPIに渡す
	def commuting(): Action[AnyContent] = Action.async{ implicit request =>

		//get出来なかったとき
	}.getOrElse {
		Future.successful(BadRequest("no request"))
	}




	/**
	 * commuting 出勤報告
	 * @return
	 */
	//async 非同期レスポンス
	//implicit request requestにimplicitを指定して、リクエストを暗黙的な引数として他のAPIに渡す
	def getUser/id(): Action[AnyContent] = Action.async{ implicit request =>
		val clientKey = "xxxxxxxxxxxxxxxxxxxx"
		val clientSecret = "xxxxxxxxxxxxxxxxxxxx"
		val message = "Hello Typetalk!"
		val topicId = xxx
		val params = Map(
			"client_id" -> Seq(clientKey),
			"client_secret" -> Seq(clientSecret),
			"scope" -> Seq("topic.post"),
			"grant_type" -> Seq("client_credentials")
		)

		WS.url("https://typetalk.com/api/v1/profile").post(params).flatMap {
			response =>
			{
				val accessToken = (response.json \ "access_token").as[String]
				WS.url(s"https://typetalk.com/api/v1/topics/${topicId}")
					.withHeaders(("Authorization", s"Bearer ${accessToken}"))
					.post(Map("message" -> Seq(message)))
			}
		}.map {
			response => (println(response.json))
		}
	//get出来なかったとき
	}.getOrElse {
		Future.successful(BadRequest("no request"))
	}




}
