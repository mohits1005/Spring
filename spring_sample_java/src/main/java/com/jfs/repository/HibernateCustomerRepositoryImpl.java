package com.jfs.repository;

import java.util.ArrayList;

import com.jfs.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	/* (non-Javadoc)
	 * @see com.jfs.repository.CustomerRepository#findAll()
	 */
	@Override
	public ArrayList<Customer> findAll(){
		ArrayList<Customer> customers = new ArrayList<>();
		Customer customer = new Customer();
		customer.setFirstname("Sam");
		customer.setLastname("Pat");
		customers.add(customer);
		return customers;
	}
}
