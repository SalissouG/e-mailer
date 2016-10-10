
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
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String)(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.32*/("""

<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(Seq[Any](/*7.17*/title)),format.raw/*7.22*/("""</title>

        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*9.59*/routes/*9.65*/.Assets.at("images/favicon.png"))),format.raw/*9.97*/("""">
        <script src=""""),_display_(Seq[Any](/*10.23*/routes/*10.29*/.Assets.at("javascripts/jquery.min.js"))),format.raw/*10.68*/("""" type="text/javascript"></script>
        <link rel="stylesheet"  href=""""),_display_(Seq[Any](/*11.40*/routes/*11.46*/.Assets.at("stylesheets/bootstrap.min.css"))),format.raw/*11.89*/("""">
        <script src=""""),_display_(Seq[Any](/*12.23*/routes/*12.29*/.Assets.at("javascripts/bootstrap.min.js"))),format.raw/*12.71*/("""" ></script>
        <script src=""""),_display_(Seq[Any](/*13.23*/routes/*13.29*/.Assets.at("javascripts/sweetalert2.js"))),format.raw/*13.69*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*14.23*/routes/*14.29*/.Assets.at("javascripts/sweetalert2.min.js"))),format.raw/*14.73*/("""" type="text/javascript"></script>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*15.54*/routes/*15.60*/.Assets.at("stylesheets/sweetalert2.min.css"))),format.raw/*15.105*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*16.54*/routes/*16.60*/.Assets.at("stylesheets/sweetalert2.css"))),format.raw/*16.101*/("""">

        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="http://www.w3schools.com/lib/w3.css">

   </head>
   <body onload="loading();">
        """),_display_(Seq[Any](/*23.10*/content)),format.raw/*23.17*/("""
   </body>
   <script>
   $("#loginForm").on("submit", function(e)"""),format.raw/*26.44*/("""{"""),format.raw/*26.45*/("""

   e.preventDefault();

   var email = $('#email').val();
   var mdp = $('#mdp').val();

   if(email=="" && mdp=="")
   swal('Le formulaire est vide')
   else if(email=="" || mdp=="")
          swal('Il manque des informations sur le formulaire')
          else
          $.ajax("""),format.raw/*38.18*/("""{"""),format.raw/*38.19*/("""
                type : 'POST',
                url : """"),_display_(Seq[Any](/*40.25*/routes/*40.31*/.Application.validateLogin())),format.raw/*40.59*/("""",
                data : $(this).serialize(),
                success : function(data) """),format.raw/*42.42*/("""{"""),format.raw/*42.43*/("""
                  if(data=="error")
                  """),format.raw/*44.19*/("""{"""),format.raw/*44.20*/("""

                    swal('Email ou mot de passe incorrect.')

                   """),format.raw/*48.20*/("""}"""),format.raw/*48.21*/("""
                   else $(location).attr('href',""""),_display_(Seq[Any](/*49.51*/routes/*49.57*/.Application.index)),format.raw/*49.75*/("""");

                """),format.raw/*51.17*/("""}"""),format.raw/*51.18*/(""",
                error : function(data) """),format.raw/*52.40*/("""{"""),format.raw/*52.41*/("""

                     alert("error dans la requete")
                """),format.raw/*55.17*/("""}"""),format.raw/*55.18*/("""
            """),format.raw/*56.13*/("""}"""),format.raw/*56.14*/(""");


   """),format.raw/*59.4*/("""}"""),format.raw/*59.5*/(""");



$("#inscriptionForm").on("submit", function(e)"""),format.raw/*63.47*/("""{"""),format.raw/*63.48*/("""
   e.preventDefault();

   var nom = $('#nom').val();
   var emailInscription = $('#emailInscription').val();
   var emailConfirmation = $('#emailConfirmation').val();
   var mdpInscription = $('#mdpInscription').val();
   var mdpConfirmation = $('#mdpConfirmation').val();

if(emailInscription=="" && emailConfirmation=="" && mdpInscription=="" &&  mdpConfirmation=="" && nom=="")
swal('Le formulaire est vide')
else
   if(emailInscription=="" || emailConfirmation=="" || mdpInscription=="" ||  mdpConfirmation=="" || nom=="")
   swal('Il manque des informations sur le formulaire')
   else
   if(emailInscription!=emailConfirmation)
     swal('Les deux emails ne sont pas identiques')
     else if(mdpInscription!=mdpConfirmation)
           swal('Les deux mots de passes ne sont pas identiques')
          else
              $.ajax("""),format.raw/*83.22*/("""{"""),format.raw/*83.23*/("""
                type : 'POST',
                url : """"),_display_(Seq[Any](/*85.25*/routes/*85.31*/.Application.validateInscription())),format.raw/*85.65*/("""",
                data : $(this).serialize(),
                success : function(data) """),format.raw/*87.42*/("""{"""),format.raw/*87.43*/("""

                       if(data=="ok")
                        """),format.raw/*90.25*/("""{"""),format.raw/*90.26*/("""
                          $(location).attr('href',""""),_display_(Seq[Any](/*91.53*/routes/*91.59*/.Application.messageInscription)),format.raw/*91.90*/("""");
                        """),format.raw/*92.25*/("""}"""),format.raw/*92.26*/("""
                        else  swal(data)

                """),format.raw/*95.17*/("""}"""),format.raw/*95.18*/(""",
                error : function(data) """),format.raw/*96.40*/("""{"""),format.raw/*96.41*/("""

                     alert("error dans la requete")
                """),format.raw/*99.17*/("""}"""),format.raw/*99.18*/("""
            """),format.raw/*100.13*/("""}"""),format.raw/*100.14*/(""");


   """),format.raw/*103.4*/("""}"""),format.raw/*103.5*/(""");

   $("#messageForm").on("submit", function(e)"""),format.raw/*105.46*/("""{"""),format.raw/*105.47*/("""

   e.preventDefault();

   var destination = $('#destination').val();
   var objet = $('#objet').val();
   var message = $('#message').val();

   if(destination=="" && objet=="" && message=="")
   swal('Le formulaire est vide')
   else if(destination=="" || objet=="" || message=="")
          swal('Il manque des informations sur le formulaire')
          else
          $.ajax("""),format.raw/*118.18*/("""{"""),format.raw/*118.19*/("""
                type : 'POST',
                url : """"),_display_(Seq[Any](/*120.25*/routes/*120.31*/.Application.addMessage())),format.raw/*120.56*/("""",
                data : $(this).serialize(),
                success : function(data) """),format.raw/*122.42*/("""{"""),format.raw/*122.43*/("""

                     if(data=="ok")
                     """),format.raw/*125.22*/("""{"""),format.raw/*125.23*/("""

                       $('#destination').val("");
                       $('#objet').val("");
                       $('#message').val("");

                         getAllMessages();


                     """),format.raw/*134.22*/("""}"""),format.raw/*134.23*/("""



                """),format.raw/*138.17*/("""}"""),format.raw/*138.18*/(""",
                error : function(data) """),format.raw/*139.40*/("""{"""),format.raw/*139.41*/("""

                     alert("error dans la requete")
                """),format.raw/*142.17*/("""}"""),format.raw/*142.18*/("""
            """),format.raw/*143.13*/("""}"""),format.raw/*143.14*/(""");


   """),format.raw/*146.4*/("""}"""),format.raw/*146.5*/(""");
</script>

<script>
function loading()
 """),format.raw/*151.2*/("""{"""),format.raw/*151.3*/("""
     getAllMessages()
     
 """),format.raw/*154.2*/("""}"""),format.raw/*154.3*/("""

function getAllMessages()
  """),format.raw/*157.3*/("""{"""),format.raw/*157.4*/("""$.ajax("""),format.raw/*157.11*/("""{"""),format.raw/*157.12*/("""
             type : 'GET',
             url : """"),_display_(Seq[Any](/*159.22*/routes/*159.28*/.Application.getMessages())),format.raw/*159.54*/("""",
             dataType : "JSON",
             success : function(data) """),format.raw/*161.39*/("""{"""),format.raw/*161.40*/("""
              for(var i= 0; i< data.length;i++)
               $('#messages').append('<div class="panel panel-default">'+
                                     '<div class="panel-heading">  Destinataire: '+data[i].destination+'  </br>  Objet: '+data[i].objet+'</div>'+
                                     '<div class="panel-body">'+data[i].message +'</div>'+
                                     '</div>'
                                     );

                                      $('#nbr').append(data.length);


             """),format.raw/*172.14*/("""}"""),format.raw/*172.15*/(""",
             error : function(data) """),format.raw/*173.37*/("""{"""),format.raw/*173.38*/("""
               $('#messages').append('error');

             """),format.raw/*176.14*/("""}"""),format.raw/*176.15*/("""
         """),format.raw/*177.10*/("""}"""),format.raw/*177.11*/(""");
"""),format.raw/*178.1*/("""}"""),format.raw/*178.2*/("""

function getAllUsers()
  """),format.raw/*181.3*/("""{"""),format.raw/*181.4*/("""$.ajax("""),format.raw/*181.11*/("""{"""),format.raw/*181.12*/("""
             type : 'GET',
             url : """"),_display_(Seq[Any](/*183.22*/routes/*183.28*/.Application.getUsers())),format.raw/*183.51*/("""",
             dataType : "JSON",
             success : function(data) """),format.raw/*185.39*/("""{"""),format.raw/*185.40*/("""
              for(var i= 0; i< data.length;i++)
               $('#users').append('<div class="panel panel-default">'+
                                     '<div class="panel-heading">  Nom: '+data[i].nom+' </div>'+
                                     '<div class="panel-body"></div>'+
                                     '</div>'
                                     );
             """),format.raw/*192.14*/("""}"""),format.raw/*192.15*/(""",
             error : function(data) """),format.raw/*193.37*/("""{"""),format.raw/*193.38*/("""
               $('#users').append('error');

             """),format.raw/*196.14*/("""}"""),format.raw/*196.15*/("""
         """),format.raw/*197.10*/("""}"""),format.raw/*197.11*/(""");
"""),format.raw/*198.1*/("""}"""),format.raw/*198.2*/("""


$("#loginForm").on("submit", function()"""),format.raw/*201.40*/("""{"""),format.raw/*201.41*/("""
  $.ajax("""),format.raw/*202.10*/("""{"""),format.raw/*202.11*/("""
                       type : 'GET',
                       url : """"),_display_(Seq[Any](/*204.32*/routes/*204.38*/.Application.getMessages())),format.raw/*204.64*/("""",
                       dataType : "JSON",
                       success : function(data) """),format.raw/*206.49*/("""{"""),format.raw/*206.50*/("""
                        for(var i= 0; i< data.length;i++)
                         $('#messages').append('<div class="panel panel-default">'+
                                               '<div class="panel-heading"> <span class="badge" >'+(i+1)+'</span>  '+data[i].destination+' - '+data[i].objet+'</div>'+
                                               '<div class="panel-body">'+data[i].message +'</div>'+
                                               '</div>'
                                               );

                                                $('#nbr').append(data.length);
                       """),format.raw/*215.24*/("""}"""),format.raw/*215.25*/(""",
                       error : function(data) """),format.raw/*216.47*/("""{"""),format.raw/*216.48*/("""
                         $('#messages').append('error');

                       """),format.raw/*219.24*/("""}"""),format.raw/*219.25*/("""
      """),format.raw/*220.7*/("""}"""),format.raw/*220.8*/(""");
  """),format.raw/*221.3*/("""}"""),format.raw/*221.4*/(""");
</script>

   <script>
 function openCity(evt, cityName) """),format.raw/*225.35*/("""{"""),format.raw/*225.36*/("""
     var i, x, tablinks;
     x = document.getElementsByClassName("city");
     for (i = 0; i < x.length; i++) """),format.raw/*228.37*/("""{"""),format.raw/*228.38*/("""
              x[i].style.display = "none";
         """),format.raw/*230.10*/("""}"""),format.raw/*230.11*/("""
     tablinks = document.getElementsByClassName("tablink");
     for (i = 0; i < x.length; i++) """),format.raw/*232.37*/("""{"""),format.raw/*232.38*/("""
               tablinks[i].className = tablinks[i].className.replace(" w3-red", "");
             """),format.raw/*234.14*/("""}"""),format.raw/*234.15*/("""
     document.getElementById(cityName).style.display = "block";
     evt.currentTarget.className += " w3-red";
 """),format.raw/*237.2*/("""}"""),format.raw/*237.3*/("""
 </script>
</html>
"""))}
    }
    
    def render(title:String,content:Html): play.api.templates.HtmlFormat.Appendable = apply(title)(content)
    
    def f:((String) => (Html) => play.api.templates.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Oct 10 21:41:19 CEST 2016
                    SOURCE: C:/Users/salis/ProjetWeb/monGit/e-mailer/app/views/main.scala.html
                    HASH: 7307c1b053b3d9d0a54a34419cc339c7a9fe302e
                    MATRIX: 778->1|902->31|996->90|1022->95|1127->165|1141->171|1194->203|1256->229|1271->235|1332->274|1443->349|1458->355|1523->398|1585->424|1600->430|1664->472|1736->508|1751->514|1813->554|1907->612|1922->618|1988->662|2113->751|2128->757|2196->802|2289->859|2304->865|2368->906|2618->1120|2647->1127|2745->1197|2774->1198|3095->1491|3124->1492|3218->1550|3233->1556|3283->1584|3401->1674|3430->1675|3515->1732|3544->1733|3659->1820|3688->1821|3776->1873|3791->1879|3831->1897|3882->1920|3911->1921|3981->1963|4010->1964|4111->2037|4140->2038|4182->2052|4211->2053|4249->2064|4277->2065|4361->2121|4390->2122|5274->2978|5303->2979|5397->3037|5412->3043|5468->3077|5586->3167|5615->3168|5710->3235|5739->3236|5829->3290|5844->3296|5897->3327|5954->3356|5983->3357|6073->3419|6102->3420|6172->3462|6201->3463|6302->3536|6331->3537|6374->3551|6404->3552|6443->3563|6472->3564|6552->3615|6582->3616|7005->4010|7035->4011|7130->4069|7146->4075|7194->4100|7313->4190|7343->4191|7434->4253|7464->4254|7711->4472|7741->4473|7794->4497|7824->4498|7895->4540|7925->4541|8027->4614|8057->4615|8100->4629|8130->4630|8169->4641|8198->4642|8274->4690|8303->4691|8364->4724|8393->4725|8454->4758|8483->4759|8519->4766|8549->4767|8637->4818|8653->4824|8702->4850|8806->4925|8836->4926|9407->5468|9437->5469|9505->5508|9535->5509|9629->5574|9659->5575|9699->5586|9729->5587|9761->5591|9790->5592|9848->5622|9877->5623|9913->5630|9943->5631|10031->5682|10047->5688|10093->5711|10197->5786|10227->5787|10650->6181|10680->6182|10748->6221|10778->6222|10869->6284|10899->6285|10939->6296|10969->6297|11001->6301|11030->6302|11104->6347|11134->6348|11174->6359|11204->6360|11312->6431|11328->6437|11377->6463|11501->6558|11531->6559|12189->7188|12219->7189|12297->7238|12327->7239|12441->7324|12471->7325|12507->7333|12536->7334|12570->7340|12599->7341|12692->7405|12722->7406|12866->7521|12896->7522|12980->7577|13010->7578|13138->7677|13168->7678|13298->7779|13328->7780|13472->7896|13501->7897
                    LINES: 26->1|29->1|35->7|35->7|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|51->23|51->23|54->26|54->26|66->38|66->38|68->40|68->40|68->40|70->42|70->42|72->44|72->44|76->48|76->48|77->49|77->49|77->49|79->51|79->51|80->52|80->52|83->55|83->55|84->56|84->56|87->59|87->59|91->63|91->63|111->83|111->83|113->85|113->85|113->85|115->87|115->87|118->90|118->90|119->91|119->91|119->91|120->92|120->92|123->95|123->95|124->96|124->96|127->99|127->99|128->100|128->100|131->103|131->103|133->105|133->105|146->118|146->118|148->120|148->120|148->120|150->122|150->122|153->125|153->125|162->134|162->134|166->138|166->138|167->139|167->139|170->142|170->142|171->143|171->143|174->146|174->146|179->151|179->151|182->154|182->154|185->157|185->157|185->157|185->157|187->159|187->159|187->159|189->161|189->161|200->172|200->172|201->173|201->173|204->176|204->176|205->177|205->177|206->178|206->178|209->181|209->181|209->181|209->181|211->183|211->183|211->183|213->185|213->185|220->192|220->192|221->193|221->193|224->196|224->196|225->197|225->197|226->198|226->198|229->201|229->201|230->202|230->202|232->204|232->204|232->204|234->206|234->206|243->215|243->215|244->216|244->216|247->219|247->219|248->220|248->220|249->221|249->221|253->225|253->225|256->228|256->228|258->230|258->230|260->232|260->232|262->234|262->234|265->237|265->237
                    -- GENERATED --
                */
            