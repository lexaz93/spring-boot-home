package ru.itsjava.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.itsjava.coffee.Coffee;
import ru.itsjava.coffee.MilkCoffee;

@DisplayName("CoffeeService have:")
@SpringBootTest
public class CoffeeServiceTest {

    @MockBean
    private Coffee coffee;

    @MockBean
    private MilkCoffee milkCoffee;

    @Autowired
    private CoffeeService coffeeService;

    @Configuration
    class Config {
        @Bean
        public CoffeeService coffeeService() {
            return new CoffeeService(coffee, milkCoffee);
        }
    }

    @DisplayName("correct shouldCorrectCreateInstance()")
    @Test
    public void shouldCorrectCreateInstance(){
        Assertions.assertNotNull( coffeeService);
    }
}