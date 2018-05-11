package com.epam.anna_shafeeva.java.lesson6.task1.classes;

import java.io.Serializable;

public class Carrot extends Vegetable implements Serializable {

    public Carrot(int w, String st) {
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
