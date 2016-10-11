
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*2.2*/main("Test Jacoop")/*2.21*/{_display_(Seq[Any](format.raw/*2.22*/("""
  <ul class="w3-navbar w3-black">
    <li><a href="#" class="tablink" onclick="openCity(event, 'nouveau');">  Nouveau message</a></li>
    <li><a href="#" class="tablink" onclick="openCity(event, 'messages');">  Boîte d’envoi <span class="badge" id="nbr"></span></a> </li>
  </ul>

  <div class="row">
      <div class="col-lg-12">
           &nbsp;
      </div>
  </div>

  <div class="row">
      <div class="col-lg-8 col-lg-offset-2">
  <div id="nouveau" class="w3-container w3-border city  " style="display:block">
    <form   id="messageForm" >


          <div class="form-group">
             <label for="destination">Destination:</label>
             <input type="email" class="form-control" id="destination" name="destination">
           </div>

           <div class="form-group">
              <label for="objet">Object:</label>
              <input type="text" class="form-control" id="objet" name="objet">
            </div>


           <div class="form-group">
             <label for="comment">Message:</label>
             <textarea class="form-control" rows="5"  id="message" name="message"></textarea>
          </div>
          <button  class="btn btn-primary active"> ENVOYER</button>

  </form>
</div>

<div id="messages" class="w3-container  city" style="display:none">
</div>


</div>
</div>

""")))})),format.raw/*47.2*/("""
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Oct 11 22:39:19 CEST 2016
                    SOURCE: C:/Users/salis/ProjetWeb/monGit/e-mailer/app/views/index.scala.html
                    HASH: 25c94e76bfc327655eccacee4af0fc982767de76
                    MATRIX: 864->3|891->22|929->23|2325->1388
                    LINES: 29->2|29->2|29->2|74->47
                    -- GENERATED --
                */
            