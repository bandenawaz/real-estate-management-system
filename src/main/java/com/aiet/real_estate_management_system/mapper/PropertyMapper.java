package com.aiet.real_estate_management_system.mapper;

import com.aiet.real_estate_management_system.dto.PropertyDTO;
import com.aiet.real_estate_management_system.entity.Property;

public class PropertyMapper {
	
	public static PropertyDTO toDTO(Property property) {
		
		PropertyDTO dto = new PropertyDTO();
		dto.setAddress(property.getAddress());
		dto.setPrice(property.getPrice());
		dto.setSize(property.getSize());
		dto.setOwnerName(property.getOwnerName());
		return dto;
	}
	
public static Property toEntity(PropertyDTO dto) {
		
		Property property = new Property();
		property.setAddress(dto.getAddress());
		property.setPrice(dto.getPrice());
		property.setSize(dto.getSize());
		property.setOwnerName(dto.getOwnerName());
		return property;
	}

}
