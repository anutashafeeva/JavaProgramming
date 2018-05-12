package com.epam.anna_shafeeva.java.lesson4.task1.vegetables;

import com.epam.anna_shafeeva.java.lesson4.task1.exceptions.InvalidWeightOfVegetableException;

public class Vegetable {

    public int weight;
    public String state;

    Vegetable(int weight, String state) throws InvalidWeightOfVegetableException {
        if (weight <= 0) throw new InvalidWeightOfVegetableException("Invalid weight of vegetable");
        this.weight = weight;
        this.state = state;
    }

    public double countCalories() {
        return 0;
    }
}
