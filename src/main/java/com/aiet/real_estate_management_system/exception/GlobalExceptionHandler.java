package com.aiet.real_estate_management_system.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ErrorResponse> handleResourceNotFoundException(
			ResourceNotFoundException ex, WebRequest request){
		
		ErrorResponse errorResponse = new ErrorResponse(HttpStatus.NOT_FOUND, 
				ex.getMessage(), 
				request.getDescription(false), 
				request.getContextPath()
				);
		
		
		return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
		
	}
	
	//Handle other exceptions (e.g bad request, validation failures, etc..)
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorResponse> handleGlobalException(Exception ex,
			WebRequest request){
		
		ErrorResponse errorResponse = new ErrorResponse(
				HttpStatus.INTERNAL_SERVER_ERROR, 
				ex.getMessage(),
				request.getDescription(false),
				request.getContextPath()
				);
		return new ResponseEntity<ErrorResponse>(errorResponse, 
				HttpStatus.INTERNAL_SERVER_ERROR);
				
	}
	

}
