package com.smart.contact;

import java.security.Principal;
import java.util.List;

import com.smart.contact.controll.ContactSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ConControler {
	
	@Autowired
	ConRepo cr;
	@Autowired
	ContactSer cs;
	@Autowired
	private UsreRepo repo;
	
	Contact c;
	
	
	U u;
	
	@GetMapping("/user/contact")
	public String form() {
		
		
		return "contact_form";
	}

	@GetMapping("/user/contact/get/all")
	public  String getAl(U cu,
						 @RequestParam(defaultValue = "0") int page,
						 @RequestParam(defaultValue = "5") int size,Model model,Principal p) {
		Pageable pageable;

		Page<Contact> contactPage = cs.allcontact(cu, page, size,p);


		model.addAttribute("con", contactPage);
		model.addAttribute("currentPage", page);
		model.addAttribute("totalPages", contactPage.getTotalPages());
		model.addAttribute("totalItems", contactPage.getTotalElements());



		return "Contact_list";
	}

	@PostMapping("/user/contact/save")
	   public String savecontact(@ModelAttribute Contact contact,Principal p) {
		   String uname=p.getName();
		  U u=repo.findByEmail(uname);
		   contact.setName(contact.getName());
		   contact.setPhone(contact.getPhone());
		   contact.setUser(u);
		   cr.save(contact);
		  
		return "redirect:/user/contact/get/all";
	}
	   


}
