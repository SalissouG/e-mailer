
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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(message: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(Seq[Any](/*3.2*/main("Welcome to Play")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""

<ul id="persons"></ul>


  <script src='"""),_display_(Seq[Any](/*8.17*/routes/*8.23*/.Assets.at("public/javascripts/index.min.js"))),format.raw/*8.68*/("""' >  </script>


    <form action=""""),_display_(Seq[Any](/*11.20*/routes/*11.26*/.Application.addPerson())),format.raw/*11.50*/("""" method="post">
      <input type="text" name="name" />
      <button>Add Person</button>
    </form>




""")))})),format.raw/*19.2*/("""
"""))}
    }
    
    def render(message:String): play.api.templates.HtmlFormat.Appendable = apply(message)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Oct 07 21:19:29 CEST 2016
                    SOURCE: C:/Users/salis/test/app/views/index.scala.html
                    HASH: 1b5e7b7828210523400016a8f312069d5e547841
                    MATRIX: 774->1|885->18|922->21|953->44|992->46|1070->89|1084->95|1150->140|1222->176|1237->182|1283->206|1422->314
                    LINES: 26->1|29->1|31->3|31->3|31->3|36->8|36->8|36->8|39->11|39->11|39->11|47->19
                    -- GENERATED --
                */
            