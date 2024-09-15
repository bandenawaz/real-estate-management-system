package com.aiet.real_estate_management_system.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "leases")
public class Lease {
	
	private Long id;
	private Property property;
	
	private Tenant tenant;
	
	private LocalDate startDate;
	private LocalDate endDate;
	
	private double rentAmount;

}
