package com.in28minutes.rest.webservices.restfulwebservices.filtering;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@RestController
public class FilteringController {
	
	@GetMapping("/filtering")
	public MappingJacksonValue retrieveSomeBean() {
		SomeBean beanVal = new SomeBean("value1", "values2", "value3");
		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("field1", "field3");
		FilterProvider filterProvider = new SimpleFilterProvider().addFilter("SimpleBeanFilter", filter);
		
		MappingJacksonValue jacksonValue = new MappingJacksonValue(beanVal);
		jacksonValue.setFilters(filterProvider);
		return jacksonValue;
	}

	@GetMapping("/filtering-list")
	public MappingJacksonValue retrieveListOfSomeBean() {
		List<SomeBean> listBeans = Arrays.asList(new SomeBean("value1", "values2", "value3"), new SomeBean("value11", "values22", "value33"));
		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("field2", "field3");
		FilterProvider filterProvider = new SimpleFilterProvider().addFilter("SimpleBeanFilter", filter);

		MappingJacksonValue jacksonValue = new MappingJacksonValue(listBeans);
		jacksonValue.setFilters(filterProvider);
		return jacksonValue;
//		return listBeans;
	}

}
