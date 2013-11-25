package controllers;

import play.*;
import play.data.*;
import play.mvc.*;
import models.*;
import views.html.*;

public class Application extends Controller {

	static Form<Task> taskForm = Form.form(Task.class);
	
	//redirecionando o index para o metodo tasks()
    public static Result index() {
    	return redirect(routes.Application.tasks());
    }
    
    public static Result tasks(){
    	return ok(views.html.index.render(Task.all(), taskForm));
    	
    }
    
    public static Result newTask(){
		return TODO;
    	
    }
    
    public static Result deleteTask(Long id) {
        return TODO;
      }

}
