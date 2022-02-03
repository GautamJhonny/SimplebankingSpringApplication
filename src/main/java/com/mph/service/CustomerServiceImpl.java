package com.mph.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mph.dao.CustomerDao;
import com.mph.entity.Customer;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService{


	@Autowired
	public CustomerDao  customerDao;
	
	@Override
	public void createCustomer(Customer customer) {
		customerDao.createCustomer(customer);
		
	}

	@Override
	public List<Customer> getAllCustomer() {
		return customerDao.getAllCustomer();

	}

	@Override
	public Customer getCustomer(Customer cus) {
		return customerDao.getCustomer(cus);

	}

	@Override
	public List<Customer> updateCustomer(Customer customer) {
		return customerDao.updateCustomer(customer);
	}

	@Override
	public List<Customer> deleteCustomer(int cid) {
		return customerDao.deleteCustomer(cid);
	}

	@Override
	public Customer getCustomer(int id) {
		return  customerDao.getCustomer(id);

	}

}