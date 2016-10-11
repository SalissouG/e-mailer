// @SOURCE:C:/Users/salis/ProjetWeb/monGit/e-mailer/conf/routes
// @HASH:86bcaaae8cce6b31cab85da918e9407b7bf68b05
// @DATE:Tue Oct 11 18:32:27 CEST 2016

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:16
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:16
class ReverseAssets {
    

// @LINE:16
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:8
def getMessages(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "messages")
}
                                                

// @LINE:7
def addMessage(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "message")
}
                                                

// @LINE:14
def messageInscription(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "messageInscription")
}
                                                

// @LINE:11
def validateLogin(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "login")
}
                                                

// @LINE:9
def getUsers(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "users")
}
                                                

// @LINE:12
def inscription(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "inscription")
}
                                                

// @LINE:13
def validateInscription(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "validateInscription")
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "page")
}
                                                

// @LINE:10
def login(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          
}
                  


// @LINE:16
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:16
class ReverseAssets {
    

// @LINE:16
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:8
def getMessages : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.getMessages",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "messages"})
      }
   """
)
                        

// @LINE:7
def addMessage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.addMessage",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "message"})
      }
   """
)
                        

// @LINE:14
def messageInscription : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.messageInscription",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "messageInscription"})
      }
   """
)
                        

// @LINE:11
def validateLogin : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.validateLogin",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

// @LINE:9
def getUsers : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.getUsers",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users"})
      }
   """
)
                        

// @LINE:12
def inscription : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.inscription",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "inscription"})
      }
   """
)
                        

// @LINE:13
def validateInscription : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.validateInscription",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "validateInscription"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "page"})
      }
   """
)
                        

// @LINE:10
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.login",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:16
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:16
class ReverseAssets {
    

// @LINE:16
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:8
def getMessages(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.getMessages(), HandlerDef(this, "controllers.Application", "getMessages", Seq(), "GET", """""", _prefix + """messages""")
)
                      

// @LINE:7
def addMessage(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.addMessage(), HandlerDef(this, "controllers.Application", "addMessage", Seq(), "POST", """""", _prefix + """message""")
)
                      

// @LINE:14
def messageInscription(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.messageInscription(), HandlerDef(this, "controllers.Application", "messageInscription", Seq(), "GET", """""", _prefix + """messageInscription""")
)
                      

// @LINE:11
def validateLogin(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.validateLogin(), HandlerDef(this, "controllers.Application", "validateLogin", Seq(), "POST", """""", _prefix + """login""")
)
                      

// @LINE:9
def getUsers(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.getUsers(), HandlerDef(this, "controllers.Application", "getUsers", Seq(), "GET", """""", _prefix + """users""")
)
                      

// @LINE:12
def inscription(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.inscription(), HandlerDef(this, "controllers.Application", "inscription", Seq(), "GET", """""", _prefix + """inscription""")
)
                      

// @LINE:13
def validateInscription(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.validateInscription(), HandlerDef(this, "controllers.Application", "validateInscription", Seq(), "POST", """""", _prefix + """validateInscription""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """page""")
)
                      

// @LINE:10
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Seq(), "GET", """""", _prefix + """""")
)
                      
    
}
                          
}
        
    