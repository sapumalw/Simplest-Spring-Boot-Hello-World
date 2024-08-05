package example.smallest.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@GetMapping(produces = "application/json")
	public String helloWorld() {
		int c = 90;
		return "Hello FUCKING World!!!";
	}
}
