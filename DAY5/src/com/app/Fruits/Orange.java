package com.app.Fruits;

import com.app.Fruit;

public class Orange extends Fruit{
    public Orange(String name, double weight, String color) {
        super(name, color, weight);
    }

    @Override
    public String taste() {
        return "sweet";
    }
}
