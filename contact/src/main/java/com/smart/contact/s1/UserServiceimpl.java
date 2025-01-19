package com.smart.contact.s1;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.smart.contact.U;
import com.smart.contact.UsreRepo;

import ch.qos.logback.classic.Logger;

@Component
class UserServiceimpl implements UserDetailsService{

	@Autowired
	private UsreRepo r;
	
	Logger logger=(Logger) LoggerFactory.getLogger(UserServiceimpl.class);
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return r.findByEmail(username);
		
		   
		   
	}
	

	
}