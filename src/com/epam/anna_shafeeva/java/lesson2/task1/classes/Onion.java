package com.epam.anna_shafeeva.java.lesson2.task1.classes;

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
