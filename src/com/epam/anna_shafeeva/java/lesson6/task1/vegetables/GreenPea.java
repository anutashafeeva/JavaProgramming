package com.epam.anna_shafeeva.java.lesson6.task1.vegetables;

import java.io.Serializable;

public class GreenPea extends Vegetable implements Serializable {

    public GreenPea(int w, String st) {
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
