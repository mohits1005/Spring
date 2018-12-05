package com.jfs.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jfs.model.Customer;
import com.jfs.repository.CustomerRepository;
import com.jfs.repository.CustomerRepositoryImpl;
@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
//	@Autowired
	private CustomerRepository customerRepository;
//	@Autowired
	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("We are using setter injection");
		this.customerRepository = customerRepository;
	}
	@Autowired
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		System.out.println("We are using constructor injection");
		this.customerRepository = customerRepository;
	}
	/* (non-Javadoc)
	 * @see com.jfs.service.CustomerService#findAll()
	 */
	@Override
	public ArrayList<Customer> findAll() {
		return customerRepository.findAll();
	}
}
