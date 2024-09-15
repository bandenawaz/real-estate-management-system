package com.aiet.real_estate_management_system;

import org.springframework.boot.SpringApplication;

public class TestRealEstateManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.from(RealEstateManagementSystemApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
