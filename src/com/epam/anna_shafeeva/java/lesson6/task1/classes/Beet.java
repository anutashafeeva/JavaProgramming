package com.epam.anna_shafeeva.java.lesson6.task1.classes;

import java.io.Serializable;

public class Beet extends Vegetable implements Serializable {

    public Beet(int w, String st) {
        super(w, st);
    }

    public double countCalories() {
        return weight * 43;
    }

    @Override
    public String toString() {
        return "beet";
    }
}
