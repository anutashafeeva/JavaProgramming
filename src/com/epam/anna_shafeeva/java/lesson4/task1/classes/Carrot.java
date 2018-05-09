package com.epam.anna_shafeeva.java.lesson4.task1.classes;

import com.epam.anna_shafeeva.java.lesson4.task1.exceptions.InvalidWeightOfVegetableException;

public class Carrot extends Vegetable {

    public Carrot(int w, String st) throws InvalidWeightOfVegetableException {
        super(w, st);
    }

    public double countCalories() {
        return weight * 41;
    }

    @Override
    public String toString() {
        return "carrot";
    }
}
