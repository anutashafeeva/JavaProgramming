package com.epam.anna_shafeeva.java.lesson6.task1.classes;

import java.io.Serializable;

public class Onion extends Vegetable implements Serializable {

    public Onion(int w, String st) {
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
