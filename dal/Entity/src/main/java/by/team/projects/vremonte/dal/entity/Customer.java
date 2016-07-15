package by.team.projects.vremonte.dal.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "Customers")
@PrimaryKeyJoinColumn(name = "user_id")
public class Customer extends User {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	public Customer() {
		
		super(RolesType.CUSTOMER);
	}
	
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
	
	@Override
	public String toString() {
		
		return "Customer{"
				+ super.toString() + " "
					+ this.firstName + " " + this.lastName + "}";
	}
}
