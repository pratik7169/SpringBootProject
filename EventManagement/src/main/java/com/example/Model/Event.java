package com.example.Model;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="EVENT")//table name

public class Event {
    @Id  //this annotation used to set primary key to Eid
    @GeneratedValue(strategy = GenerationType.AUTO)//used to auto increment
    private int Eid;
    //
     @NotBlank(message="Eventname is not empty") //used to add validation is not null value
    private String Eventname;
     @NotNull(message="description is not empty")
   private String location;
    private int capacity;
    
    @OneToMany( cascade = CascadeType.ALL,fetch=FetchType.LAZY)
    List<Customer> customerlist;	
    //Getter and Setter

	public int getEid() {
		return Eid;
	}

	public void setEid(int eid) {
		Eid = eid;
	}

	public String getEventname() {
		return Eventname;
	}

	public void setEventname(String eventname) {
		Eventname = eventname;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public List<Customer> getCustomerlist() {
		return customerlist;
	}

	public void setCustomerlist(List<Customer> customerlist) {
		this.customerlist = customerlist;
		
	}
	

	public Event() {
		
		// TODO Auto-generated constructor stub
	}
  //constructor 
	public Event(int eid, @NotBlank(message = "Eventname is not empty") String eventname,
			@NotNull(message = "description is not empty") String location, int capacity, List<Customer> customerlist) {
		super();
		Eid = eid;
		Eventname = eventname;
		this.location = location;
		this.capacity = capacity;
		this.customerlist = customerlist;
	}

	
    

}

