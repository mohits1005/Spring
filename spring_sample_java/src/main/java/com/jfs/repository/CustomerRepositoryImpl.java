package com.jfs.repository;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.jfs.model.Customer;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	/* (non-Javadoc)
	 * @see com.jfs.repository.CustomerRepository#findAll()
	 */
	
	@Value("${dbUsername}")
	private String dbUsername;
	
	@Override
	public ArrayList<Customer> findAll(){
		System.out.println(dbUsername);
		ArrayList<Customer> customers = new ArrayList<>();
		Customer customer = new Customer();
		customer.setFirstname("Sam");
		customer.setLastname("Pat");
		customers.add(customer);
		return customers;
	}
}
