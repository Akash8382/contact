package com.smart.contact;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;



@Component
@Entity
public class U implements Serializable,UserDetails{
	 @GeneratedValue(strategy = GenerationType.AUTO)
     @Id
    private int id;
	 
    private String name;
   
    private String email;
    
    @Column(nullable = false, length = 5)
    private String password1;
    
    private String role;
    private boolean enabled;
    private String img_url;
    private String about;
    
    @OneToMany(cascade = CascadeType.ALL ,mappedBy = "user1",fetch=FetchType.LAZY)//mappedBy = "user1",
    private List<Contact> contact =new ArrayList<>();

    public U(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean isEnabled() {
        return true;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public List<Contact> getContact() {
        return contact;
    }

    public void setContact(List<Contact> contact) {
        this.contact = contact;
    }

    public U(int id, String name, String email, String role, boolean enabled, String img_url, String about,String password1) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.role = role;
        this.enabled = enabled;
        this.img_url = img_url;
        this.about = about;
        this.password1=password1;
    }

    U user;
    @Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", password1=" + password1 + ", contact="
				+ contact + ", role=" + role + ", enabled=" + enabled + ", img_url=" + img_url + ", about=" + about
				+ "]";
	}

	

	public void setPassword1(String password1) {
		
		
		this.password1 = password1;
	}

	

	public String getPassword1() {
		return password1;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return this.getPassword1();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return this.getEmail();
	}

}