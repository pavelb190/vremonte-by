package by.team.projects.vremonte.dal.entity.user.customer;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import by.team.projects.vremonte.dal.entity.user.details.Organization;
import by.team.projects.vremonte.dal.entity.user.details.OrganizationDetails;

@Entity
@Table(name = "Organizations")
@PrimaryKeyJoinColumn(name = "user_id")
public class CustomerOrganization extends Customer implements Organization {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Embedded
	private OrganizationDetails details;
	
	@Override
	public OrganizationDetails getDetails() {
		
		if (details == null) {
			
			this.details = new OrganizationDetails();
		}
		
		return details;
	}
	
	public void setDetails(OrganizationDetails details) {
		
		this.details = details;
	}
	
	@Override
	public String toString() {
		
		return "CustomerOrganization{"
				+ super.toString() + " " + this.details + "}";
	}
}
