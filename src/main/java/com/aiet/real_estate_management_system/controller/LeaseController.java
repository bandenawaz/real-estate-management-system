package com.aiet.real_estate_management_system.controller;

import com.aiet.real_estate_management_system.entity.Lease;
import com.aiet.real_estate_management_system.service.LeaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/leases")
public class LeaseController {

    private LeaseService leaseService;
    @Autowired
    //dependency injection
    public LeaseController(LeaseService leaseService) {
        super();
        this.leaseService = leaseService;
    }

    //get all leases
    @GetMapping
    public List<Lease> getAllLeases(){
        return leaseService.getAllLeases();
    }

    //Add a lease
    @PostMapping
    public Lease createLease(@RequestBody Lease lease) {
        return leaseService.createLease(lease);
    }




}
