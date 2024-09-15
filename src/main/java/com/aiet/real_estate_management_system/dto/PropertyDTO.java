package com.aiet.real_estate_management_system.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;

public class PropertyDTO {
	
	@NotEmpty(message = "Address is required")
	private String address;
	
	@Positive(message = "Price must be positive")
	private double price;
	
	@Positive(message = "Size must be positive")
	private double size;
	
	@NotEmpty(message = "Owner Name is required")
	private String ownerName;

	
	
	public PropertyDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PropertyDTO(@NotEmpty(message = "Address is required") String address,
			@Positive(message = "Price must be positive") double price,
			@Positive(message = "Size must be positive") double size,
			@NotEmpty(message = "Owner Name is required") String ownerName) {
		super();
		this.address = address;
		this.price = price;
		this.size = size;
		this.ownerName = ownerName;
	}

	//Getters and Setters
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	

}
