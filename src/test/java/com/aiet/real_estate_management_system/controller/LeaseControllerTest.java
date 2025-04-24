package com.aiet.real_estate_management_system.controller;

import com.aiet.real_estate_management_system.entity.Lease;
import com.aiet.real_estate_management_system.entity.Property;
import com.aiet.real_estate_management_system.entity.Tenant;
import com.aiet.real_estate_management_system.service.LeaseService;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import static org.mockito.BDDMockito.*;

@WebMvcTest(LeaseController.class)
class LeaseControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private LeaseService leaseService;

    @Autowired
    private ObjectMapper objectMapper;

    private Lease lease;

    @BeforeEach
    void setUp() {
        Property property = new Property();
        property.setId(1L);

        Tenant tenant = new Tenant();
        tenant.setId(1L);

        lease = new Lease(1L, property, tenant,
                LocalDate.of(2025, 1, 1),
                LocalDate.of(2026, 1, 1),
                1200.0);
    }

    @Test
    void getAllLeases() throws Exception {
        List<Lease> leases = Arrays.asList(lease);

        given(leaseService.getAllLeases()).willReturn(leases);

        mockMvc.perform(get("/leases"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.size()").value(1))
                .andExpect(jsonPath("$[0].rentAmount").value(1200.0));
    }

    @Test
    void createLease() throws Exception {
        given(leaseService.createLease(any(Lease.class))).willReturn(lease);

        mockMvc.perform(post("api/leases")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(lease)))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.id").value(1L))
                .andExpect(jsonPath("$.rentAmount").value(1200.0));
    }
}
