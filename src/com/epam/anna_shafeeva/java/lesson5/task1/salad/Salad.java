package com.epam.anna_shafeeva.java.lesson5.task1.salad;

import com.epam.anna_shafeeva.java.lesson5.task1.vegetables.Vegetable;

import java.util.Comparator;
import java.util.List;

public class Salad implements InterfaceSalad {

    @Override
    public double getCaloricity(List<Vegetable> vegetables) {
        double calories = 0;
        for (int i = 0; i < vegetables.size(); i++) {
            calories += vegetables.get(i).countCalories();
        }
        return calories / 1000;
    }

    @Override
    public void makeSalad(List<Vegetable> vegetables) {
        System.out.println("Ingredients:");
        for (int i = 0; i < vegetables.size(); i++) {
            System.out.println(vegetables.get(i).state + " " + vegetables.get(i).toString() + " - " + vegetables.get(i).weight + " grams");
        }
    }

    @Override
    public void addVegetables(List<Vegetable> vegetables, Vegetable vegetable) {
        vegetables.add(vegetable);
    }

    @Override
    public void sortVegetablesByCalories(List<Vegetable> vegetables) {
        vegetables.sort(Comparator.comparing(firstVegetable -> ((Double) firstVegetable.countCalories())));
    }

    @Override
    public void sortVegetablesByWeight(List<Vegetable> vegetables) {
        vegetables.sort(Comparator.comparing(firstVegetable -> ((Integer) firstVegetable.weight)));
    }
}
