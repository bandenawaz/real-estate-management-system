package com.aiet.real_estate_management_system.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//Marks the response status as 404 NOT FOUND whenever this exception is thrown
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException(String message) {
		super(message);
		
	}
	
	public ResourceNotFoundException(String message, Throwable cause) {
		super(message, cause);
		
	}
	
	

}
