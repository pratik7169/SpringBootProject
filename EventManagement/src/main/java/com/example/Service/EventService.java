package com.example.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Model.Event;

@Service
public interface EventService {
    Event createEvent(Event event);
    List<Event> findAllEvent();
    void deleteEvent(int Eid);
    Event updateEvent(Event event);
//    List<Event> findByEid(int eid);
//    List<Event> findByEventname(String eventname);
   
    
	
	
}
