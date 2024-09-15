package com.aiet.real_estate_management_system.exception;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

public class ErrorResponse {
	
	private HttpStatus status;
	private String message;
	private String details;
	private String path;
	private LocalDateTime timestamp;
	
	

	public ErrorResponse(HttpStatus status, String message, 
			String details, String path) {
		super();
		this.status = status;
		this.message = message;
		this.details = details;
		this.path = path;
		
	}
	
	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

}
