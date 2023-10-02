package com.codingTech.entity;

import java.util.List;

import javax.persistence.*;

@Entity
public class Comercial extends User {
	
	@OneToMany(mappedBy ="comercial", cascade = CascadeType.REMOVE)
	private List<Rdv> rdvs;
	@OneToMany(mappedBy ="comercial", cascade = CascadeType.REMOVE)
	private List<DetailsAppel> detailsAppels;
	public List<Rdv> getRdvs() {
		return rdvs;
	}
	public void setRdvs(List<Rdv> rdvs) {
		this.rdvs = rdvs;
	}
	public List<DetailsAppel> getDetailsAppels() {
		return detailsAppels;
	}
	public void setDetailsAppels(List<DetailsAppel> detailsAppels) {
		this.detailsAppels = detailsAppels;
	}
	public Comercial(String nom, String prenom, String email, String telephone, int age, String username, String pw,
			List<Role> roles, List<Rdv> rdvs, List<DetailsAppel> detailsAppels) {
		super(nom, prenom, email, telephone, age, username, pw, roles);
		this.rdvs = rdvs;
		this.detailsAppels = detailsAppels;
	}
	public Comercial(String nom, String prenom, String email, String telephone, int age, String username, String pw,
			List<Role> roles) {
		super(nom, prenom, email, telephone, age, username, pw, roles);
	}
	
	
	

}
