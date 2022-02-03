package com.mph.entity;
import java.io.Serializable;



import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;




@Entity
@Table(name="Transaction")
public class Transaction implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Column(name="accountid")
	private int accountNumber;
	//@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQUENCE2")
	//@SequenceGenerator(name="SEQUENCE2", sequenceName="tran_seq",allocationSize=10)
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="transactionid")
	private int transactionId;
	
	
	
	@Column(name="transaction_description")
	private String transactionDescription;
	
	@Column(name="dateoftransfer")
	private Date dateOfTransaction;
	
	@Column(name="transferamount")
	private int transactionamount;
	
	

	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Transaction(int accountNumber, int transactionId, String transactionDescription, Date dateOfTransaction,
			int transactionamount) {
		super();
		this.accountNumber = accountNumber;
		this.transactionId = transactionId;
		this.transactionDescription = transactionDescription;
		this.dateOfTransaction = dateOfTransaction;
		this.transactionamount = transactionamount;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public String getTransactionDescription() {
		return transactionDescription;
	}

	public void setTransactionDescription(String transactionDescription) {
		this.transactionDescription = transactionDescription;
	}

	public Date getDateOfTransaction() {
		return dateOfTransaction;
	}

	public void setDateOfTransaction(Date dateOfTransaction) {
		this.dateOfTransaction = dateOfTransaction;
	}

	public int getTransactionamount() {
		return transactionamount;
	}

	public void setTransactionamount(int transactionamount) {
		this.transactionamount = transactionamount;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Transaction [accountNumber=" + accountNumber + ", transactionId=" + transactionId
				+ ", transactionDescription=" + transactionDescription + ", dateOfTransaction=" + dateOfTransaction
				+ ", transactionamount=" + transactionamount + "]";
	}
	
}

	