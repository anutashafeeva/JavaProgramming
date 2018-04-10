package com.epam.anna_shafeeva.java.lesson4.task1.classes;

import com.epam.anna_shafeeva.java.lesson4.task1.interfaces.InterfaceSalad;

public class Salad implements InterfaceSalad {

    @Override
    public double getCaloricity(Vegetable[] vegetables) {
        double calories = 0;
        for (int i = 0; i < vegetables.length; i++) {
            try {
                calories += vegetables[i].countCalories();
            } catch (Exception e) {
                break;
            }
        }
        return calories / 1000;
    }

    @Override
    public void makeSalad(Vegetable[] vegetables) {
        System.out.println("Ingredients:");
        for (int i = 0; i < vegetables.length; i++) {
            try {
                System.out.println(vegetables[i].state + " " + vegetables[i].toString() + " - " + vegetables[i].weight + " grams");
            } catch (Exception e) {
                return;
            }
        }
    }

    @Override
    public void addVegetables(Vegetable[] vegetables, Vegetable vegetable) {
        for (int i = 0; i < 7; i++) {
            if (vegetables[i] == null) {
                vegetables[i] = vegetable;
                return;
            }
        }
    }

    @Override
    public void sortVegetablesByCalories(Vegetable[] vegetables) {
        for (int i = vegetables.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                try {
                    if (vegetables[j].countCalories() > vegetables[j + 1].countCalories()) {
                        Vegetable vegetable = vegetables[j];
                        vegetables[j] = vegetables[j + 1];
                        vegetables[j + 1] = vegetable;
                    }
                } catch (Exception e) {
                    return;
                }
            }
        }
    }

    @Override
    public void sortVegetablesByWeight(Vegetable[] vegetables) {
        for (int i = vegetables.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                try {
                    if (vegetables[j].weight > vegetables[j + 1].weight) {
                        Vegetable vegetable = vegetables[j];
                        vegetables[j] = vegetables[j + 1];
                        vegetables[j + 1] = vegetable;
                    }
                } catch (Exception e) {
                    return;
                }
            }
        }
    }
}
