package com.aiet.real_estate_management_system.controller;

import com.aiet.real_estate_management_system.entity.Property;
import com.aiet.real_estate_management_system.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/properties")
public class PropertyController {

    private PropertyService propertyService;
    @Autowired
    public PropertyController(PropertyService propertyService) {
        this.propertyService = propertyService;
    }

    //get all properties
    @GetMapping
    public List<Property> getAllProperties(){
        return propertyService.getAllProperties();
    }

    //add a property
    public Property addProperty(@RequestBody Property property) {
        return propertyService.createProperty(property);
    }

}
