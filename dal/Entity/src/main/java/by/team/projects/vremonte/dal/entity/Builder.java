package by.team.projects.vremonte.dal.entity;

import javax.persistence.Entity;

@Entity
public class Builder extends User {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Builder() {
		
		super(RolesType.BUILDER);
	}
}
