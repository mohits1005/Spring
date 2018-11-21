package com.jfs.service;

import java.util.ArrayList;

import com.jfs.model.Customer;
import com.jfs.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {
	
	private CustomerRepository customerRepository;
	public CustomerServiceImpl() {}
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	@Override
	public ArrayList<Customer> findAll() {
		return customerRepository.findAll();
	}
}
