package com.jfs.service;

import java.util.ArrayList;

import com.jfs.model.Customer;
import com.jfs.repository.CustomerRepository;
import com.jfs.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {
	
	private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();
	/* (non-Javadoc)
	 * @see com.jfs.service.CustomerService#findAll()
	 */
	@Override
	public ArrayList<Customer> findAll() {
		return customerRepository.findAll();
	}
}
