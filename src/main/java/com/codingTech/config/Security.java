package com.codingTech.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class Security extends WebSecurityConfigurerAdapter {
@Autowired
	UserDetailsService userDetailsService;
@Autowired
private RequestFilter jwtrequestfilter;
@Override
protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	/*auth.inMemoryAuthentication().withUser("user1").password("{noop}1234").roles("admin")
	.and().withUser("user2").password("{noop}5678").roles("user");*/
	auth.userDetailsService(userDetailsService);
}

@Override
protected void configure(HttpSecurity http) throws Exception {
	
	
	http.csrf().disable()
	.authorizeRequests().antMatchers("/loginUserJwt").permitAll()
	.antMatchers(HttpMethod.OPTIONS).permitAll()
	.anyRequest().authenticated()
	.and().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
	.and().addFilterBefore(jwtrequestfilter, UsernamePasswordAuthenticationFilter.class);
}


@Bean
public BCryptPasswordEncoder passEncoder()
{
	return new BCryptPasswordEncoder();
}

}
