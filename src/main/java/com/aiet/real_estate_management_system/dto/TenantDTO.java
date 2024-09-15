package com.aiet.real_estate_management_system.dto;

import java.util.List;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class TenantDTO {
	
	private Long id;
	
	@NotBlank(message = "Name is required")
	@Size(min = 2, max = 50, 
		message = "Name must be between 2 and 50 characters")
	private String name;
	
	@NotBlank(message = "Email is required")
	@Email(message = "Please provide a valid email address")
	private String email;
	
	@NotBlank(message = "Phone number is required")
	@Size(max = 15, 
		message = "Phone number can't be longer than 15 characters")
	private String phone;
	
	private List<LeaseDTO> leases;

	public TenantDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TenantDTO(Long id, String name, String email, String phone,List<LeaseDTO> leases) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.leases = leases;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<LeaseDTO> getLeases() {
		return leases;
	}

	public void setLeases(List<LeaseDTO> leases) {
		this.leases = leases;
	}
	
	

}
