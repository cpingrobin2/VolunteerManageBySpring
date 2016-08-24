/**
 * 
 */
package mum.edu.week1ExtraCredit.domain;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Chao Ping
 *
 */
@Entity
public class Project {
	@Id
	@GeneratedValue
	private int id;
	private String description;
	//@Temporal(TemporalType.DATE)
	private String startDate;
	//@Temporal(TemporalType.DATE)
	private String endDate;
	@Enumerated
	private Status status;
	@OneToOne
	@JoinColumn(name="project_admin")
	private User projectAdmin;
	@OneToMany(mappedBy="project")
	private List<User> volunteers;
	@OneToMany(mappedBy="project")
	private List<Beneficiary> beneficiaries;
	@OneToMany(mappedBy="project")
	private List<Task> tasks;
	private String projectName;
	
	public List<User> getVolunteers() {
		return volunteers;
	}

	public void setVolunteers(List<User> volunteers) {
		this.volunteers = volunteers;
	}

	public List<Beneficiary> getBeneficiaries() {
		return beneficiaries;
	}

	public void setBeneficiaries(List<Beneficiary> beneficiaries) {
		this.beneficiaries = beneficiaries;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public Project(){
		
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	

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

	/**
	 * @return the status
	 */
	public Status getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(Status status) {
		this.status = status;
	}

	/**
	 * @return the projectAdmin
	 */
	public User getProjectAdmin() {
		return projectAdmin;
	}

	/**
	 * @param projectAdmin the projectAdmin to set
	 */
	public void setProjectAdmin(User projectAdmin) {
		this.projectAdmin = projectAdmin;
	}

	/**
	 * @return the tasks
	 */
	public List<Task> getTasks() {
		return tasks;
	}

	/**
	 * @param tasks the tasks to set
	 */
	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}
	
	public void addTask(Task task){
		if(tasks == null){
			tasks = new ArrayList<Task>();
		}
		tasks.add(task);
	}
	
	public void addBeneficiary(Beneficiary beneficiary){
		if(beneficiaries == null){
			beneficiaries = new ArrayList<Beneficiary>();
		}
		beneficiaries.add(beneficiary);
	}
	
	public void addVolunteer(User volunteer){
		if(volunteers == null){
			volunteers = new ArrayList<User>();
		}
		volunteer.setRole(UserRole.VOLUNTEER);
		volunteers.add(volunteer);
	}


	
	
}
