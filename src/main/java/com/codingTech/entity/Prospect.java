package com.codingTech.entity;

import java.util.List;

import javax.persistence.*;

@Entity
public class Prospect extends Personne {
	@OneToMany(mappedBy ="prospect", cascade = CascadeType.REMOVE)
	private List<Rdv> rdvs;
	@OneToMany(mappedBy ="prospect", cascade = CascadeType.REMOVE)
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
	public Prospect(String nom, String prenom, String email, String telephone, int age, List<Rdv> rdvs,
			List<DetailsAppel> detailsAppels) {
		super(nom, prenom, email, telephone, age);
		this.rdvs = rdvs;
		this.detailsAppels = detailsAppels;
	}
	public Prospect(String nom, String prenom, String email, String telephone, int age) {
		super(nom, prenom, email, telephone, age);
	}
	
	

}
