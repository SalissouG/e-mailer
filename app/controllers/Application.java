package controllers;
import play.*;
import models.Message;
import play.data.Form;
import play.db.ebean.Model;
import play.mvc.*;
import views.html.*;
import java.util.*;
import models.*;

import static play.libs.Json.toJson;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }

    public static Result addMessage() {
         Message message = Form.form(Message.class).bindFromRequest().get();
         message.save();
         return redirect(routes.Application.index());
    }

    public static Result getMessages() {
        List<Message> messages = new Model.Finder(String.class, Message.class).all();
        return ok(toJson(messages));
    }

    public static Result login() {
    return ok(
        login.render()
    );
   }

   public static Result inscription() {
   return ok(
       inscription.render()
   );
  }


   public static Result validateLogin() {
     Login  loginForm =  Form.form(Login.class).bindFromRequest().get();

     if(loginForm.email.equals("sgarbadjibo@yahoo.com") && loginForm.mdp.equals("123"))
     return redirect(routes.Application.index());
     else return redirect(routes.Application.login());
   }

   public static Result validateInscription() {
        return redirect(routes.Application.index());
   }



}
