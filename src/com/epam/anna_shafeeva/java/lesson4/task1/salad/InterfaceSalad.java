package com.epam.anna_shafeeva.java.lesson4.task1.salad;

import com.epam.anna_shafeeva.java.lesson4.task1.vegetables.Vegetable;
import com.epam.anna_shafeeva.java.lesson4.task1.exceptions.VegetableIsNotExistExeption;

public interface InterfaceSalad {

    double getCaloricity(Vegetable[] vegetables);

    void makeSalad(Vegetable[] vegetables) throws VegetableIsNotExistExeption;

    void addVegetables(Vegetable[] vegetables, Vegetable vegetable);

    void sortVegetablesByCalories(Vegetable[] vegetables);

    void sortVegetablesByWeight(Vegetable[] vegetables);
}
