package ru.itsjava.coffee;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ru.itsjava.milk.Milkable;

@Data
@Service
public class MilkCoffee {
    private Coffee coffee;
    private Milkable milkable;

    @Autowired
    public MilkCoffee(Coffee coffee, @Qualifier("myMilk") Milkable milk) {
        this.coffee = coffee;
        this.milkable = milk;
    }

    @Override
    public String toString() {
        return coffee + " + " + milkable.getClass().toString().split("\\.")[3];
    }
}