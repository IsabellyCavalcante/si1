package models;

import java.util.*;

import play.db.ebean.*;
import play.data.validation.Constraints.*;

import javax.persistence.*;

@SuppressWarnings("rawtypes")
@Entity
public class Task extends Model implements Comparable {

	private static final long serialVersionUID = 5782545151195949235L;

	@Id
	private Long id;

	@Required
	private int priority;

	@Required
	private String label, project;

	private boolean done = false;

	@SuppressWarnings({"unchecked"})
	public static Finder<Long, Task> find = new Finder(Long.class, Task.class);

	@SuppressWarnings("unchecked")
	public static List<Task> all() {
		List<Task> list = find.all();
		Collections.sort(list);
        
        return list;
	}

	public static void create(Task task) {
		task.save();
	}

	public static void delete(Long id) {
		find.ref(id).delete();
	}

	public static void update(Long id) {
		Task tarefa = find.ref(id);
		tarefa.setDone(true);
		create(tarefa);
	}

	
	@Override
	public int compareTo(Object arg0) {
		 return priority - ((Task) arg0).getPriority();
	}

	public Long getId() {
		return id;
	}

	public int getPriority() {
		return priority;
	}

	public String getLabel() {
		return label;
	}

	public String getProject() {
		return project;
	}

	public boolean isDone() {
		return done;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

}
