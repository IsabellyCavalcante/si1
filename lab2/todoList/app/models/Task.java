package models;

import java.util.*;

import play.db.ebean.*;
import play.data.validation.Constraints.*;

import javax.persistence.*;

@Entity
public class Task extends Model{

	private static final long serialVersionUID = 5782545151195949235L;

	@Id
	private Long id;
	
	@Required
	private int priority;
	
	@Required
	private String label, project;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static Finder<Long,Task> find = new Finder(Long.class, Task.class);
	
	public static List<Task> all() {
		return find.all();
		
		
	}

	public static void create(Task task) {
		task.save();
	}

	public static void delete(Long id) {
		find.ref(id).delete();
	}
	
	public Long getId(){
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

}
