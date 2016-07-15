package by.team.projects.vremonte.dal.entity;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Customer extends User {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Customer() {
		
		super(RolesType.CUSTOMER);
	}
	
	@Override
	public String toString() {
		
		return "Customer{" + super.toString() + "}";
	}
}
