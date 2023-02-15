package com.example.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Model.Customer;

@Service
public interface CustomerService {
	
	Customer createCustomer(Customer customer);
	List<Customer> findAllCustomer();
	void deleteCustomer(int customerid);
	Customer updateCustomer(Customer customer);
	List<Customer> findBycustomerid(int customerid);
	List<Customer> findBycustomername(String customername);

}
