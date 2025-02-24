/*
 * package com.smart.contact.secure;
 * 
 * import java.util.Collection; import java.util.List;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.security.core.GrantedAuthority; import
 * org.springframework.security.core.authority.SimpleGrantedAuthority; import
 * org.springframework.security.core.userdetails.UserDetails; import
 * org.springframework.stereotype.Component;
 * 
 * import com.smart.contact.User;
 * 
 * @Component public class CustomUserDetails implements UserDetails {
 * 
 * 
 * private User user;
 * 
 * public CustomUserDetails(User user) { super(); this.user=user; }
 * 
 * @Override public Collection<? extends GrantedAuthority> getAuthorities() {
 * SimpleGrantedAuthority authority=new SimpleGrantedAuthority(user.getRole());
 * 
 * return List.of(authority); }
 * 
 * @Override public String getPassword() { // TODO Auto-generated method stub
 * return user.getPassword(); }
 * 
 * @Override public String getUsername() { // TODO Auto-generated method stub
 * return user.getEmail(); }
 * 
 * }
 */