package com.mph.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mph.dao.AccountDao;

import com.mph.entity.Account;
@Service
@Transactional
public class AccountServiceImpl implements AccountService {

	@Autowired
	public AccountDao  accountDao;
	

	@Override
	public void createAccount(Account account) {
		accountDao.createAccount(account);
	}


	@Override
	public List<Account> getAllAccount() {
		return accountDao.getAllAccount();
	}


	@Override
	public List<Account> updateAccount(Account account) {
		return accountDao.updateAccount(account);

	}


	@Override
	public List<Account> deleteAccount(int accountNumber) {
		return  accountDao.deleteAccount(accountNumber);

	}

	

}
	
	
	