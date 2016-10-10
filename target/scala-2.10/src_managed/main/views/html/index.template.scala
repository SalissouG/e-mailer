
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

Seq[Any](format.raw/*2.1*/("""<!DOCTYPE html>

<html>
    <head>
        <title>Test Jacoop</title>

        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*8.59*/routes/*8.65*/.Assets.at("images/favicon.png"))),format.raw/*8.97*/("""">
        <script src=""""),_display_(Seq[Any](/*9.23*/routes/*9.29*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*9.74*/("""" type="text/javascript"></script>

         <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        
         <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
         <script>
         $.ajax("""),format.raw/*15.17*/("""{"""),format.raw/*15.18*/("""
                    type : 'GET',
                    url : """"),_display_(Seq[Any](/*17.29*/routes/*17.35*/.Application.getMessages())),format.raw/*17.61*/("""",
                    dataType : "JSON",
                    success : function(data) """),format.raw/*19.46*/("""{"""),format.raw/*19.47*/("""
                     for(var i= 0; i< data.length;i++)
                      $('#messages').append('<div class="panel panel-default">'+
                                            '<div class="panel-heading"> <span class="badge" >'+(i+1)+'</span>  '+data[i].destination+' - '+data[i].objet+'</div>'+
                                            '<div class="panel-body">'+data[i].message +'</div>'+
                                            '</div>'
                                            );

                                             $('#nbr').append(data.length);


                    """),format.raw/*30.21*/("""}"""),format.raw/*30.22*/(""",
                    error : function(data) """),format.raw/*31.44*/("""{"""),format.raw/*31.45*/("""
                      $('#messages').append('error');

                    """),format.raw/*34.21*/("""}"""),format.raw/*34.22*/("""
                """),format.raw/*35.17*/("""}"""),format.raw/*35.18*/(""");

                $("#loginForm").on("submit", function()"""),format.raw/*37.56*/("""{"""),format.raw/*37.57*/("""


                  $.ajax("""),format.raw/*40.26*/("""{"""),format.raw/*40.27*/("""
                             type : 'GET',
                             url : """"),_display_(Seq[Any](/*42.38*/routes/*42.44*/.Application.getMessages())),format.raw/*42.70*/("""",
                             dataType : "JSON",
                             success : function(data) """),format.raw/*44.55*/("""{"""),format.raw/*44.56*/("""
                              for(var i= 0; i< data.length;i++)
                               $('#messages').append('<div class="panel panel-default">'+
                                                     '<div class="panel-heading"> <span class="badge" >'+(i+1)+'</span>  '+data[i].destination+' - '+data[i].objet+'</div>'+
                                                     '<div class="panel-body">'+data[i].message +'</div>'+
                                                     '</div>'
                                                     );

                                                      $('#nbr').append(data.length);


                             """),format.raw/*55.30*/("""}"""),format.raw/*55.31*/(""",
                             error : function(data) """),format.raw/*56.53*/("""{"""),format.raw/*56.54*/("""
                               $('#messages').append('error');

                             """),format.raw/*59.30*/("""}"""),format.raw/*59.31*/("""
                         """),format.raw/*60.26*/("""}"""),format.raw/*60.27*/(""");


                """),format.raw/*63.17*/("""}"""),format.raw/*63.18*/(""");
         </script>

         <script>
function openCity(evt, cityName) """),format.raw/*67.34*/("""{"""),format.raw/*67.35*/("""
  var i, x, tablinks;
  x = document.getElementsByClassName("city");
  for (i = 0; i < x.length; i++) """),format.raw/*70.34*/("""{"""),format.raw/*70.35*/("""
      x[i].style.display = "none";
  """),format.raw/*72.3*/("""}"""),format.raw/*72.4*/("""
  tablinks = document.getElementsByClassName("tablink");
  for (i = 0; i < x.length; i++) """),format.raw/*74.34*/("""{"""),format.raw/*74.35*/("""
      tablinks[i].className = tablinks[i].className.replace(" w3-red", "");
  """),format.raw/*76.3*/("""}"""),format.raw/*76.4*/("""
  document.getElementById(cityName).style.display = "block";
  evt.currentTarget.className += " w3-red";
"""),format.raw/*79.1*/("""}"""),format.raw/*79.2*/("""
</script>


         <meta name="viewport" content="width=device-width, initial-scale=1">
         <link rel="stylesheet" href="http://www.w3schools.com/lib/w3.css">
         <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.6.3/css/font-awesome.min.css">
      </head>
<body>
  <ul class="w3-navbar w3-black">
    <li><a href="#" class="tablink" onclick="openCity(event, 'nouveau');">Nouveau message</a></li>
    <li><a href="#" class="tablink" onclick="openCity(event, 'messages');">Boîte d’envoi <span class="badge" id="nbr"></span></a> </li>

  </ul>

  <div class="row">
      <div class="col-lg-12">
        &nbsp;
      </div>
  </div>

<a href=""""),_display_(Seq[Any](/*100.11*/routes/*100.17*/.Application.login)),format.raw/*100.35*/("""" ><span>Login</span></a>

  <div class="row">
      <div class="col-lg-8 col-lg-offset-2">
  <div id="nouveau" class="w3-container w3-border city  " style="display:block">
    <form action=""""),_display_(Seq[Any](/*105.20*/routes/*105.26*/.Application.addMessage())),format.raw/*105.51*/("""" method="post"  id="loginForm" >


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
             <textarea class="form-control" rows="5" name="message"></textarea>
          </div>
          <button  class="btn btn-primary active">ENVOYER</button>

  </form>
</div>

<div id="messages" class="w3-container  city" style="display:none">

                 <div  id="messages"></div>

</div>

</div>
</div>
  </body>
</html>
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Oct 10 11:37:33 CEST 2016
                    SOURCE: C:/Users/salis/ProjetWeb/monGit/e-mailer/app/views/index.scala.html
                    HASH: ea2641aac1fdd48d62a9158aa83d76757c2fcf5c
                    MATRIX: 855->2|1025->137|1039->143|1092->175|1153->201|1167->207|1233->252|1557->548|1586->549|1687->614|1702->620|1750->646|1867->735|1896->736|2533->1345|2562->1346|2636->1392|2665->1393|2772->1472|2801->1473|2847->1491|2876->1492|2965->1553|2994->1554|3053->1585|3082->1586|3201->1669|3216->1675|3264->1701|3399->1808|3428->1809|4137->2490|4166->2491|4249->2546|4278->2547|4403->2644|4432->2645|4487->2672|4516->2673|4568->2697|4597->2698|4703->2776|4732->2777|4866->2883|4895->2884|4962->2924|4990->2925|5111->3018|5140->3019|5248->3100|5276->3101|5412->3210|5440->3211|6186->3920|6202->3926|6243->3944|6477->4141|6493->4147|6541->4172
                    LINES: 29->2|35->8|35->8|35->8|36->9|36->9|36->9|42->15|42->15|44->17|44->17|44->17|46->19|46->19|57->30|57->30|58->31|58->31|61->34|61->34|62->35|62->35|64->37|64->37|67->40|67->40|69->42|69->42|69->42|71->44|71->44|82->55|82->55|83->56|83->56|86->59|86->59|87->60|87->60|90->63|90->63|94->67|94->67|97->70|97->70|99->72|99->72|101->74|101->74|103->76|103->76|106->79|106->79|127->100|127->100|127->100|132->105|132->105|132->105
                    -- GENERATED --
                */
            