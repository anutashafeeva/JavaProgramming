package com.epam.anna_shafeeva.java.lesson2.task1.vegetables;

public class Cucumber extends Vegetable {

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
