package example.smallest.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@GetMapping(produces = "application/json")
	public String helloWorld() {
		return "Hello FUCKING World!!!";
	}
}
