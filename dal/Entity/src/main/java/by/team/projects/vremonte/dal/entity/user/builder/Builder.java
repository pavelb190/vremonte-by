package by.team.projects.vremonte.dal.entity.user.builder;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.MappedSuperclass;

import by.team.projects.vremonte.dal.entity.user.RolesType;
import by.team.projects.vremonte.dal.entity.user.User;

@MappedSuperclass
public abstract class Builder extends User {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(
		name = "Builders_Skills",
			joinColumns = @JoinColumn(name = "user_id", nullable = false, referencedColumnName = "id"),
			inverseJoinColumns=@JoinColumn(name = "skill_id", nullable = false, referencedColumnName = "id"))
	private Set<Skill> skills = new HashSet<>();
	
	public Builder() {
		
		super(RolesType.BUILDER);
	}
	
	public Set<Skill> getSkills() {
		
		return skills;
	}
	
	public void setSkills(Set<Skill> skills) {
		
		this.skills = skills;
	}
	
	@Override
	public String toString() {
		
		return "Builder{" + super.toString() + "}";
	}
}
