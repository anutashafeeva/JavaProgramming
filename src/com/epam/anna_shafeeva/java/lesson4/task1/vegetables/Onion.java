package com.epam.anna_shafeeva.java.lesson4.task1.vegetables;

public class Onion extends Vegetable {

    public Onion(int w, String st) {
        super(w, st);
    }

    public double countCalories() {
        return weight * 40;
    }

    @Override
    public String toString() {
        return "onion";
    }
}
