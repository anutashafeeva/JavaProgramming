package com.epam.anna_shafeeva.java.lesson2;

import com.epam.anna_shafeeva.java.lesson2.task1.classes.Salad;
import com.epam.anna_shafeeva.java.lesson2.task1.classes.*;

public class Main {

    private Vegetable[] vegetables = new Vegetable[7];

    private Beet beet = new Beet(400, "boiled");
    private Carrot carrot = new Carrot(300, "boiled");
    private Potato potato = new Potato(400, "boiled");
    private Cabbage cabbage = new Cabbage(200, "conserved");
    private Cucumber cucumber = new Cucumber(200, "conserved");
    private Onion onion = new Onion(150, "fresh");
    private GreenPea greenPea = new GreenPea(500, "conserved");

    public static void main(String[] args) {
        Main app = new Main();
        app.start();
    }

    private void start() {

        Salad salad = new Salad();

        salad.addVegetables(vegetables, potato);
        salad.addVegetables(vegetables, beet);
        salad.addVegetables(vegetables, carrot);
        salad.addVegetables(vegetables, cabbage);
        salad.addVegetables(vegetables, cucumber);
        salad.addVegetables(vegetables, onion);
        salad.addVegetables(vegetables, greenPea);

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
