package com.smart.contact.s1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class Confi{
	@Autowired
	UserServiceimpl service;
	
	@Bean
	public SecurityFilterChain chain(HttpSecurity http) throws Exception {
		
		http.authorizeHttpRequests(s->
	    s.anyRequest().permitAll());
		
		http.formLogin().loginPage("/login")
		.successForwardUrl("/user/pro1").loginProcessingUrl("/user/pro").failureForwardUrl("/regi")
		.usernameParameter("email")
		.passwordParameter("password1");
		
		
		return http.build();
		
	}
	
	@Bean
	public AuthenticationProvider provider() {
		
		DaoAuthenticationProvider d=new DaoAuthenticationProvider();
		d.setUserDetailsService(service);
		d.setPasswordEncoder(encoder());
		return d;
	}
	
	@Bean
	public BCryptPasswordEncoder encoder() {
		return new BCryptPasswordEncoder();
	}
	
	
	
	
}
