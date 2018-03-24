package com.epam.anna_shafeeva.java.lesson2.task1.vegetables;

public class Potato extends Vegetable {

    public Potato(int w, String st) {
        super(w, st);
    }

    public double countCalories() {
        return weight * 77;
    }

    @Override
    public String toString() {
        return "potato";
    }
}
