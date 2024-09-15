package com.aiet.real_estate_management_system.dto;

import java.time.LocalDate;

import jakarta.validation.constraints.NotNull;

public class LeaseDTO {
	
	private Long id;
	
	@NotNull(message = "Start Date is required")
	private LocalDate startDate;
	
	@NotNull(message = "End Date is required")
	private LocalDate endDate;
	
	@NotNull(message = "Property Address is required")
	private String propertyAddress;
	
	
	private TenantDTO tenant;
	
	public LeaseDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LeaseDTO(Long id, LocalDate startDate, LocalDate endDate, String propertyAddress, TenantDTO tenant) {
		super();
		this.id = id;
		this.startDate = startDate;
		this.endDate = endDate;
		this.propertyAddress = propertyAddress;
		this.tenant = tenant;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	public String getPropertyAddress() {
		return propertyAddress;
	}
	public void setPropertyAddress(String propertyAddress) {
		this.propertyAddress = propertyAddress;
	}
	public TenantDTO getTenant() {
		return tenant;
	}
	public void setTenant(TenantDTO tenant) {
		this.tenant = tenant;
	}
	
	

}
