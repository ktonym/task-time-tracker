package ke.co.turbosoft.ttt.entity;

import java.util.List;

import javax.persistence.*;

@Entity
public class Project {
	
	@Id
	private Long id;
	private String name;
	@ManyToOne
	@JoinColumn(name="id_company")
	private Company company;
	@OneToMany(mappedBy="project")
	private List<Task> tasks;	
	
	public Project() {
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

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public List<Task> getTasks() {
		return tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}
	
	

}
