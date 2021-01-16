package com.ibm;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootEndPoints {
	
	@RequestMapping("/display")
	public String display()
	{
		return "Welcome to Spring Boot";
	}

}
