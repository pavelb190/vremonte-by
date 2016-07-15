package by.team.projects.vremonte.dal.entity.details;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class OrganizationDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "name", nullable = false)
	private String name;
	
	@Column(name = "unp_no", unique = true, nullable = false)
	private String unpNo;
	
	@Column(name = "phone_num", nullable = false)
	private String phoneNumber;
	
	public OrganizationDetails() {}
	
	public String getName() {
		
		return name;
	}
	
	public void setName(String name) {
		
		this.name = name;
	}
	
	public String getUnpNo() {
		
		return unpNo;
	}
	
	public void setUnpNo(String unpNo) {
		
		this.unpNo = unpNo;
	}
	
	public String getPhoneNumber() {
		
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNum) {
		
		this.phoneNumber = phoneNum;
	}
	
	@Override
	public String toString() {
		
		return "OrganizationDetails{"
				+ this.name + " [" + this.unpNo + "]" + " " + this.phoneNumber + "}";
	}
}
