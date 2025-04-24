package com.aiet.real_estate_management_system.controller;

import com.aiet.real_estate_management_system.entity.Tenant;
import com.aiet.real_estate_management_system.service.TenantService;
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

@WebMvcTest(TenantController.class)
class TenantControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private TenantService tenantService;

    @Autowired
    private ObjectMapper objectMapper;

    private Tenant tenant;

    @BeforeEach
    void setUp() {
        tenant = new Tenant();
        tenant.setId(1L);
        tenant.setName("John Doe");
        tenant.setEmail("john.doe@example.com");
        tenant.setPhone("123-456-7890");
    }

    @Test
    void getAllTenants() throws Exception {
        List<Tenant> tenants = Arrays.asList(tenant);
        given(tenantService.getAllTenants()).willReturn(tenants);

        mockMvc.perform(get("api/tenants"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.size()").value(1))
                .andExpect(jsonPath("$[0].name").value("John Doe"))
                .andExpect(jsonPath("$[0].email").value("john.doe@example.com"));
    }

    @Test
    void addTenant() throws Exception {
        given(tenantService.createTenant(any(Tenant.class))).willReturn(tenant);

        mockMvc.perform(post("/tenants")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(tenant)))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.id").value(1L))
                .andExpect(jsonPath("$.name").value("John Doe"))
                .andExpect(jsonPath("$.email").value("john.doe@example.com"));
    }
}
