package com.example.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	
	//Custom method
		List<Customer> findBycustomerid(int customerid);
		List<Customer> findBycustomername(String customername);


}
