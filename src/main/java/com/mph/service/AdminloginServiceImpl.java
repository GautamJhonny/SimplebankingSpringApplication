package com.mph.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mph.entity.Adminlogin;
import com.mph.dao.AdminloginDao;
@Service
@Transactional
public class AdminloginServiceImpl implements AdminloginService{
	
	@Autowired
	public AdminloginDao adminloginDao;
	

	@Override
	public void createAdminlogin(Adminlogin adminlogin) {
		adminloginDao.createAdminlogin(adminlogin);
	}
	
	

}
