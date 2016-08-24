/**
 * 
 */
package mum.edu.week1ExtraCredit.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;



/**
 * @author Chao Ping
 *
 */
@Entity
public class Task {
	@Id
	@GeneratedValue
	private int id;
	private String taskName;
	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	//@Temporal(TemporalType.DATE)
	private String startDate;
	//@Temporal(TemporalType.DATE)
	private String endDate;
	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	@Enumerated
	private Status status;
	@OneToMany(mappedBy = "task")
	private List<Resource> resources;
	@ManyToOne
	@JoinColumn
	private Project project;

	@OneToOne(mappedBy = "task")
	private Volunteer volunter;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}


	/**
	 * @return the status
	 */
	public Status getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(Status status) {
		this.status = status;
	}

	/**
	 * @return the resources
	 */
	public List<Resource> getResources() {
		return resources;
	}

	/**
	 * @param resources
	 *            the resources to set
	 */
	public void setResources(List<Resource> resources) {
		this.resources = resources;
	}

	/**
	 * @return the project
	 */
	public Project getProject() {
		return project;
	}

	/**
	 * @param project
	 *            the project to set
	 */
	public void setProject(Project project) {
		this.project = project;
	}

	public void addResource(Resource resource) {
		if (resource == null) {
			resources = new ArrayList<Resource>();
		}
		resources.add(resource);
	}

	public Volunteer getVolunter() {
		return volunter;
	}

	public void setVolunter(Volunteer volunter) {
		this.volunter = volunter;
		volunter.setTask(this);
	}

}
