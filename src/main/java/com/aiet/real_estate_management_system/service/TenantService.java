package com.aiet.real_estate_management_system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aiet.real_estate_management_system.entity.Tenant;
import com.aiet.real_estate_management_system.repository.TenantRepository;

@Service
public class TenantService {
	
	private TenantRepository tenantRepository;

	@Autowired
	public TenantService(TenantRepository tenantRepository) {
		super();
		this.tenantRepository = tenantRepository;
	}
	
	//create Tenant
	public Tenant createTenant(Tenant tenant) {
		return tenantRepository.save(tenant);
	}
	
	//List all tenant
	public List<Tenant> getAllTenants(){
		return tenantRepository.findAll();
	}
	
	
	//Delete Tenant
	
	public void deleteTenantById(Long id) {
		tenantRepository.deleteById(id);
	}
	
	

}
