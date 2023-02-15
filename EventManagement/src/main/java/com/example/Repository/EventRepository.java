package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Model.Event;

public interface EventRepository extends JpaRepository<Event, Integer> {
	//custom method
//    List<Event>findByEid(int eid);
//    List<Event>findByEventname(String eventname);
}
