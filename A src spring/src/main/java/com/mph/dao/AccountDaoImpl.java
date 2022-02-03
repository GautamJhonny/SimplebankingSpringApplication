package com.mph.dao;





import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mph.entity.Account;


@Repository
public class AccountDaoImpl implements AccountDao{
	
	
	@Autowired
	private SessionFactory sessionFactory;
    protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}


	@Override
	public void createAccount(Account account) {
		getSession().saveOrUpdate(account);
		System.out.println("Account Saved successfully...");

	}

	


	@Override
	public List<Account> getAllAccount() {
		Query qry = getSession().createQuery("select a from Account a");
		List<Account> acclist = qry.list();
		System.out.println("acc list from dao : " + acclist);
		return acclist;
	}


	@Override
	public List<Account> updateAccount(Account account) {
		Query qry = getSession()
				.createQuery(" update Account  a set accountNumber=:accountNumber,accountBalance=:accountBalance where id=:id ");
		qry.setParameter("accountNumber",account.getAccountNumber());
		qry.setParameter("accountBalance",account.getAccountBalance());
		qry.setParameter("id",account.getId());
		int noofrows = qry.executeUpdate();
		if (noofrows > 0) {
			System.out.println("Updated " + noofrows + " rows. ");
		}
		return getAllAccount();

	}


	@Override
	public List<Account> deleteAccount(int accountNumber) {
	
			Query qry = getSession().createQuery(" delete Account  a where accountNumber=:accountNumber");
			qry.setParameter("accountNumber", accountNumber);
			int noofrows = qry.executeUpdate();
			if (noofrows > 0) {
				System.out.println("Deleted " + noofrows + " rows. ");
			}
			return getAllAccount();
		}

	}



	





