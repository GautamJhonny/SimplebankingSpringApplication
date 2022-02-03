package com.mph.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mph.dao.RegistrationDao;
import com.mph.entity.Registration;

@Service
@Transactional
public class RegistrationServiceImpl implements RegistrationService{


	@Autowired
	public RegistrationDao  registrationDao;
	
	@Override
	public void createRegistration(Registration registration) {
		registrationDao.createRegistration(registration);
		
	}



	}

	