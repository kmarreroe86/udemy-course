package com.in28minutes.rest.webservices.restfulwebservices.helloword;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	// GET
	// URI - /hello-world
	@GetMapping(path = "hello-world")
	public String helloWorld() {
		return "Hello World";
	}
	
	@GetMapping(path = "hello-world-bean")
	public HelloWordlBean HelloWordlBean() {
		return new HelloWordlBean("Hello World");
	}
	
	// GET
	// URI - /hello-world-path-variable
	@GetMapping(value = "hello-world-path-variable/{param}")
	public HelloWordlBean helloWorldPathVarialbe(@PathVariable final String param) {
		return new HelloWordlBean(String.format("Hello World %s", param)) ;
	}


}
