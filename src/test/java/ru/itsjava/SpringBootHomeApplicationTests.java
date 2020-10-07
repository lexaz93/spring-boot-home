package ru.itsjava;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;

@DisplayName("SpringBootHomeApplication have:")
@SpringBootTest
class SpringBootHomeApplicationTests {
	ConfigurableApplicationContext context = SpringApplication.run(SpringBootHomeApplication.class, "null");

	@DisplayName("correct contextLoads()")
	@Test
	void contextLoads() {
		Assertions.assertNotNull(context);
	}

}
