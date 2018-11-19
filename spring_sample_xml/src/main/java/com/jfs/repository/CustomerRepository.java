package com.jfs.repository;

import java.util.ArrayList;

import com.jfs.model.Customer;

public interface CustomerRepository {

	ArrayList<Customer> findAll();

}