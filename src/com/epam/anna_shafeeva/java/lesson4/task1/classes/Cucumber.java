package com.epam.anna_shafeeva.java.lesson4.task1.classes;

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
