package com.example.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Model.Event;
import com.example.Repository.EventRepository;
import com.example.Service.EventService;

@Service
public class EventServiceImpl implements EventService {

    @Autowired(required=true)
    private EventRepository eventRepository;

	@Override
	public Event createEvent(Event event) {
		// TODO Auto-generated method stub
		return eventRepository.save(event);
	}

	@Override
	public List<Event> findAllEvent() {
		// TODO Auto-generated method stub
		return eventRepository.findAll();
	}

	@Override
	public void deleteEvent(int Eid) {
		// TODO Auto-generated method stub
		eventRepository.deleteById(Eid);;
	}

	@Override
	public Event updateEvent(Event event) {
		// TODO Auto-generated method stub
		Event _event=eventRepository.findById(event.getEid()).get();
    	_event.setEventname(event.getEventname());
     	_event.setLocation(event.getLocation());
    	_event.setCapacity(event.getCapacity());
        return eventRepository.save(event);
    }

	
	

//	@Override
//	public List<Event> findByEid(int Eid) {
//		// TODO Auto-generated method stub
//		return eventRepository.findByEid(Eid);
//	}
//
//	@Override
//	public List<Event> findByEventname(String Eventname) {
//		// TODO Auto-generated method stub
//		return eventRepository.findByEventname(Eventname);
//	}

}
