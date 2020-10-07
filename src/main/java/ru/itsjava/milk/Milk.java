package ru.itsjava.milk;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@NoArgsConstructor
@Service("myMilk")
public class Milk implements Milkable {
    @Override
    public double getPercentage() {
        return 3.2;
    }
}
