package com.codingTech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codingTech.entity.Participant;

public interface IParticipantRepository extends JpaRepository<Participant, Long>{

}
