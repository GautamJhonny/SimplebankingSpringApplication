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



import com.mph.entity.Transaction;
import com.mph.service.TransactionService;

@RestController
@RequestMapping("/transaction")
@CrossOrigin(allowCredentials = "false",allowedHeaders =  "*"  ,origins = "http://localhost:4200",methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE} )

public class TransactionRestController {
	
	@Autowired
	public TransactionService  transactionService;
	
	
	@GetMapping("/alltransaction")
	public ResponseEntity<List<Transaction>> listAllTransactions() {
		List<Transaction> li = transactionService.getAllTransaction();
		if (li.isEmpty()) {
			return new ResponseEntity<List<Transaction>>(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<List<Transaction>>(li,HttpStatus.OK);
	}

	
	

	@PostMapping("/createTransaction")
	public  Transaction createTransaction(@RequestBody Transaction  transaction) {
		 transactionService.createTransaction( transaction);
		return transaction;
	}
	@PutMapping("/updateTransaction")
	public ResponseEntity<List<Transaction>> updateTransaction(@RequestBody Transaction  transaction) {
		List<Transaction> li =  transactionService.updateTransaction( transaction);
		
		if (li.isEmpty()) {
			return new ResponseEntity<List<Transaction>>(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<List<Transaction>>(li,HttpStatus.OK);
	}

	
	@DeleteMapping("/deleteTransaction/{transactionid}")
	public ResponseEntity<List<Transaction>> deleteTransaction(@PathVariable("transactionid") int id) {
		List<Transaction> li =  transactionService.deleteTransaction(id);
		if (li.isEmpty()) {
			return new ResponseEntity<List<Transaction>>(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<List<Transaction>>(li,HttpStatus.OK);
	}
	
	
	
	
}
