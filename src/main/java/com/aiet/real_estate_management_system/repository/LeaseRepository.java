package com.aiet.real_estate_management_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aiet.real_estate_management_system.entity.Lease;

public interface LeaseRepository extends JpaRepository<Lease, Long>{

}
