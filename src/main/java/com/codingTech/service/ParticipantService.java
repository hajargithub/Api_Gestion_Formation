package com.codingTech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.codingTech.entity.Participant;
import com.codingTech.repository.IParticipantRepository;

public class ParticipantService implements IParticipantService {
	@Autowired
	IParticipantRepository participantRepository;

	@Override
	public Participant ajouter(Participant p) {
		// TODO Auto-generated method stub
		return  participantRepository.save(p);
	}

	@Override
	public Participant selecOne(long id) {
		// TODO Auto-generated method stub
		return participantRepository.findById(id).get();
	}

	@Override
	public List<Participant> selectAll() {
		// TODO Auto-generated method stub
		return participantRepository.findAll();
	}

	@Override
	public void supprimer(long id) {
		// TODO Auto-generated method stub
		participantRepository.deleteById(id);
		
	}

	@Override
	public void modifier(Participant p) {
		// TODO Auto-generated method stub
		participantRepository.save(p);
		
	}

}
