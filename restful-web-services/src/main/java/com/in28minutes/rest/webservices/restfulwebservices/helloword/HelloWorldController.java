package com.in28minutes.rest.webservices.restfulwebservices.helloword;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.context.support.MessageSourceResourceBundle;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@Autowired
	private MessageSource messageSource;

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

	@GetMapping(path = "hello-world-internationalized")
	public String helloWorldInternationalized(
//			@RequestHeader(name="Accept-Language", required=false) Locale locale
	) {
		return messageSource.getMessage("good.morning.message", null, LocaleContextHolder.getLocale());
	}
}
