package com.epam.anna_shafeeva.java.lesson4.task1.vegetables;

import com.epam.anna_shafeeva.java.lesson4.task1.exceptions.InvalidWeightOfVegetableException;

public class Onion extends Vegetable {

    public Onion(int w, String st) throws InvalidWeightOfVegetableException {
        super(w, st);
    }

    public double countCalories() {
        return weight * 40;
    }

    @Override
    public String toString() {
        return "onion";
    }
}
