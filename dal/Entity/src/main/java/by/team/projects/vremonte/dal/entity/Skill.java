package by.team.projects.vremonte.dal.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Skills")
public class Skill implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "skill_name", unique = true, nullable = false)
	private String skillName;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "parent_id", referencedColumnName = "id")
	private Skill parentSkill;
	
	public Skill() {}
	
	public Long getId() {
		
		return id;
	}
	
	public void setId(Long id) {
		
		this.id = id;
	}
	
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
		
		return 31 * this.id.hashCode();
	}
	
	// TODO: equals method.
	
	@Override
	public String toString() {
		
		return "Skill{" + this.id + " " + this.skillName + " " + this.parentSkill + "}";
	}
}
