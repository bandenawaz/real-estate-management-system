package com.aiet.real_estate_management_system.controller;

import com.aiet.real_estate_management_system.entity.Property;
import com.aiet.real_estate_management_system.service.PropertyService;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;
import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(PropertyController.class)
class PropertyControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private PropertyService propertyService;

    @Autowired
    private ObjectMapper objectMapper;

    private Property property;

    @BeforeEach
    void setUp() {
        property = new Property();
        property.setId(1L);
        property.setAddress("123 Main St");
        property.setPrice(200000.0);
        property.setSize(1500.0);
        property.setOwnerName("John Doe");
    }

    @Test
    void getAllProperties() throws Exception {
        List<Property> properties = Arrays.asList(property);
        given(propertyService.getAllProperties()).willReturn(properties);

        mockMvc.perform(get("api/properties"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.size()").value(1))
                .andExpect(jsonPath("$[0].address").value("123 Main St"));
    }

    @Test
    void addProperty() throws Exception {
        given(propertyService.createProperty(any(Property.class))).willReturn(property);

        mockMvc.perform(post("/properties")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(property)))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.id").value(1))
                .andExpect(jsonPath("$.ownerName").value("John Doe"));
    }
}
