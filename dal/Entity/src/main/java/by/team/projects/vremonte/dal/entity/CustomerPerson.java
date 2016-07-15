package by.team.projects.vremonte.dal.entity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import by.team.projects.vremonte.dal.entity.details.PersonDetails;

@Entity
@Table(name = "Persons")
@PrimaryKeyJoinColumn(name = "user_id")
public class CustomerPerson extends Customer {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Embedded
	private PersonDetails details;
	
	public PersonDetails getDetails() {
		
		if (details == null) {
			
			this.details = new PersonDetails();
		}
		
		return details;
	}
	
	public void setDetails(PersonDetails details) {
		
		this.details = details;
	}
	
	@Override
	public String toString() {
		
		return "CustomerPerson{"
				+ super.toString() + " " + this.details + "}";
	}
}
