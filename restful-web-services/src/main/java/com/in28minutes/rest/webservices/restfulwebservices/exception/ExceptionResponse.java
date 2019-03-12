package com.in28minutes.rest.webservices.restfulwebservices.exception;

import java.util.Date;

public class ExceptionResponse {

	private Date timestamp;

	private String details;

	private String message;

	public ExceptionResponse(Date timeStamp, String details, String message) {
		super();
		this.timestamp = timeStamp;
		this.details = details;
		this.message = message;
	}

	public Date getTimeStamp() {
		return timestamp;
	}

	public String getDetails() {
		return details;
	}

	public String getMessage() {
		return message;
	}

}
