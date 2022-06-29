package com.in28minutes.rest.webservices.restfulwebservices;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;


/*
https://www.udemy.com/course/microservices-with-spring-boot-and-spring-cloud/learn/lecture/8005694#overview
*/
@SpringBootApplication
public class RestfulWebServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfulWebServicesApplication.class, args);
	}
	
	@Bean
	public LocaleResolver localeResolver() {
		AcceptHeaderLocaleResolver localeResolver = new AcceptHeaderLocaleResolver();
		localeResolver.setDefaultLocale(Locale.US);
		return localeResolver;
		
	}
	
	/*Not needed. Name of the files is specified in the application.properties
	 * @Bean
	public ResourceBundleMessageSource messageSource() {
		ResourceBundleMessageSource messageRource = new ResourceBundleMessageSource();
		messageRource.setBasename("messages");
		
		return messageRource;
	}*/
}
