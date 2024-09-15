package com.aiet.real_estate_management_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aiet.real_estate_management_system.entity.Tenant;

public interface TenantRepository extends JpaRepository<Tenant, Long>{

}
