package com.example.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Model.Customer;
import com.example.Repository.CustomerRepository;
import com.example.Service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired      //used to connect CustomerRepository
	CustomerRepository customerRepository;    //use all method of customerRepository for CRUD operation

	@Override
	public Customer createCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepository.save(customer);
	}

	@Override
	public List<Customer> findAllCustomer() {
		// TODO Auto-generated method stub
		return customerRepository.findAll();
	}

	@Override
	public void deleteCustomer(int customerid) {
		// TODO Auto-generated method stub
		customerRepository.deleteById(customerid);		
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		Customer _customer=customerRepository.findById(customer.getCustomerid()).get();
		_customer.setCustomername(customer.getCustomername());
		_customer.setContactno(customer.getContactno());
		_customer.setEmail(customer.getEmail());
		_customer.setAddress(customer.getAddress());
		return customerRepository.save(_customer);
	}

	@Override
	public List<Customer> findBycustomerid(int customerid) {
		// TODO Auto-generated method stub
		return customerRepository.findBycustomerid(customerid);
	}

	@Override
	public List<Customer> findBycustomername(String customername) {
		// TODO Auto-generated method stub
		return customerRepository.findBycustomername(customername);
	}

}
