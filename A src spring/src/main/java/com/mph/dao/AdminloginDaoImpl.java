package com.mph.dao;

import org.hibernate.Session;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mph.entity.Adminlogin;
@Repository
public class AdminloginDaoImpl implements AdminloginDao {
	
	
	@Autowired
	private SessionFactory sessionFactory;

	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void createAdminlogin(Adminlogin adminlogin) {
		getSession().saveOrUpdate(adminlogin);
		System.out.println("Admin login successfully...");

		
	}


	

}



