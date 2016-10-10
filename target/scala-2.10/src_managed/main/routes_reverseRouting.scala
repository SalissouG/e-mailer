// @SOURCE:C:/Users/salis/ProjetWeb/monGit/e-mailer/conf/routes
// @HASH:02cb547bb863e9269a55baadcfa43e24a04eef4d
// @DATE:Mon Oct 10 11:37:29 CEST 2016

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:15
class ReverseAssets {
    

// @LINE:15
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

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
                                                

// @LINE:10
def validateLogin(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "login")
}
                                                

// @LINE:11
def inscription(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "inscription")
}
                                                

// @LINE:12
def validateInscription(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "validateInscription")
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "page")
}
                                                

// @LINE:9
def login(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          
}
                  


// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:15
class ReverseAssets {
    

// @LINE:15
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

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
                        

// @LINE:10
def validateLogin : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.validateLogin",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

// @LINE:11
def inscription : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.inscription",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "inscription"})
      }
   """
)
                        

// @LINE:12
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
                        

// @LINE:9
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
        


// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:15
class ReverseAssets {
    

// @LINE:15
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

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
                      

// @LINE:10
def validateLogin(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.validateLogin(), HandlerDef(this, "controllers.Application", "validateLogin", Seq(), "POST", """""", _prefix + """login""")
)
                      

// @LINE:11
def inscription(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.inscription(), HandlerDef(this, "controllers.Application", "inscription", Seq(), "GET", """""", _prefix + """inscription""")
)
                      

// @LINE:12
def validateInscription(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.validateInscription(), HandlerDef(this, "controllers.Application", "validateInscription", Seq(), "POST", """""", _prefix + """validateInscription""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """page""")
)
                      

// @LINE:9
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Seq(), "GET", """""", _prefix + """""")
)
                      
    
}
                          
}
        
    