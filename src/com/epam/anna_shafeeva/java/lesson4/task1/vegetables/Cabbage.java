package com.epam.anna_shafeeva.java.lesson4.task1.vegetables;

import com.epam.anna_shafeeva.java.lesson4.task1.exceptions.InvalidWeightOfVegetableException;

public class Cabbage extends Vegetable {

    public Cabbage(int w, String st) throws InvalidWeightOfVegetableException {
        super(w, st);
    }

    public double countCalories() {
        return weight * 25;
    }

    @Override
    public String toString() {
        return "cabbage";
    }
}
