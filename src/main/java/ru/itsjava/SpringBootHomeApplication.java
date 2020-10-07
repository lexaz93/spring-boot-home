package ru.itsjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.itsjava.service.CoffeeService;

@SpringBootApplication
public class SpringBootHomeApplication {

	public static void main(String[] args) {
		var context = SpringApplication.run(SpringBootHomeApplication.class, args);
		context.getBean(CoffeeService.class).start();
	}

}
