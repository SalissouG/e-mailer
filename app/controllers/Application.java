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
         return ok("ok");
    }

    public static Result getMessages() {
        List<Message> messages = new Model.Finder(String.class, Message.class).all();
        return ok(toJson(messages));
    }

    public static Result getUsers() {
        List<User> users = new Model.Finder(String.class, User.class).all();
        return ok(toJson(users));
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

  public static Result messageInscription() {
  return ok(
      messageInscription.render()

  );
 }

   public static Result validateLogin() {
      Login  loginForm =  Form.form(Login.class).bindFromRequest().get();
      List<User> users = new Model.Finder(String.class, User.class).all();
      if(isValideLogin(loginForm,users))
      return   ok("ok");
      else   return ok("error");
   }

   public static boolean isValideLogin(Login loginForm,  List<User> users)
   {
     for(int i=0; i<users.size(); i++)
     {
        if(loginForm.email.equals(users.get(i).getEmail())
              && loginForm.mdp.equals(users.get(i).getMdp()))
              {
                return true;

              }

     }

      return false;
   }

   public static Result validateInscription() {

     Inscription  inscriptionForm =  Form.form(Inscription.class).bindFromRequest().get();
     User user = new User(inscriptionForm.nom, inscriptionForm.emailInscription, inscriptionForm.mdpInscription);

     List<User> users = new Model.Finder(String.class, User.class).all();
     return  ok(inscriptionManager(user,users));


  }

    public static String inscriptionManager(User user,  List<User> users)
    {
      for(int i=0; i<users.size(); i++)
      {
        if(users.get(i).getNom().equals(user.getNom())
                 && users.get(i).getEmail().equals(user.getEmail()))
         return "Vous vous êtes déjà inscrit(e).";
         else if (users.get(i).getNom().equals(user.getNom()) )
               return "Ce nom d'utilisateur existe déjà.";
               else if(users.get(i).getEmail().equals(user.getEmail()))
                    return "Un utilisteur est enregistré avec la même adresse mail.";
        }
        user.save();

        return "ok";
      }

}
