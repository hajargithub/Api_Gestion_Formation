package com.codingTech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codingTech.entity.Participant;
import com.codingTech.service.IParticipantService;

@RestController
@RequestMapping("/api")
public class ParticipantController {
	@Autowired
	IParticipantService participantervice;
	@GetMapping("/participants")
	//@RequestMapping(value = "/personnes",method = HttpMethod.GET)
	public List<Participant> selectAll()
	{
		List<Participant> liste=participantervice.selectAll() ;
		return liste;
	}

}
