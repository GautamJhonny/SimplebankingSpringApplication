package com.mph.service;



import java.util.List;

import com.mph.entity.Transaction;

public interface TransactionService {
	public void createTransaction(Transaction transaction);
	public List<Transaction> getAllTransaction();
	
	public List<Transaction> updateTransaction(Transaction transaction);
	public List<Transaction> deleteTransaction(int transactionId);
}