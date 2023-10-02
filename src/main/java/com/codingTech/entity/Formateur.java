package com.codingTech.entity;

import java.util.List;

import javax.persistence.*;

@Entity
public class Formateur extends User {
	
	@OneToMany(mappedBy ="formateur", cascade = CascadeType.REMOVE)
	private List<Formation>formations;
	@OneToMany(mappedBy ="formateur", cascade = CascadeType.REMOVE)
	private List<Cour>cours;
	public List<Formation> getFormations() {
		return formations;
	}
	public void setFormations(List<Formation> formations) {
		this.formations = formations;
	}
	public List<Cour> getCours() {
		return cours;
	}
	public void setCours(List<Cour> cours) {
		this.cours = cours;
	}
	public Formateur(String nom, String prenom, String email, String telephone, int age, String username, String pw,
			List<Role> roles, List<Formation> formations, List<Cour> cours) {
		super(nom, prenom, email, telephone, age, username, pw, roles);
		this.formations = formations;
		this.cours = cours;
	}
	
}

