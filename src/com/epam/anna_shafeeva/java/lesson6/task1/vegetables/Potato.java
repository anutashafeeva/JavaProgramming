package com.epam.anna_shafeeva.java.lesson6.task1.vegetables;

import java.io.Serializable;

public class Potato extends Vegetable implements Serializable {

    public Potato(int w, String st) {
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
