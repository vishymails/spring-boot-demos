package com.ibm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@Autowired
	HelloProperties props;
	
	@RequestMapping("/")
	public String display()
	{
		return "Hello from Spring Boot";
	}
	
	@RequestMapping("/hello")
	public String sayHello(@RequestParam String name)
	{ 
		return name;
	}

	
	@RequestMapping("/vf")
	public String sayHello1(@RequestParam String name)
	{
		return props.getGreeting() + name;
	}
}
