/*
 * package com.smart.contact.secure;
 * 
 * import java.util.Collection;
 * 
 * import org.apache.tomcat.util.net.openssl.ciphers.Authentication; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.context.annotation.Bean; import
 * org.springframework.context.annotation.Configuration; import
 * org.springframework.security.authentication.AuthenticationProvider; import
 * org.springframework.security.authentication.dao.DaoAuthenticationProvider;
 * import
 * org.springframework.security.config.annotation.authentication.builders.
 * AuthenticationManagerBuilder; import
 * org.springframework.security.config.annotation.web.builders.HttpSecurity;
 * import org.springframework.security.config.annotation.web.configuration.
 * EnableWebSecurity; import org.springframework.security.core.userdetails.User;
 * import org.springframework.security.core.userdetails.User.UserBuilder; import
 * org.springframework.security.core.userdetails.UserDetails; import
 * org.springframework.security.core.userdetails.UserDetailsService; import
 * org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder; import
 * org.springframework.security.crypto.password.PasswordEncoder; import
 * org.springframework.security.provisioning.InMemoryUserDetailsManager; import
 * org.springframework.security.web.SecurityFilterChain; import
 * org.springframework.stereotype.Component;
 * 
 * 
 * 
 * 
 * @Configuration
 * 
 * @EnableWebSecurity public class Config {
 * 
 * @Autowired UserdetailsServiceimpl details; //User user; User u;
 * 
 * // @Bean // DaoAuthenticationProvider authenticationProvider() { //
 * DaoAuthenticationProvider daoAuthenticationProvider=new
 * DaoAuthenticationProvider (); // //
 * daoAuthenticationProvider.setUserDetailsService(details); //
 * daoAuthenticationProvider.setPasswordEncoder(passwordencoder()); // // return
 * daoAuthenticationProvider; // }
 * 
 * 
 * @Bean SecurityFilterChain securityfilterchain(HttpSecurity http)throws
 * Exception {
 * 
 * http.authorizeHttpRequests(in->
 * in.requestMatchers("/user/").authenticated().anyRequest().permitAll());
 * 
 * 
 * http.formLogin(login -> login.loginPage("/user/log")
 * .loginProcessingUrl("/process") .usernameParameter("email")
 * .passwordParameter("password") .successForwardUrl("/"));
 * 
 * 
 * return http.build(); }
 * 
 * @Bean PasswordEncoder passwordencoder() { return new BCryptPasswordEncoder();
 * }
 * 
 * 
 * 
 * 
 * 
 * }
 */