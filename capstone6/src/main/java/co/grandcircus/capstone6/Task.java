package co.grandcircus.capstone6;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name="task")
public class Task {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id = 0;
	private String description;
	private Date duedate; // java.sql.Date, not the regular Date class
	private boolean complete;
	
	@ManyToOne
	private Taskuser taskuser;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDuedate() {
		return duedate;
	}
	public void setDuedate(Date thedate) {
		this.duedate = thedate;
	}
	public boolean isComplete() {
		return complete;
	}
	public void setComplete(boolean complete) {
		this.complete = complete;
	}
	
	public Task() { }
	public Taskuser getTaskuser() {
		return taskuser;
	}
	public void setTaskuser(Taskuser taskuser) {
		this.taskuser = taskuser;
	}
}
