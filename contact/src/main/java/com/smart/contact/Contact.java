package com.smart.contact;

import org.springframework.stereotype.Component;

import jakarta.persistence.*;

@Component
@Entity

public class Contact {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	 private int cid;
     private String name;
     private String second_name;
     private String work;
     private String email;
     private String phone;
     private String description;
    
    @ManyToOne(fetch=FetchType.LAZY)
    
 private U user1;

 public Contact(int cid, String name, String second_name, String work, String email, String phone, String description) {
        this.cid = cid;
        this.name = name;
        this.second_name = second_name;
        this.work = work;
        this.email = email;
        this.phone = phone;
        this.description = description;

    }
    public Contact(){

    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecond_name() {
        return second_name;
    }

    public void setSecond_name(String second_name){
        this.second_name = second_name;
    }

    public String getWork(){
        return work;
    }

    public void setWork(String work){
    	
        this.work = work;
        
    }

    public String getEmail(){
    	
        return email;
    }

    public void setEmail(String email){
    	
        this.email = email;
    }

    public String getPhone(){
        return phone;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public U getUser(){
        return user1;
    }

    public void setUser(U user1){
        this.user1 = user1;
    }
	@Override
	public String toString() {
		return "Contact [cid=" + cid + ", name=" + name + ", second_name=" + second_name + ", work=" + work + ", email="
				+ email + ", phone=" + phone + ", description=" + description + ", user1=" + user1 + "]";
	}
    
}
