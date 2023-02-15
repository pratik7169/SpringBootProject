package com.example.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Model.Customer;
import com.example.Service.CustomerService;

@RestController		//create RESTful web services using Spring MVC.o
public class CustomerController {
	
	@Autowired        //used to connect CustomerService
	CustomerService customerService;
	
	@PostMapping("/customer")														//mapping HTTP POST requests onto specific handler methods.
	public ResponseEntity<Customer> craeteCustomer (@Valid @RequestBody Customer customer)   //method for insert details
	
	//ResponseEntity is used to manipulate the HTTP Response
	
	{
		return new ResponseEntity<Customer>(customerService.createCustomer(customer),HttpStatus.CREATED);
	}	
	
	@GetMapping("/customer")					//mapping HTTP GET requests onto specific handler methods.
	public List<Customer> findAllCustomer()      //method for retrieve details
	{
		return customerService.findAllCustomer();
	}
	
	@DeleteMapping("/customer/{adarcardno}")						//mapping HTTP DELETE requests onto specific handler methods.
	public String deleteCustomer(@PathVariable int customerid)       //method for deleting the details
	{
		customerService.deleteCustomer(customerid);
		return "Customer deleted";
	}
	
	
	@PutMapping("/customer")										//mapping HTTP PUT requests onto specific handler methods.
	public Customer updateCustomer(@RequestBody Customer customer)     //method for update details
	{
		return customerService.updateCustomer(customer);
	}
	@GetMapping("/customer/customerid/{customerid}")					//mapping HTTP GET requests onto specific handler methods.
	public List<Customer> findBycustomerid(@PathVariable int customerid)   //method for retrieve value by id
	{
		return customerService.findBycustomerid(customerid);
	}
	
	
	@GetMapping("/customer/name/{customername}")							//mapping HTTP GET requests onto specific handler methods			
	public List<Customer> findBycustomername(@PathVariable String customername)  //method for retrieve value by name
	{
		return customerService.findBycustomername(customername);
	}
}

