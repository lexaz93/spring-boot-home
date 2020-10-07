package ru.itsjava.coffee;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.itsjava.milk.Milk;
import ru.itsjava.milk.Milkable;

@DisplayName("MilkCoffee have:")
@SpringBootTest
public class MilkCoffeeTest {

    @MockBean
    private Coffee coffee;

    @MockBean
    private Milk milk;

    @Autowired
    private MilkCoffee milkCoffee;

    @Configuration
    class Config {
        @Bean
        public MilkCoffee milkCoffee() {
            return new MilkCoffee(coffee, milk);
        }
    }

    @DisplayName("Correct shouldCorrectCreateInstance()")
    @Test
    public void shouldCorrectCreateInstance() {
        Assertions.assertNotNull(milkCoffee);
    }

    @DisplayName("correct toString()")
    @Test
    public void shouldCorrectMethodToStringMilkCoffee() {
        MilkCoffee milkCoffee = new MilkCoffee(new Coffee("Arabic"), new Milk());

        Assertions.assertEquals(milkCoffee.toString(), "Arabic + Milk");
    }
}
