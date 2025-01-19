package com.smart.contact;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ConControler {
	
	@Autowired
	ConRepo cr;
	@Autowired
	private UsreRepo repo;
	
	Contact c;
	
	
	U u;
	
	@GetMapping("/user/contact")
	public String form() {
		
		
		return "contact_form";
	}
	
	   @PostMapping("/user/contact/save")
	   public String savecontact(@ModelAttribute Contact contact,Principal p) {
		   String uname=p.getName();
		  U u=repo.findByEmail(uname);
		   contact.setName(contact.getName());
		   contact.setPhone(contact.getPhone());
		
		 
		   contact.setUser(u);
		
		 
		
		   
		   
		   cr.save(contact);
		  
		return "contact_form";
	}
	   
	   @GetMapping("/user/contact/get/all")
	 public   String getAl(Model m,Contact con,Principal p) {
		   
		 String name=  p.getName();
		U cu= repo.findByEmail(name);
		m.addAttribute("con", cr.findByUser1(cu));
		   return "Contact_list";
		   
	   
	
	   }

}
