package com.codingTech.entity;

import java.util.Date;

import javax.persistence.*;

@Entity
public class Rdv {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
    @Temporal(TemporalType.TIMESTAMP)
	private Date dateRdv;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="id_comercial")
	private Comercial comercial;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="id_prospect")
	private Prospect prospect;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getDateRdv() {
		return dateRdv;
	}
	public void setDateRdv(Date dateRdv) {
		this.dateRdv = dateRdv;
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
	public Rdv(long id, Date dateRdv, Comercial comercial, Prospect prospect) {
		super();
		this.id = id;
		this.dateRdv = dateRdv;
		this.comercial = comercial;
		this.prospect = prospect;
	}
	public Rdv(Date dateRdv, Comercial comercial, Prospect prospect) {
		super();
		this.dateRdv = dateRdv;
		this.comercial = comercial;
		this.prospect = prospect;
	}
	public Rdv() {
		super();
	}
	
	

}
