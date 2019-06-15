// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/talshinkar/Google Drive/Technion/Semester H/AndroidNotebook/NotebookServer/conf/routes
// @DATE:Sat Jun 15 13:14:54 IDT 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  NotebookController_2: controllers.NotebookController,
  // @LINE:8
  RegistrationController_1: controllers.RegistrationController,
  // @LINE:11
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    NotebookController_2: controllers.NotebookController,
    // @LINE:8
    RegistrationController_1: controllers.RegistrationController,
    // @LINE:11
    Assets_0: controllers.Assets
  ) = this(errorHandler, NotebookController_2, RegistrationController_1, Assets_0, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, NotebookController_2, RegistrationController_1, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.NotebookController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """register""", """controllers.RegistrationController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_NotebookController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_NotebookController_index0_invoker = createInvoker(
    NotebookController_2.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.NotebookController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_RegistrationController_index1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register")))
  )
  private[this] lazy val controllers_RegistrationController_index1_invoker = createInvoker(
    RegistrationController_1.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RegistrationController",
      "index",
      Nil,
      "GET",
      this.prefix + """register""",
      """ Registration page with a QR code to connect with an application""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_Assets_versioned2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned2_invoker = createInvoker(
    Assets_0.versioned(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_NotebookController_index0_route(params@_) =>
      call { 
        controllers_NotebookController_index0_invoker.call(NotebookController_2.index)
      }
  
    // @LINE:8
    case controllers_RegistrationController_index1_route(params@_) =>
      call { 
        controllers_RegistrationController_index1_invoker.call(RegistrationController_1.index)
      }
  
    // @LINE:11
    case controllers_Assets_versioned2_route(params@_) =>
      call(params.fromPath[String]("file", None)) { (file) =>
        controllers_Assets_versioned2_invoker.call(Assets_0.versioned(file))
      }
  }
}
