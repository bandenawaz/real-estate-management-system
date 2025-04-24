package com.aiet.real_estate_management_system.controller;

import com.aiet.real_estate_management_system.entity.Tenant;
import com.aiet.real_estate_management_system.service.TenantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/tenants")
public class TenantController {

    private TenantService tenantService;

    @Autowired
    public TenantController(TenantService tenantService) {
        this.tenantService = tenantService;
    }

    //get all tenants
    @GetMapping
    public List<Tenant> getAllTenants(){
        return tenantService.getAllTenants();
    }

    //add a tenant
    @PostMapping
    public Tenant addTenant(@RequestBody Tenant tenant) {
        return tenantService.createTenant(tenant);
    }

}
