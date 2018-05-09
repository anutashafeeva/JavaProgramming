package com.epam.anna_shafeeva.java.lesson4.task1.classes;

import com.epam.anna_shafeeva.java.lesson4.task1.exceptions.InvalidWeightOfVegetableException;

public class Potato extends Vegetable {

    public Potato(int w, String st) throws InvalidWeightOfVegetableException {
        super(w, st);
    }

    public double countCalories() {
        return weight * 77;
    }

    @Override
    public String toString() {
        return "potato";
    }
}
