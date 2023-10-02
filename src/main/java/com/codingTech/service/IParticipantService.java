package com.codingTech.service;

import java.util.List;

import com.codingTech.entity.Participant;

public interface IParticipantService {

   public Participant ajouter(Participant p);
	
	public Participant selecOne(long id);
	
	public List<Participant> selectAll();
	
	public void supprimer(long id);
	
	public void modifier(Participant p);
}
