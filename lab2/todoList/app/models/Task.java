package models;

import java.util.*;

import play.db.ebean.*;
import play.data.validation.Constraints.*;

import javax.persistence.*;

@Entity
public class Task extends Model {

	private static final long serialVersionUID = 5782545151195949235L;

	@Id
	private Long id;

	@Required
	private int priority;

	@Required
	private String label, project;

	private boolean done = false;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static Finder<Long, Task> find = new Finder(Long.class, Task.class);

	public static List<Task> all() {
		return find.all();
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
		delete(id);
		create(tarefa);
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
