package com.codingTech.entity;

import java.util.Date;

import javax.persistence.*;

@Entity
public class DetailsAppel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dateAppel;
	private String comment;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="id_comercial")
	private Comercial comercial;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="id_prospect")
	private Prospect prospect;
	public long getId() {
		return id;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getDateAppel() {
		return dateAppel;
	}
	public void setDateAppel(Date dateAppel) {
		this.dateAppel = dateAppel;
	}
	public Comercial getComercial() {
		return comercial;
	}
	public void setComercial(Comercial comercial) {
		this.comercial = comercial;
	}
	public Prospect getProspect() {
		return prospect;
	}
	public void setProspect(Prospect prospect) {
		this.prospect = prospect;
	}

	public DetailsAppel(Date dateAppel, String comment, Comercial comercial, Prospect prospect) {
		super();
		this.dateAppel = dateAppel;
		this.comment = comment;
		this.comercial = comercial;
		this.prospect = prospect;
	}
	public DetailsAppel() {
		
	}
	
	
}
