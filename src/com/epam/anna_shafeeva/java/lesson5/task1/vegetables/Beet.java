package com.epam.anna_shafeeva.java.lesson5.task1.vegetables;

public class Beet extends Vegetable {

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
