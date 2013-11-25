package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

	//redirecionando o index para o metodo tasks()
    public static Result index() {
    	return redirect(routes.Application.newTask());
    }
    
    public static Result tasks(){
		return TODO;
    	
    }
    
    public static Result newTask(){
		return TODO;
    	
    }
    
    public static Result deleteTask(Long id) {
        return TODO;
      }

}
