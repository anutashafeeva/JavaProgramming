package com.epam.anna_shafeeva.java.lesson4;

import com.epam.anna_shafeeva.java.lesson4.task1.classes.Salad;
import com.epam.anna_shafeeva.java.lesson4.task1.classes.*;
import com.epam.anna_shafeeva.java.lesson4.task1.exceptions.InvalidWeightOfVegetableException;
import com.epam.anna_shafeeva.java.lesson4.task1.exceptions.VegetableIsNotExistExeption;

public class Main {

    public static void main(String[] args) {
        Main app = new Main();
        app.start();
    }

    private void start() {

        Vegetable[] vegetables = new Vegetable[7];
        Beet beet = null;
        Carrot carrot = null;
        Potato potato = null;
        Cabbage cabbage = null;
        Cucumber cucumber = null;
        Onion onion = null;
        GreenPea greenPea = null;

        boolean flagMayCanSalad = true;
        while (flagMayCanSalad) {
            try {
                beet = new Beet((int) (Math.random() * 1000 - 100), "boiled");
                carrot = new Carrot((int) (Math.random() * 1000 - 100), "boiled");
                potato = new Potato((int) (Math.random() * 1000 - 100), "boiled");
                cabbage = new Cabbage((int) (Math.random() * 1000 - 100), "conserved");
                cucumber = new Cucumber((int) (Math.random() * 1000 - 100), "conserved");
                onion = new Onion((int) (Math.random() * 1000 - 100), "fresh");
                greenPea = new GreenPea((int) (Math.random() * 1000 - 100), "conserved");
                flagMayCanSalad = false;
            } catch (InvalidWeightOfVegetableException e) {
                System.out.println(e.getMessage());
            }
        }

        Salad salad = new Salad();

        int quantity = (int) (Math.random() * 2 + 6);

        salad.addVegetables(vegetables, potato);
        salad.addVegetables(vegetables, beet);
        salad.addVegetables(vegetables, carrot);
        salad.addVegetables(vegetables, cabbage);
        salad.addVegetables(vegetables, cucumber);
        salad.addVegetables(vegetables, onion);
        if (quantity == 7)
            salad.addVegetables(vegetables, greenPea);

        try {
            salad.canMakeSalad(vegetables);
        } catch (VegetableIsNotExistExeption e) {
            System.out.println(e.getMessage());
            return;
        }
        salad.makeSalad(vegetables);
        System.out.println();

        System.out.println("Caloricity of salad: " + salad.getCaloricity(vegetables) + " kcal" + "\n");

        salad.sortVegetablesByCalories(vegetables);
        System.out.println("Sorted vegetables by calories:");
        for (Vegetable vegetable : vegetables) {
            System.out.println(vegetable.toString() + " " + vegetable.countCalories() / 1000 + " kcal");
        }
        System.out.println();

        int startWeight = 100;
        int finishWeight = 290;
        salad.sortVegetablesByWeight(vegetables);
        System.out.println("Vegetable which weight between " + startWeight + " and " + finishWeight + ":");
        for (Vegetable vegetable : vegetables) {
            if (vegetable.weight >= startWeight && vegetable.weight <= finishWeight)
                System.out.println(vegetable.toString() + " " + vegetable.weight);
        }
    }
}
