package com.mph.service;

import java.util.List;

import com.mph.entity.Customer;

public interface CustomerService {
	public void createCustomer(Customer customer);
	public List<Customer> getAllCustomer();
	public Customer getCustomer(Customer cus);
	public List<Customer> updateCustomer(Customer customer);
	public List<Customer> deleteCustomer(int cid);
	public Customer getCustomer(int id);
	

}