package by.team.projects.vremonte.dal.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "Users")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	
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
	
	public Long getId() {
		
		return id;
	}
	
	public void setId(Long id) {
		
		this.id = id;
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
		
		return "User{" + this.id + " " + this.email + "}";
	}
}
