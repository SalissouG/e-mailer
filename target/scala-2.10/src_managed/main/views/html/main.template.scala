
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
 """),format.raw/*153.2*/("""}"""),format.raw/*153.3*/("""

function getAllMessages()
  """),format.raw/*156.3*/("""{"""),format.raw/*156.4*/("""

    $.ajax("""),format.raw/*158.12*/("""{"""),format.raw/*158.13*/("""
             type : 'GET',
             url : """"),_display_(Seq[Any](/*160.22*/routes/*160.28*/.Application.getMessages())),format.raw/*160.54*/("""",
             dataType : "JSON",
             success : function(data) """),format.raw/*162.39*/("""{"""),format.raw/*162.40*/("""
               $('#messages').html('');
              for(var i= 0; i< data.length;i++)
              """),format.raw/*165.15*/("""{"""),format.raw/*165.16*/("""

                $('#messages').append('<div class="panel panel-default">'+
                                      '<div class="panel-heading">  Destinataire: '+data[i].destination+'  </br>  Objet: '+data[i].objet+'</div>'+
                                      '<div class="panel-body">'+data[i].message +'</div>'+
                                      '</div>'
                                      );
              """),format.raw/*172.15*/("""}"""),format.raw/*172.16*/("""

                                     $('#nbr').html('');
                                    $('#nbr').append(data.length);


             """),format.raw/*178.14*/("""}"""),format.raw/*178.15*/(""",
             error : function(data) """),format.raw/*179.37*/("""{"""),format.raw/*179.38*/("""
               $('#messages').append('error');

             """),format.raw/*182.14*/("""}"""),format.raw/*182.15*/("""
         """),format.raw/*183.10*/("""}"""),format.raw/*183.11*/(""");
"""),format.raw/*184.1*/("""}"""),format.raw/*184.2*/("""

function getAllUsers()
  """),format.raw/*187.3*/("""{"""),format.raw/*187.4*/("""$.ajax("""),format.raw/*187.11*/("""{"""),format.raw/*187.12*/("""
             type : 'GET',
             url : """"),_display_(Seq[Any](/*189.22*/routes/*189.28*/.Application.getUsers())),format.raw/*189.51*/("""",
             dataType : "JSON",
             success : function(data) """),format.raw/*191.39*/("""{"""),format.raw/*191.40*/("""
              for(var i= 0; i< data.length;i++)
               $('#users').append('<div class="panel panel-default">'+
                                     '<div class="panel-heading">  Nom: '+data[i].nom+' </div>'+
                                     '<div class="panel-body"></div>'+
                                     '</div>'
                                     );
             """),format.raw/*198.14*/("""}"""),format.raw/*198.15*/(""",
             error : function(data) """),format.raw/*199.37*/("""{"""),format.raw/*199.38*/("""
               $('#users').append('error');

             """),format.raw/*202.14*/("""}"""),format.raw/*202.15*/("""
         """),format.raw/*203.10*/("""}"""),format.raw/*203.11*/(""");
"""),format.raw/*204.1*/("""}"""),format.raw/*204.2*/("""


$("#loginForm").on("submit", function()"""),format.raw/*207.40*/("""{"""),format.raw/*207.41*/("""
  $.ajax("""),format.raw/*208.10*/("""{"""),format.raw/*208.11*/("""
                       type : 'GET',
                       url : """"),_display_(Seq[Any](/*210.32*/routes/*210.38*/.Application.getMessages())),format.raw/*210.64*/("""",
                       dataType : "JSON",
                       success : function(data) """),format.raw/*212.49*/("""{"""),format.raw/*212.50*/("""
                        for(var i= 0; i< data.length;i++)
                         $('#messages').append('<div class="panel panel-default">'+
                                               '<div class="panel-heading"> <span class="badge" >'+(i+1)+'</span>  '+data[i].destination+' - '+data[i].objet+'</div>'+
                                               '<div class="panel-body">'+data[i].message +'</div>'+
                                               '</div>'
                                               );

                                                $('#nbr').append(data.length);
                       """),format.raw/*221.24*/("""}"""),format.raw/*221.25*/(""",
                       error : function(data) """),format.raw/*222.47*/("""{"""),format.raw/*222.48*/("""
                         $('#messages').append('error');

                       """),format.raw/*225.24*/("""}"""),format.raw/*225.25*/("""
      """),format.raw/*226.7*/("""}"""),format.raw/*226.8*/(""");
  """),format.raw/*227.3*/("""}"""),format.raw/*227.4*/(""");
</script>

   <script>
 function openCity(evt, cityName) """),format.raw/*231.35*/("""{"""),format.raw/*231.36*/("""
     var i, x, tablinks;
     x = document.getElementsByClassName("city");
     for (i = 0; i < x.length; i++) """),format.raw/*234.37*/("""{"""),format.raw/*234.38*/("""
              x[i].style.display = "none";
         """),format.raw/*236.10*/("""}"""),format.raw/*236.11*/("""
     tablinks = document.getElementsByClassName("tablink");
     for (i = 0; i < x.length; i++) """),format.raw/*238.37*/("""{"""),format.raw/*238.38*/("""
               tablinks[i].className = tablinks[i].className.replace(" w3-red", "");
             """),format.raw/*240.14*/("""}"""),format.raw/*240.15*/("""
     document.getElementById(cityName).style.display = "block";
     evt.currentTarget.className += " w3-red";
 """),format.raw/*243.2*/("""}"""),format.raw/*243.3*/("""
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
                    DATE: Tue Oct 11 22:41:13 CEST 2016
                    SOURCE: C:/Users/salis/ProjetWeb/monGit/e-mailer/app/views/main.scala.html
                    HASH: f921ba4d44db38a451fdade08f49495f33f80aa3
                    MATRIX: 778->1|902->31|996->90|1022->95|1127->165|1141->171|1194->203|1256->229|1271->235|1332->274|1443->349|1458->355|1523->398|1585->424|1600->430|1664->472|1736->508|1751->514|1813->554|1907->612|1922->618|1988->662|2113->751|2128->757|2196->802|2289->859|2304->865|2368->906|2618->1120|2647->1127|2745->1197|2774->1198|3095->1491|3124->1492|3218->1550|3233->1556|3283->1584|3401->1674|3430->1675|3515->1732|3544->1733|3659->1820|3688->1821|3776->1873|3791->1879|3831->1897|3882->1920|3911->1921|3981->1963|4010->1964|4111->2037|4140->2038|4182->2052|4211->2053|4249->2064|4277->2065|4361->2121|4390->2122|5274->2978|5303->2979|5397->3037|5412->3043|5468->3077|5586->3167|5615->3168|5710->3235|5739->3236|5829->3290|5844->3296|5897->3327|5954->3356|5983->3357|6073->3419|6102->3420|6172->3462|6201->3463|6302->3536|6331->3537|6374->3551|6404->3552|6443->3563|6472->3564|6552->3615|6582->3616|7005->4010|7035->4011|7130->4069|7146->4075|7194->4100|7313->4190|7343->4191|7434->4253|7464->4254|7711->4472|7741->4473|7794->4497|7824->4498|7895->4540|7925->4541|8027->4614|8057->4615|8100->4629|8130->4630|8169->4641|8198->4642|8274->4690|8303->4691|8357->4717|8386->4718|8447->4751|8476->4752|8520->4767|8550->4768|8638->4819|8654->4825|8703->4851|8807->4926|8837->4927|8972->5033|9002->5034|9456->5459|9486->5460|9662->5607|9692->5608|9760->5647|9790->5648|9884->5713|9914->5714|9954->5725|9984->5726|10016->5730|10045->5731|10103->5761|10132->5762|10168->5769|10198->5770|10286->5821|10302->5827|10348->5850|10452->5925|10482->5926|10905->6320|10935->6321|11003->6360|11033->6361|11124->6423|11154->6424|11194->6435|11224->6436|11256->6440|11285->6441|11359->6486|11389->6487|11429->6498|11459->6499|11567->6570|11583->6576|11632->6602|11756->6697|11786->6698|12444->7327|12474->7328|12552->7377|12582->7378|12696->7463|12726->7464|12762->7472|12791->7473|12825->7479|12854->7480|12947->7544|12977->7545|13121->7660|13151->7661|13235->7716|13265->7717|13393->7816|13423->7817|13553->7918|13583->7919|13727->8035|13756->8036
                    LINES: 26->1|29->1|35->7|35->7|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|51->23|51->23|54->26|54->26|66->38|66->38|68->40|68->40|68->40|70->42|70->42|72->44|72->44|76->48|76->48|77->49|77->49|77->49|79->51|79->51|80->52|80->52|83->55|83->55|84->56|84->56|87->59|87->59|91->63|91->63|111->83|111->83|113->85|113->85|113->85|115->87|115->87|118->90|118->90|119->91|119->91|119->91|120->92|120->92|123->95|123->95|124->96|124->96|127->99|127->99|128->100|128->100|131->103|131->103|133->105|133->105|146->118|146->118|148->120|148->120|148->120|150->122|150->122|153->125|153->125|162->134|162->134|166->138|166->138|167->139|167->139|170->142|170->142|171->143|171->143|174->146|174->146|179->151|179->151|181->153|181->153|184->156|184->156|186->158|186->158|188->160|188->160|188->160|190->162|190->162|193->165|193->165|200->172|200->172|206->178|206->178|207->179|207->179|210->182|210->182|211->183|211->183|212->184|212->184|215->187|215->187|215->187|215->187|217->189|217->189|217->189|219->191|219->191|226->198|226->198|227->199|227->199|230->202|230->202|231->203|231->203|232->204|232->204|235->207|235->207|236->208|236->208|238->210|238->210|238->210|240->212|240->212|249->221|249->221|250->222|250->222|253->225|253->225|254->226|254->226|255->227|255->227|259->231|259->231|262->234|262->234|264->236|264->236|266->238|266->238|268->240|268->240|271->243|271->243
                    -- GENERATED --
                */
            