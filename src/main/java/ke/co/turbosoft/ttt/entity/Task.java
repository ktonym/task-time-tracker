package ke.co.turbosoft.ttt.entity;

import java.util.List;

import javax.persistence.*;

@Entity
public class Task {
	
	@Id
	private Long id;
	private String name;
	@ManyToOne
	@JoinColumn(name="id_project")
	private Project project;
	@OneToMany(mappedBy="task")
	private List<TaskLog> tasklogs;
	
	public Task() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public List<TaskLog> getTasklogs() {
		return tasklogs;
	}

	public void setTasklogs(List<TaskLog> tasklogs) {
		this.tasklogs = tasklogs;
	}	
	
	
}
