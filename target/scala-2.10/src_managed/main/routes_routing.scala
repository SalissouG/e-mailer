// @SOURCE:C:/Users/salis/ProjetWeb/monGit/e-mailer/conf/routes
// @HASH:86bcaaae8cce6b31cab85da918e9407b7bf68b05
// @DATE:Tue Oct 11 18:32:27 CEST 2016


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("page"))))
        

// @LINE:7
private[this] lazy val controllers_Application_addMessage1 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("message"))))
        

// @LINE:8
private[this] lazy val controllers_Application_getMessages2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("messages"))))
        

// @LINE:9
private[this] lazy val controllers_Application_getUsers3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users"))))
        

// @LINE:10
private[this] lazy val controllers_Application_login4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:11
private[this] lazy val controllers_Application_validateLogin5 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:12
private[this] lazy val controllers_Application_inscription6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("inscription"))))
        

// @LINE:13
private[this] lazy val controllers_Application_validateInscription7 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("validateInscription"))))
        

// @LINE:14
private[this] lazy val controllers_Application_messageInscription8 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("messageInscription"))))
        

// @LINE:16
private[this] lazy val controllers_Assets_at9 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """page""","""controllers.Application.index()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """message""","""controllers.Application.addMessage()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """messages""","""controllers.Application.getMessages()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users""","""controllers.Application.getUsers()"""),("""GET""", prefix,"""controllers.Application.login()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.validateLogin()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """inscription""","""controllers.Application.inscription()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """validateInscription""","""controllers.Application.validateInscription()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """messageInscription""","""controllers.Application.messageInscription()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """page"""))
   }
}
        

// @LINE:7
case controllers_Application_addMessage1(params) => {
   call { 
        invokeHandler(controllers.Application.addMessage(), HandlerDef(this, "controllers.Application", "addMessage", Nil,"POST", """""", Routes.prefix + """message"""))
   }
}
        

// @LINE:8
case controllers_Application_getMessages2(params) => {
   call { 
        invokeHandler(controllers.Application.getMessages(), HandlerDef(this, "controllers.Application", "getMessages", Nil,"GET", """""", Routes.prefix + """messages"""))
   }
}
        

// @LINE:9
case controllers_Application_getUsers3(params) => {
   call { 
        invokeHandler(controllers.Application.getUsers(), HandlerDef(this, "controllers.Application", "getUsers", Nil,"GET", """""", Routes.prefix + """users"""))
   }
}
        

// @LINE:10
case controllers_Application_login4(params) => {
   call { 
        invokeHandler(controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Nil,"GET", """""", Routes.prefix + """"""))
   }
}
        

// @LINE:11
case controllers_Application_validateLogin5(params) => {
   call { 
        invokeHandler(controllers.Application.validateLogin(), HandlerDef(this, "controllers.Application", "validateLogin", Nil,"POST", """""", Routes.prefix + """login"""))
   }
}
        

// @LINE:12
case controllers_Application_inscription6(params) => {
   call { 
        invokeHandler(controllers.Application.inscription(), HandlerDef(this, "controllers.Application", "inscription", Nil,"GET", """""", Routes.prefix + """inscription"""))
   }
}
        

// @LINE:13
case controllers_Application_validateInscription7(params) => {
   call { 
        invokeHandler(controllers.Application.validateInscription(), HandlerDef(this, "controllers.Application", "validateInscription", Nil,"POST", """""", Routes.prefix + """validateInscription"""))
   }
}
        

// @LINE:14
case controllers_Application_messageInscription8(params) => {
   call { 
        invokeHandler(controllers.Application.messageInscription(), HandlerDef(this, "controllers.Application", "messageInscription", Nil,"GET", """""", Routes.prefix + """messageInscription"""))
   }
}
        

// @LINE:16
case controllers_Assets_at9(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     