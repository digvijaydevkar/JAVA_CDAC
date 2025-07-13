package com.app.Fruits;

import com.app.Fruit;

public class Mango extends Fruit{
    public Mango(String name, double weight, String color) {
        super(name, color, weight);
    }

    @Override
    public String taste() {
        return "sweet";
    }

}
