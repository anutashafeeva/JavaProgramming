package com.epam.anna_shafeeva.java.lesson4.task1.vegetables;

public class GreenPea extends Vegetable {

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
