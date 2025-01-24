package com.smart.contact.controll;

import com.smart.contact.ConRepo;
import com.smart.contact.Contact;
import com.smart.contact.U;
import com.smart.contact.UsreRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.security.Principal;
import java.util.List;
@Configuration
public class ContactSer {

    @Autowired
    ConRepo r;
    @Autowired
    UsreRepo repo;
    @Autowired
    public U cu;

    public Page<Contact> allcontact(U cu,int page,int size,Principal p) {

        String name = p.getName();
        cu = repo.findByEmail(name);

        Pageable pageable= PageRequest.of(page,size);
        return r.findByUser1(cu,pageable);

    }
}
