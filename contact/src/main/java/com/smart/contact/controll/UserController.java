package com.smart.contact.controll;

import java.security.Principal;

import com.smart.contact.Contact;
import com.smart.contact.U;
import com.smart.contact.UsreRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller

public class UserController {
	
	
	@Autowired
	private UsreRepo repo;
	
	Contact con;
	
	
	@GetMapping("/login")
	public String loginwindow(Model m, U u)
	{
		m.addAttribute("user", u);
		return "login_window";
	}
	
	
	  @PostMapping("/user/pro1")
	  public String Use(@ModelAttribute("U") U u ,Principal p,Model m) {
		   String name=p.getName();
		   U u1=repo.findByEmail(name);
		   m.addAttribute("user", u);
		   return "user_page";
	  }
	 
	
	
	}
