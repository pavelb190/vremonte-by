package by.team.projects.vremonte.dal.entity.user.customer;

import javax.persistence.MappedSuperclass;

import by.team.projects.vremonte.dal.entity.user.RolesType;
import by.team.projects.vremonte.dal.entity.user.User;

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
