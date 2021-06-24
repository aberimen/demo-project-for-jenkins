package com.aberimen.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String getIndex() {
		return "Ana Sayfa";
	}

	@GetMapping("/hello")
	public String getHello() {
		return "Merhaba";
	}
	
	@GetMapping("/hell/{name}")
	public String getHelloWithName(@PathVariable String name) {
		return "Merhaba  " + name;
	}

}
