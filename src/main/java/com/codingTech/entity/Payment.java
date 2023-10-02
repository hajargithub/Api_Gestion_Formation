package com.codingTech.entity;

import java.util.Date;

import javax.persistence.*;

@Entity
public class Payment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private long montant;
	@Temporal(TemporalType.DATE)
	private Date datePayement;
	 @ManyToOne
	 @JoinColumn(name = "participant_id") // This references the participant_id column in the Payment table
	 private Participant participant;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="id_formation")
	private Formation formation;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getDatePayement() {
		return datePayement;
	}
	public void setDatePayement(Date datePayement) {
		this.datePayement = datePayement;
	}
	public Participant getParticipant() {
		return participant;
	}
	public void setParticipant(Participant participant) {
		this.participant = participant;
	}
	public Formation getFormation() {
		return formation;
	}
	public void setFormation(Formation formation) {
		this.formation = formation;
	}
	
	public long getMontant() {
		return montant;
	}
	public void setMontant(long montant) {
		this.montant = montant;
	}
	
	public Payment(long montant, Date datePayement, Participant participant, Formation formation) {
		super();
		this.montant = montant;
		this.datePayement = datePayement;
		this.participant = participant;
		this.formation = formation;
	}
	public Payment() {
		super();
	}
	
	

}
