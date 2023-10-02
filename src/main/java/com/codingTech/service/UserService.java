package com.codingTech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingTech.entity.User;
import com.codingTech.repository.IUserRepository;

@Service
public class UserService implements IUserService {

	@Autowired
	IUserRepository userRepository;
	@Override
	public User chercherparUsername(String username) {
		return  userRepository.findByUsername(username);
	}

}
