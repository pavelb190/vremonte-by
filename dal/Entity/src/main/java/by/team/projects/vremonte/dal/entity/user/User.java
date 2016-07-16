package by.team.projects.vremonte.dal.entity.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import by.team.projects.vremonte.dal.entity.Model;

@Entity
@Table(name = "Users")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class User extends Model<Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name = "email", unique = true, nullable = false)
	private String email;
	
	@Column(name = "password")
	private String password;
	
	@Enumerated(EnumType.ORDINAL)
	@Column(name = "role_id")
	private RolesType role;
	
	public User(RolesType roleType) {
		
		this.role = roleType;
	}
	
	public String getEmail() {
		
		return email;
	}
	
	public void setEmail(String email) {
		
		this.email = email;
	}
	
	public String getPassword() {
		
		return password;
	}
	
	public void setPassword(String password) {
		
		this.password = password;
	}
	
	public RolesType getRole() {
		
		return role;
	}
	
	public void setRole(RolesType roleType) {
		
		this.role = roleType;
	}
	
	@Override
	public String toString() {
		
		return "User{" + getId() + " " + this.email + "}";
	}
}
