package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Customer;
import com.repository.CustomerRepository;


@Service
public class CustomerService implements CustomerInterface
{
	@Autowired
	CustomerRepository repo;

	@Override
	public List<Customer> getAllCustomers() {
		List<Customer> list = repo.findAll();
		return list;
	}

	@Override
	public Customer addCustomer(Customer customer) {
		return repo.save(customer);
	}

}
