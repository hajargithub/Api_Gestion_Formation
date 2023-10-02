package com.codingTech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codingTech.entity.Role;

public interface IRoleRepository extends JpaRepository<Role, Long> {

}
