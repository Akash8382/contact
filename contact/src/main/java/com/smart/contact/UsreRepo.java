package com.smart.contact;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UsreRepo extends JpaRepository<U,Integer> {
	
	U findByEmail(String email);
	

}
