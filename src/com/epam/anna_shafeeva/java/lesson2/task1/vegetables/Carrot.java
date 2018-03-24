package com.epam.anna_shafeeva.java.lesson2.task1.vegetables;

public class Carrot extends Vegetable {

    public Carrot(int w, String st) {
        super(w, st);
    }

    public double countCalories() {
        return weight * 41;
    }

    @Override
    public String toString() {
        return "carrot";
    }
}
