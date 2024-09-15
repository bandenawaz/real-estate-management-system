package com.aiet.real_estate_management_system;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class RealEstateManagementSystemApplicationTests {

	@Test
	void contextLoads() {
	}

}
