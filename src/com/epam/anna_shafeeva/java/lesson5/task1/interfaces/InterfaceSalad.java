package com.epam.anna_shafeeva.java.lesson5.task1.interfaces;

import com.epam.anna_shafeeva.java.lesson5.task1.vegetables.Vegetable;

import java.util.List;

public interface InterfaceSalad {

    double getCaloricity(List<Vegetable> vegetables);

    void makeSalad(List<Vegetable> vegetables);

    void addVegetables(List<Vegetable> vegetables, Vegetable vegetable);

    void sortVegetablesByCalories(List<Vegetable> vegetables);

    void sortVegetablesByWeight(List<Vegetable> vegetables);
}
