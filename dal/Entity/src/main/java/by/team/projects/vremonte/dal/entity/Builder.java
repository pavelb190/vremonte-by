package by.team.projects.vremonte.dal.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Builder extends User {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// private Set<Skill> skills = new HashSet<>();
	
	public Builder() {
		
		super(RolesType.BUILDER);
	}
	
	/*
	public Set<Skill> getSkills() {
		
		return skills;
	}
	*/
	
	@Override
	public String toString() {
		
		return "Builder{" + super.toString() + "}";
	}
}
