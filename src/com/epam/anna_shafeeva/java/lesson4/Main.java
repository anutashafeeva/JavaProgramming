package com.epam.anna_shafeeva.java.lesson4;

import com.epam.anna_shafeeva.java.lesson4.task1.classes.Salad;
import com.epam.anna_shafeeva.java.lesson4.task1.classes.*;
import com.epam.anna_shafeeva.java.lesson4.task1.exceptions.InvalidWeightOfVegetableException;
import com.epam.anna_shafeeva.java.lesson4.task1.exceptions.VegetableIsNotExistExeption;

public class Main {

    public static void main(String[] args) throws InvalidWeightOfVegetableException, VegetableIsNotExistExeption {
        Main app = new Main();
        app.start();
    }

    private void start() throws InvalidWeightOfVegetableException, VegetableIsNotExistExeption {

        Vegetable[] vegetables = new Vegetable[7];

        Beet beet = new Beet(400, "boiled");
        Carrot carrot = new Carrot(300, "boiled");
        Potato potato = new Potato(400, "boiled");
        Cabbage cabbage = new Cabbage(200, "conserved");
        Cucumber cucumber = new Cucumber(200, "conserved");
        Onion onion = new Onion(150, "fresh");
        GreenPea greenPea = new GreenPea(500, "conserved");

        Salad salad = new Salad();

        salad.addVegetables(vegetables, potato);
        salad.addVegetables(vegetables, beet);
        salad.addVegetables(vegetables, carrot);
        salad.addVegetables(vegetables, cabbage);
        salad.addVegetables(vegetables, cucumber);
        salad.addVegetables(vegetables, onion);
        salad.addVegetables(vegetables, greenPea);

        salad.canMakeSalad(vegetables);
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
