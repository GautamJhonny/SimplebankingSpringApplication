package com.mph.dao;



import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.mph.entity.Transaction;
@Repository
public class TransactionDaoImpl implements TransactionDao{
	 
	
	@Autowired
	private SessionFactory sessionFactory;

	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void createTransaction(Transaction transaction) {
		getSession().saveOrUpdate(transaction);
		System.out.println("Transaction successfully...");

	}

	@Override
	public List<Transaction> getAllTransaction() {
		Query qry = getSession().createQuery("select t from Transaction t");
		List<Transaction> txnlist = qry.list();
		System.out.println("txn list from dao : " + txnlist);
		return txnlist;
	}


	@Override
	public List<Transaction> updateTransaction(Transaction transaction) {
		Query qry = getSession()
				.createQuery(" update Transaction  t set accountNumber=:accountNumber,transactionDescription=:transactionDescription,dateOfTransaction=:dateOfTransaction , transactionamount=:transactionamount where transactionId=:transactionId");
		qry.setParameter("accountNumber",transaction.getAccountNumber());
		qry.setParameter("transactionDescription", transaction.getTransactionDescription());
		qry.setParameter("dateOfTransaction",transaction.getDateOfTransaction());
		qry.setParameter("transactionamount",transaction.getTransactionamount());
		qry.setParameter("transactionId", transaction.getTransactionId());
		int noofrows = qry.executeUpdate();
		if (noofrows > 0) {
			System.out.println("Updated " + noofrows + " rows. ");
		}
		return getAllTransaction();
	}

	@Override
	public List<Transaction> deleteTransaction(int  transactionId) {
		Query qry = getSession().createQuery(" delete Transaction  t where transactionId=:transactionId");
		qry.setParameter("transactionId", transactionId);
		int noofrows = qry.executeUpdate();
		if (noofrows > 0) {
			System.out.println("Deleted " + noofrows + " rows. ");
		}
		return getAllTransaction();
	}

}