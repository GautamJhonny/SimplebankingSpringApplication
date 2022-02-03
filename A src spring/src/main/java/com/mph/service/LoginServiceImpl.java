package com.mph.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mph.dao.LoginDao;
import com.mph.entity.Login;
@Service
@Transactional
public class LoginServiceImpl implements LoginService{

	@Autowired
	public LoginDao loginDao;
	@Override
	public void createLogin(Login login) {
		 loginDao.createLogin(login);
	}

}
