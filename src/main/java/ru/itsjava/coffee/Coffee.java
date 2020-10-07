package ru.itsjava.coffee;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Data
@Service("myCoffee")
public class Coffee {
    private String type;

    @Autowired
    public Coffee(@Value("${type}") String type) {this.type = type;}

    @Override
    public String toString() {
        return type;
    }
}
