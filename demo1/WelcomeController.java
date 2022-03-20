package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	@GetMapping("/Warning")
    public String Warning() {
		return "Welcome to the World";
		}
		@GetMapping ("/font")
		public String font() {
			return "<h1> Welcome to the World</h1>";
			
}
	}
	
