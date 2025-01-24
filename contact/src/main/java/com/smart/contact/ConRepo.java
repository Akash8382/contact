package com.smart.contact;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ConRepo extends JpaRepository<Contact,Integer> {
	
	
	
	
	 Contact findByName(String name);
	
	 public Page<Contact> findByUser1(U cu, Pageable pageable);

		

	

}
