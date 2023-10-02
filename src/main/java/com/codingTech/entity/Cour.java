package com.codingTech.entity;

import javax.persistence.*;

@Entity
public class Cour {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nomCour;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="id_formateur")
	private Formateur formateur;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="id_formation")
	private Formation formation;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNomCour() {
		return nomCour;
	}
	public void setNomCour(String nomCour) {
		this.nomCour = nomCour;
	}
	public Formateur getFormateur() {
		return formateur;
	}
	public void setFormateur(Formateur formateur) {
		this.formateur = formateur;
	}

	public Formation getFormation() {
		return formation;
	}
	public void setFormation(Formation formation) {
		this.formation = formation;
	}
	
	public Cour(String nomCour, Formateur formateur, Formation formation) {
		super();
		this.nomCour = nomCour;
		this.formateur = formateur;
		this.formation = formation;
	}
	public Cour() {
		
	}
	

}
