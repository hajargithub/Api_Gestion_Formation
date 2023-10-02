package com.codingTech.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.codingTech.entity.AuthentificationRequest;
import com.codingTech.entity.AuthentificationResponse;
import com.codingTech.service.JwtUtil;

@RestController
@CrossOrigin("http://localhost:3000")
public class AuthentificationController {
	
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	
	@Autowired
	private UserDetailsService custemUserDetailsService;
	
	
	@Autowired
	private JwtUtil jwtokenUtil;
	
	
	@RequestMapping(value="/loginUserJwt" ,method =RequestMethod.POST)
	public AuthentificationResponse authenticate(@RequestBody AuthentificationRequest authentificationRequest) throws Exception
	{
		try {
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authentificationRequest.getUsername(), authentificationRequest.getPassword()));
			
		} catch (BadCredentialsException e) {
			// TODO: handle exception
			throw new Exception("incorrect username ou password",e);
		}
		
		final UserDetails userdetails=custemUserDetailsService.loadUserByUsername(authentificationRequest.getUsername());
		final String jwt=jwtokenUtil.generateToken(userdetails);
		
		
		return new AuthentificationResponse(jwt);
	}
	
	
	
}
