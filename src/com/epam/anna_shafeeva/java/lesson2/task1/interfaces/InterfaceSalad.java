package com.epam.anna_shafeeva.java.lesson2.task1.interfaces;

import com.epam.anna_shafeeva.java.lesson2.task1.classes.Vegetable;

public interface InterfaceSalad {

    double getCaloricity(Vegetable[] vegetables);

    void makeSalad(Vegetable[] vegetables);

    void addVegetables(Vegetable[] vegetables, Vegetable vegetable);

    void sortVegetablesByCalories(Vegetable[] vegetables);

    void sortVegetablesByWeight(Vegetable[] vegetables);
}
