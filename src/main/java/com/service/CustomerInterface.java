package com.service;

import java.util.List;

import com.entity.Customer;

public interface CustomerInterface 
{
	List<Customer> getAllCustomers();
	Customer addCustomer(Customer customer);

}
