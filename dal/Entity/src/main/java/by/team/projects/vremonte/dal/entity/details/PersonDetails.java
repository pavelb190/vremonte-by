package by.team.projects.vremonte.dal.entity.details;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PersonDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "first_name", nullable = false)
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "phone_num")
	private String phoneNumber;
	
	public PersonDetails() {}
	
	public String getFirstName() {
		
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		
		this.firstName = firstName;
	}
	
	public String getLastName() {
		
		return lastName;
	}
	
	public void setLastName(String lastName) {
		
		this.lastName = lastName;
	}
	
	public String getPhoneNumber() {
		
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNum) {
		
		this.phoneNumber = phoneNum;
	}
	
	@Override
	public String toString() {
		
		return "PersonDetails{"
				+ this.firstName + " " + this.lastName + ", " + this.phoneNumber + "}";
	}
}
