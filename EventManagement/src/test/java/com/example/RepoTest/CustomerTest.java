package com.example.RepoTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.Model.Customer;
import com.example.Repository.CustomerRepository;
import com.example.Service.CustomerService;

@SpringBootTest
public class CustomerTest {
	@MockBean
	private CustomerRepository customerRepository;

	@Autowired(required=true)
	private CustomerService customerService;


	@Test
	void testSaveCustomer() 
	{
		Customer c=new Customer(11,"pratik","pratik@gmail.com","9673777108","pune");
		Mockito.when(customerRepository.save(c)).thenReturn(c);
		assertEquals(c,customerService.createCustomer(c));
		
	}

	
	@Test
	void testDeleteCustomer() 
	{
		customerService.deleteCustomer(11);;
		Mockito.verify(customerRepository).deleteById(11);
	}

}
