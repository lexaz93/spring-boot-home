package ru.itsjava.coffee;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@DisplayName("Coffee have:")
@SpringBootTest
public class CoffeeTest {

    @DisplayName("correct toString()")
    @Test
    public void shouldCorrectMethodToStringCoffee(){
        Coffee coffee = new Coffee("Arabic");

        Assertions.assertEquals(coffee.toString(), "Arabic");
    }

}
