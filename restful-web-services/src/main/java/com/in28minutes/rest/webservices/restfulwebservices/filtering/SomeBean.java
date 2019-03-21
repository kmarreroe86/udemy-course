package com.in28minutes.rest.webservices.restfulwebservices.filtering;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class SomeBean {

	private String field1;

	private String field2;

	@JsonIgnore
	private String securedField3;

	public SomeBean(String value1, String value2, String value3) {
		super();
		this.field1 = value1;
		this.field2 = value2;
		this.securedField3 = value3;
	}

	public String getField1() {
		return field1;
	}

	public void setValue1(String value1) {
		this.field1 = value1;
	}

	public String getField2() {
		return field2;
	}

	public void setValue2(String value2) {
		this.field2 = value2;
	}

	public String getSecuredField3() {
		return securedField3;
	}

	public void setSecuredField3(String securedField3) {
		this.securedField3 = securedField3;
	}

}
