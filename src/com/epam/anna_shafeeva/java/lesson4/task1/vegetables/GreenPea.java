package com.epam.anna_shafeeva.java.lesson4.task1.vegetables;

import com.epam.anna_shafeeva.java.lesson4.task1.exceptions.InvalidWeightOfVegetableException;

public class GreenPea extends Vegetable {

    public GreenPea(int w, String st) throws InvalidWeightOfVegetableException {
        super(w, st);
    }

    public double countCalories() {
        return weight * 55;
    }

    @Override
    public String toString() {
        return "green pea";
    }
}
