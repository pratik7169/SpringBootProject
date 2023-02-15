package com.example.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="Customerinfo")
public class Customer {
	@Id      //this annotation used to set primary key to cid
	@GeneratedValue(strategy=GenerationType.AUTO)  //used to auto increment
	private  int customerid;
	
	@NotNull(message ="Name is Manditory") //used to add validation is not null value
	private String customername;
	
	@Email(message="Enter valid Email")//for valid email
	@NotBlank(message="Email is required")
	private String email;
	
	@NotBlank(message="Contactno is required")
	private String contactno;
	
	@NotBlank(message="Address is required")
	@NotNull(message="Address is not null")
	private String address;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int customerid, @NotNull(message = "Name is Manditory") String customername,
			@Email(message = "Enter valid Email") @NotBlank(message = "Email is required") String email,
			@NotBlank(message = "Contactno is required") String contactno,
			@NotBlank(message = "Address is required") @NotNull(message = "Address is not null") String address) {
		super();
		this.customerid = customerid;
		this.customername = customername;
		this.email = email;
		this.contactno = contactno;
		this.address = address;
	}

	public int getCustomerid() {
		return customerid;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactno() {
		return contactno;
	}

	public void setContactno(String contactno) {
		this.contactno = contactno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	
	

}
