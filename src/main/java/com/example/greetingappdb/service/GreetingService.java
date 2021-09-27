package com.example.greetingappdb.service;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.greetingappdb.model.Greeting;
import com.example.greetingappdb.model.User;
import com.example.greetingappdb.repository.GreetingRepository;
@Service
public class GreetingService implements IgreetingService{
	@Autowired
	private GreetingRepository greetingRepository;
	private static final String template="Hello %s";
	private final AtomicLong counter= new AtomicLong();
	
	@Override
	public Greeting addGreeting(User user) {
		
		String message=String.format(template, (user.toString().isEmpty()?"Hello World":user.toString()));
		return greetingRepository.save( new Greeting(counter.incrementAndGet(),message));
	}

}
