package com.cg.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.cg.beans.Registration;
import com.cg.dao.RegistrationDao;
@Controller(value="service")
public class RegistrationServiceImpl implements RegistrationService{

	
	@Autowired(required=true)
	RegistrationDao dao;
	

	@Override
	public Registration createAccount(Registration registration) {
		
	
	return dao.save(registration);
	

	}

	
	
}
