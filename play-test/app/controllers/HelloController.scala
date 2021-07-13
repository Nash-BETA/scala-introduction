package controllers

import javax.inject.Inject
import play.api.mvc._

//class HelloController @Inject() (cc: ControllerComponents) extends BaseControllerHelpers {
class HelloController @Inject() (cc: ControllerComponents) extends AbstractController (cc) {

//  override protected def controllerComponents: ControllerComponents = cc

  def hello(): Action[AnyContent] = Action(Ok("Hello World"))
//  def hello(): Action[AnyContent] = {
//    val result : Result = Ok("Hello World")
//    Action(result.as("text/plain"))
//  }


//  def hello(): Action[AnyContent] = Action(new Status(200))
//  def hello(): Action[AnyContent] = {
//    val actionBuilder: ActionBuilder[Request, AnyContent] =
//      controllerComponents.actionBuilder
//    actionBuilder.apply(new Status(200))
//  }
}