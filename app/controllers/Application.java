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

   public static Result validateLogin() {
        return redirect(routes.Application.index());
   }


}
