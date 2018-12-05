package com.jfs.service;

import java.util.ArrayList;

import com.jfs.model.Customer;
import com.jfs.repository.CustomerRepository;
import com.jfs.repository.CustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {
	
	private CustomerRepository customerRepository = new CustomerRepositoryImpl();
	/* (non-Javadoc)
	 * @see com.jfs.service.CustomerService#findAll()
	 */
	@Override
	public ArrayList<Customer> findAll() {
		return customerRepository.findAll();
	}
}
