package com.example.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Event {
	
	@Id
	@GeneratedValue
	private Long eventId;
	private String name;
    private Date start;
    private Date end;
    
    // Constructors
	public Event() {
		super();
	}

	public Event(Long eventId, String name, Date start, Date end) {
		super();
		this.eventId = eventId;
		this.name = name;
		this.start = start;
		this.end = end;
	}


	// Getters and Setters
	
	public Long getEventId() {
		return eventId;
	}

	public void setEventId(Long eventId) {
		this.eventId = eventId;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getEnd() {
		return end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}

	@Override
	public String toString() {
		return "Event [name=" + name + ", start=" + start + ", end=" + end + "]";
	}

}
