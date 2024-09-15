package com.aiet.real_estate_management_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aiet.real_estate_management_system.entity.Property;

public interface PropetyRepository extends JpaRepository<Property, Long>{

}
