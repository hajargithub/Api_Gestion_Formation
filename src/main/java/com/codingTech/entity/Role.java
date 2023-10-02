package com.codingTech.entity;

import javax.persistence.*;
@Entity
public class Role {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nom_role;
	
	public Role(String nom_role) {
		super();
		this.nom_role = nom_role;
	}
	public Role() {
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNom_role() {
		return nom_role;
	}
	public void setNom_role(String nom_role) {
		this.nom_role = nom_role;
	}
	
	
	


}
