package com.aiet.real_estate_management_system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aiet.real_estate_management_system.entity.Property;
import com.aiet.real_estate_management_system.exception.ResourceNotFoundException;
import com.aiet.real_estate_management_system.repository.PropertyRepository;

@Service
public class PropertyService {
	
	private PropertyRepository propertyRepository;
	
	//lets perform dependency inject by creating bean
	@Autowired
	public PropertyService(PropertyRepository propertyRepository) {
		
		this.propertyRepository = propertyRepository;
	}
	
	//create property
	public Property createProperty(Property property) {
		return propertyRepository.save(property);
	}
	
	//list all property
	public List<Property> getAllProperties(){
		
		return propertyRepository.findAll();
	}
	
	//delete property
	public void deleteProperty(Long id) {
		
		propertyRepository.deleteById(id);
	}
	
	//update property
	public Property updateProperty(Long id, Property propertyDetails) {
		
		Property property = propertyRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Property not found with id "+id));
		
		property.setAddress(propertyDetails.getAddress());
		property.setPrice(propertyDetails.getPrice());
		property.setOwnerName(propertyDetails.getOwnerName());
		return propertyRepository.save(property);
		
	}
	
	
	

}
