package com.mph.dao;



import java.util.List;

import com.mph.entity.Account;

public interface AccountDao {

	public void createAccount(Account account);
	public List<Account> getAllAccount();
	
	public List<Account> updateAccount(Account account);
	public List<Account> deleteAccount(int accountNumber);

	



}
