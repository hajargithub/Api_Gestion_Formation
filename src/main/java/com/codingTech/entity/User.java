package com.codingTech.entity;

import java.util.List;

import javax.persistence.*;
@Entity
public class User extends Personne {
	private String username;
	private String password;
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(
		    name = "user_role",
		    joinColumns = @JoinColumn(name = "user_id"),
		    inverseJoinColumns = @JoinColumn(name = "role_id"))
	private List<Role> roles;
	
	public List<Role> getRoles() {
		return roles;
	}
	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public User(String nom, String prenom, String email, String telephone, int age, String username, String password,
			List<Role> roles) {
		super(nom, prenom, email, telephone, age);
		this.username = username;
		this.password = password;
		this.roles = roles;
	}
	public User(String nom, String prenom, String email, String telephone, int age) {
		super(nom, prenom, email, telephone, age);
	}

	

}
