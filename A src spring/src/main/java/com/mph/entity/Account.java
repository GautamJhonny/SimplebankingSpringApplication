package com.mph.entity;






import javax.persistence.Entity;


import javax.persistence.Id;

import java.math.BigDecimal;



@Entity
public class Account {

    @Id
    
    private Long  id;
    private int accountNumber;
    private BigDecimal accountBalance;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigDecimal getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(BigDecimal accountBalance) {
        this.accountBalance = accountBalance;
    }

	@Override
	public String toString() {
		return "Account [id=" + id + ", accountNumber=" + accountNumber + ", accountBalance=" + accountBalance + "]";
	}

   


}
