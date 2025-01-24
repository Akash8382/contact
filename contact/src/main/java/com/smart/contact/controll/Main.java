package com.smart.contact.controll;

import com.smart.contact.U;
import com.smart.contact.UsreRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

//import com.smart.contact.s1.UserServiceimpl;


@Controller
public class Main {
	
	
	@Autowired
	private UsreRepo repo;
	
	@Autowired
	BCryptPasswordEncoder encoder;
	
	U user;
	

    @GetMapping("/")
    public String Home(Model m){
        m.addAttribute("title","Smart-Contact");
        return "Home";
    }

    @GetMapping("/about")
    public String ab(){
        return "about";
    }

    @GetMapping("/regi")
    public String signup(Model m,U user)
    { 
    	m.addAttribute("user", user);
        return "login";
    }
    @PostMapping("/save")
    public String save(@ModelAttribute("user") @RequestBody U user) {
    	
            user.setRole("USER");
            user.setPassword1(encoder.encode(user.getPassword1()));
            repo.save(user);
        
    	
    	return "login";
    }
    
   
}