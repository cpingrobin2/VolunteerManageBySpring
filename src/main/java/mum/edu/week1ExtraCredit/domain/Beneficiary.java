package mum.edu.week1ExtraCredit.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
/**
 * @author Chao Ping
 *
 */
@Entity
public class Beneficiary {
	@Id
	@GeneratedValue
	private int id;

	private String benNum;
	@ManyToOne
	@JoinColumn
	private Project project;
	
	public Beneficiary(){
		
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
	 * @return the benNum
	 */
	public String getBenNum() {
		return benNum;
	}
	/**
	 * @param benNum the benNum to set
	 */
	public void setBenNum(String benNum) {
		this.benNum = benNum;
	}
	
}
