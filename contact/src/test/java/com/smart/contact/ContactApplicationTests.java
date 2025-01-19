package com.smart.contact;

import java.security.Principal;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ContactApplicationTests {
	
	@Autowired
	ConRepo r;
	private UsreRepo repo;

	@Test
	void contextLoads() {
	}
	
	@Test
	public List<Contact> con(){
		 String name= "A@gmail.com";
			U cu= repo.findByEmail(name);
		var v=r.findByUser1(cu);
		return v;
		
	}

}
