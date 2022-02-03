package com.mph.dao;


import java.util.List;

import com.mph.entity.Transaction;

public interface TransactionDao {
	public void createTransaction(Transaction transaction);
	public List<Transaction> getAllTransaction();
	public List<Transaction> updateTransaction(Transaction transaction);
	public List<Transaction> deleteTransaction(int transactionId);
	
	

}
