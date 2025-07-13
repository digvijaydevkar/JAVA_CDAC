package com.app.Fruits;

import com.app.Fruit;

public class Apple extends Fruit {
    public Apple(String name, double weight, String color) {
        super(name, color, weight);
    }

    @Override
    public String taste() {
        return "sweet n sour";
    }
}

