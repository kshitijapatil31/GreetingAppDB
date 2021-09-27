package com.example.greetingappdb.controller;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.greetingappdb.model.Greeting;
import com.example.greetingappdb.model.User;
import com.example.greetingappdb.service.IgreetingService;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

	@Autowired
	private IgreetingService greetingService;
	
	private static final String template="Hello %s";
	private final AtomicLong counter= new AtomicLong();
	
	@GetMapping(value={"","/","/home"})
	public Greeting greeting(@RequestParam (value="name",defaultValue="World") String name) {
		
		User user=new User();
				user.setFirstName(name);
				return greetingService.addGreeting(user);
		
	}
	
	
}
