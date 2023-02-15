package com.example.RepoTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.Model.Customer;
import com.example.Model.Event;
import com.example.Repository.EventRepository;
import com.example.Service.EventService;

@SpringBootTest
public class EventTest {

	@MockBean
	private EventRepository  eventRepository;

	@Autowired(required=true)
	private EventService eventService;


	@Test
	void testSaveEvent()
	{
		List<Customer>customerlist=Stream.of(new Customer(11,"pratik","pratik@gmail.com","9673777108","pune"),
				new Customer(12,"unkown","aaa@gmail.com","9765415024","kamshet")).collect(Collectors.toList());	
		Event e=new Event(101,"Birthday","pune",30,customerlist);
		Mockito.when(eventRepository.save(e)).thenReturn(e);
		assertEquals(e, eventService.createEvent(e));
	}
	
	@Test
	void testDeleteEvent() 
	{
		eventService.deleteEvent(101);
		Mockito.verify(eventRepository).deleteById(101);
	}

}
