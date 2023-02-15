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

import com.example.Model.Event;
import com.example.Service.EventService;
@RestController
public class EventController {
	@Autowired //(required=true)
	 EventService eventService;
	
	@PostMapping("/event")
	public ResponseEntity<Event> createEvent(@Valid @RequestBody Event event) //method to post the value
	
	//Event SaveEvent(@RequestBody Event event)
	{
		return new ResponseEntity<Event>(eventService.createEvent(event),HttpStatus.CREATED);
		//return eventService.createEvent(event);
	}
	@GetMapping("/event")  
	private List<Event> findAllEvent()   
	{  
	return eventService.findAllEvent();  
	} 
	@DeleteMapping("/event/{id}")  
	   private void deleteEvent(@PathVariable("id") int Eid)   
	   {  
		eventService.deleteEvent(Eid);
	   }  
	@PutMapping(value="/Event")										
	public Event updateEvent(@RequestBody Event event)  
	{
		return eventService.updateEvent(event);
	}
//	@GetMapping("/event/{id}")  
//	   private Event getEvent (@RequestBody @PathVariable("id") int eid)   
//	   {  
//	   return (Event) eventService.findByEid(eid);
//	   }  
//	
//	@GetMapping("/event/{name}")
//			private Event getEvent (@RequestBody @PathVariable("name") String eventname)   
//			{
//				return (Event) eventService.findByEventname(eventname);
//			}
}






/*{
    "id": 1,
    "name": "pratik",
    "description": "birthday",
    "location": "pune",
    "capacity": 20
}*/
