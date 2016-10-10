package controllers;
import play.*;
import models.Message;
import models.Login;
import play.data.Form;
import play.db.ebean.Model;
import play.mvc.*;
import views.html.*;
import java.util.*;
import models.*;
import static play.libs.Json.*;

public class Application extends Controller {



    public static Result index() {
        return ok(index.render());
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

      if(loginForm.isValideLogin())
      return   ok("ok");
      else   return ok("error");


   }

   public static Result validateInscription() {
        return redirect(routes.Application.index());
   }


}
