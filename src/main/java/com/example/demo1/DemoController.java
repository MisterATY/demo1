package com.example.demo1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("/fufu")
	public String index() {
		return "Greetings from Spring Boot!";
	}

}
