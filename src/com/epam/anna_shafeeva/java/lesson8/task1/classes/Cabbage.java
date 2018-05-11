package com.epam.anna_shafeeva.java.lesson8.task1.classes;

public class Cabbage extends Vegetable {

    public Cabbage(int w, String st) {
        super(w, st);
    }

    public double countCalories() {
        return weight * 25;
    }

    @Override
    public String toString() {
        return "cabbage";
    }
}
