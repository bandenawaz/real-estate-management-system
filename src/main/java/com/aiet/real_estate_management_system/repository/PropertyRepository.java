package com.aiet.real_estate_management_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aiet.real_estate_management_system.entity.Property;

@Repository
public interface PropertyRepository extends JpaRepository<Property, Long>{

}
