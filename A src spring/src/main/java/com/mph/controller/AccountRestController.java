package com.mph.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mph.entity.Account;
import com.mph.service.AccountService;
@RestController
@RequestMapping("/account")
@CrossOrigin(allowCredentials = "false",allowedHeaders =  "*"  ,origins = "http://localhost:4200",methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE} )
public class AccountRestController {
	@Autowired
	public AccountService accountService;
	
	@GetMapping("/allaccount")
	public ResponseEntity<List<Account>> listAllAccounts() {
		List<Account> li = accountService.getAllAccount();
		if (li.isEmpty()) {
			return new ResponseEntity<List<Account>>(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<List<Account>>(li,HttpStatus.OK);
	}

	
	

	@PostMapping("/createAccount")
	public  Account createAccount(@RequestBody Account  account) {
		accountService.createAccount(account);
		return account;
	}
	@PutMapping("/updateAccount")
	public ResponseEntity<List<Account>> updateAccount(@RequestBody Account  account) {
		List<Account> li =  accountService.updateAccount(account);
		
		if (li.isEmpty()) {
			return new ResponseEntity<List<Account>>(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<List<Account>>(li,HttpStatus.OK);
	}

	
	@DeleteMapping("/deleteAccount/{accountNumber}")
	public ResponseEntity<List<Account>> deleteAccount(@PathVariable("accountNumber") int id) {
		List<Account> li =  accountService.deleteAccount(id);
		if (li.isEmpty()) {
			return new ResponseEntity<List<Account>>(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<List<Account>>(li,HttpStatus.OK);
	}
	
	
	
	
}


	



	


