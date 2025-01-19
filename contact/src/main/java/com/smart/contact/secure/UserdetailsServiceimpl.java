/*
 * package com.smart.contact.secure;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.security.core.userdetails.UserDetails; import
 * org.springframework.security.core.userdetails.UserDetailsService; import
 * org.springframework.security.core.userdetails.UsernameNotFoundException;
 * import org.springframework.stereotype.Component; import
 * org.springframework.stereotype.Service;
 * 
 * import com.smart.contact.User; import com.smart.contact.UsreRepo;
 * 
 * @Service
 * 
 * @Component public class UserdetailsServiceimpl implements UserDetailsService
 * {
 * 
 * @Autowired private UsreRepo repo; User user;
 * 
 * @Override public UserDetails loadUserByUsername(String email) throws
 * UsernameNotFoundException { // TODO Auto-generated method stub User
 * user=repo.findByemail(email);
 * 
 * 
 * return (UserDetails) user; }
 * 
 * }
 */