package com.epam.anna_shafeeva.java.lesson4.task1.classes;

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
