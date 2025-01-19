package com.smart.contact;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ConRepo extends JpaRepository<Contact,Integer> {
	
	
	
	
	Contact findByName(String name);
	
	public List<Contact> findByUser1(U cu);

		

	

}
