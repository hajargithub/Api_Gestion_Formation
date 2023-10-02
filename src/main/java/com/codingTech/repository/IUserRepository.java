package com.codingTech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codingTech.entity.User;

public interface IUserRepository extends JpaRepository<User, Long> {
	public User findByUsername(String username);

}
