package com.epam.anna_shafeeva.java.lesson6.task1.vegetables;

import java.io.Serializable;

public class Vegetable implements Serializable {

    public int weight;
    public String state;

    Vegetable(int w, String st) {
        weight = w;
        state = st;
    }

    public double countCalories() {
        return 0;
    }
}
