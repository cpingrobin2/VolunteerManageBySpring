/**
 * 
 */
package mum.edu.week1ExtraCredit.domain;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 * @author Chao Ping
 *
 */
@Entity
public class User {
	@Id
	@GeneratedValue
	private int id;
	private String userId;
	@Enumerated
	private UserRole role;
	@OneToOne
	@JoinColumn(name = "project")
	private Project project;

	public User() {

	}

	/**
	 * @return the role
	 */
	public UserRole getRole() {
		return role;
	}

	/**
	 * @param role
	 *            the role to set
	 */
	public void setRole(UserRole role) {
		this.role = role;
	}

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId
	 *            the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

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

}
