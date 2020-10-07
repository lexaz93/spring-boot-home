package ru.itsjava.milk;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@NoArgsConstructor
@Service("myCream")
public class Cream implements Milkable {
    @Override
    public double getPercentage() {
        return 22.0;
    }
}
