package com.rest.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

	@GetMapping("/api")
	public String getApi() {
		return "Hello World !";
	}
	
}