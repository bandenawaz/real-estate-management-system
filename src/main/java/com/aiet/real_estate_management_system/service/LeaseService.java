package com.aiet.real_estate_management_system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aiet.real_estate_management_system.entity.Lease;
import com.aiet.real_estate_management_system.repository.LeaseRepository;

@Service
public class LeaseService {
	
	private LeaseRepository leaseRepository;

	@Autowired
	public LeaseService(LeaseRepository leaseRepository) {
		super();
		this.leaseRepository = leaseRepository;
	}
	
	//create lease
	public Lease createLease(Lease lease) {
		
		return leaseRepository.save(lease);
	}
	
	//list all the leases
	public List<Lease> getAllLeases(){
		return leaseRepository.findAll();
	}
	
	//delete lease by its id
	public void deleteLease(Long id) {
		leaseRepository.deleteById(id);
	}
	
	

}
