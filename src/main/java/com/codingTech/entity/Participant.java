package com.codingTech.entity;

import java.util.List;

import javax.persistence.*;

@Entity
public class Participant extends User {
	@ManyToMany(cascade = {CascadeType.ALL})
	    @JoinTable(name = "participant_formation",
	    joinColumns = { @JoinColumn(name = "formation_id")}, 
	    inverseJoinColumns = { @JoinColumn(name = "participant_id")})	
	private List<Formation> formations;
    @OneToMany(mappedBy = "participant", 
    		cascade = CascadeType.ALL)
	private List<Payment> payments;
	
	public List<Formation> getFormations() {
		return formations;
	}
	public void setFormations(List<Formation> formations) {
		this.formations = formations;
	}
	public List<Payment> getPayments() {
		return payments;
	}
	public void setPayments(List<Payment> payments) {
		this.payments = payments;
	}
	public Participant(String nom, String prenom, String email, String telephone, int age, String username, String pw,
			List<Role> roles, List<Formation> formations, List<Payment> payments) {
		super(nom, prenom, email, telephone, age, username, pw, roles);
		this.formations = formations;
		this.payments = payments;
	}
	public Participant(String nom, String prenom, String email, String telephone, int age, String username, String pw,
			List<Role> roles) {
		super(nom, prenom, email, telephone, age, username, pw, roles);
	}
	
	
	

}
