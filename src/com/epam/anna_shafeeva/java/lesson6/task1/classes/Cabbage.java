package com.epam.anna_shafeeva.java.lesson6.task1.classes;

import java.io.Serializable;

public class Cabbage extends Vegetable implements Serializable {

    public Cabbage(int w, String st) {
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
