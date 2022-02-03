package com.mph.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mph.dao.TransactionDao;

import com.mph.entity.Transaction;
@Service
@Transactional
public class TransactionServiceImpl implements TransactionService{
	
	@Autowired
	public TransactionDao  transactionDao;

	@Override
	public void createTransaction(Transaction transaction) {
		  transactionDao.createTransaction(transaction);
		
	}

	@Override
	public List<Transaction> getAllTransaction() {
		return transactionDao.getAllTransaction();
	}

	

	@Override
	public List<Transaction> updateTransaction(Transaction transaction) {
		return transactionDao.updateTransaction(transaction);
	}

	@Override
	public List<Transaction> deleteTransaction(int transactionId) {
		return transactionDao.deleteTransaction(transactionId);
	}

}




