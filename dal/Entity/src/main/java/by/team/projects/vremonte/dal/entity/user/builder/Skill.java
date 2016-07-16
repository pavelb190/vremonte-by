package by.team.projects.vremonte.dal.entity.user.builder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import by.team.projects.vremonte.dal.entity.Model;

@Entity
@Table(name = "Skills")
public class Skill extends Model<Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name = "skill_name", unique = true, nullable = false)
	private String skillName;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "parent_id", referencedColumnName = "id")
	private Skill parentSkill;
	
	public Skill() {}
	
	public String getSkillName() {
		
		return skillName;
	}
	
	public void setSkillName(String skillName) {
		
		this.skillName = skillName;
	}
	
	public Skill getParentSkill() {
		
		return parentSkill;
	}
	
	public void setParentSkill(Skill skill) {
		
		this.parentSkill = skill;
	}
	
	@Override
	public int hashCode() {
		
		return 31 * getId().hashCode();
	}
	
	// TODO: equals method.
	
	@Override
	public String toString() {
		
		return "Skill{" + getId() + " " + this.skillName + " " + this.parentSkill + "}";
	}
}
