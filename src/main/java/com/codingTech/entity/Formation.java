package com.codingTech.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.*;
@Entity
public class Formation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nom ;
	private long prix ;
	@Temporal(TemporalType.DATE)
	private Date datedebutFormation;
	@Temporal(TemporalType.DATE)
	private Date datefinFormation;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="id_formateur")
	private Formateur formateur;
	  @ManyToMany(mappedBy = "formations", cascade = { CascadeType.ALL })
	    private List<Participant> participant ;
	  @OneToMany(mappedBy ="formation", cascade = CascadeType.REMOVE)
		private List<Cour>cours;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public long getPrix() {
		return prix;
	}
	public void setPrix(long prix) {
		this.prix = prix;
	}
	public Date getDatedebutFormation() {
		return datedebutFormation;
	}
	public void setDatedebutFormation(Date datedebutFormation) {
		this.datedebutFormation = datedebutFormation;
	}
	public Date getDatefinFormation() {
		return datefinFormation;
	}
	public void setDatefinFormation(Date datefinFormation) {
		this.datefinFormation = datefinFormation;
	}
	public Formateur getFormateur() {
		return formateur;
	}
	public void setFormateur(Formateur formateur) {
		this.formateur = formateur;
	}
	public List<Participant> getParticipant() {
		return participant;
	}
	public void setParticipant(List<Participant> participant) {
		this.participant = participant;
	}
	public List<Cour> getCours() {
		return cours;
	}
	public void setCours(List<Cour> cours) {
		this.cours = cours;
	}
	public Formation(String nom, long prix, Date datedebutFormation, Date datefinFormation, Formateur formateur,
			List<Participant> participant, List<Cour> cours) {
		super();
		this.nom = nom;
		this.prix = prix;
		this.datedebutFormation = datedebutFormation;
		this.datefinFormation = datefinFormation;
		this.formateur = formateur;
		this.participant = participant;
		this.cours = cours;
	}
	public Formation() {
		super();
	}
	  
	  
	  
	  

}
