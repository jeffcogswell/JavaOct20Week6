package co.grandcircus.capstone6;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="taskuser")
public class Taskuser {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id = 0;
	private String email;
	private String password;
	
	@OneToMany(mappedBy="taskuser")
	private List<Task> tasks;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public List<Task> getTasks() {
		return tasks;
	}
	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}
	
	public Taskuser() { }
	
}
