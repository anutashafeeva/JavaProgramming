package com.epam.anna_shafeeva.java.lesson6.task1.classes;

import java.io.Serializable;

public class Cucumber extends Vegetable implements Serializable {

    public Cucumber(int w, String st) {
        super(w, st);
    }

    public double countCalories() {
        return weight * 16;
    }

    @Override
    public String toString() {
        return "cucumber";
    }
}
