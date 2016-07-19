package by.team.projects.vremonte.dal.entity.user.builder;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import by.team.projects.vremonte.dal.entity.user.details.Person;
import by.team.projects.vremonte.dal.entity.user.details.PersonDetails;

@Entity
@Table(name = "Persons")
@PrimaryKeyJoinColumn(name = "user_id")
public class BuilderPerson extends Builder implements Person {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Embedded
	private PersonDetails details;
	
	@Override
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
		
		return "BuilderPerson{"
				+ super.toString() + " " + this.details + "}";
	}
}
