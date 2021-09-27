package com.example.greetingappdb.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="Greet")

public class Greeting {

	@Id
	  @GeneratedValue
	  (strategy=GenerationType.AUTO)
	private long id;
	private String message;
	
	public Greeting() {
		id=0;
		message="";
	}
	public Greeting(long id, String message) {
		super();
		this.id = id;
		this.message = message;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
	
	
}
