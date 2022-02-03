package com.mph.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mph.entity.Login;

@Repository
public class LoginDaoImpl implements LoginDao{
	

	@Autowired
	private SessionFactory sessionFactory;

	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}


	@Override
	public void createLogin(Login login) {
		getSession().saveOrUpdate(login);
		System.out.println("User Login successfully...");

		
	}

}
