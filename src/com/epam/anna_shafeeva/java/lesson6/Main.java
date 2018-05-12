package com.epam.anna_shafeeva.java.lesson6;

import com.epam.anna_shafeeva.java.lesson6.task1.salad.Salad;
import com.epam.anna_shafeeva.java.lesson6.task1.vegetables.*;

import java.io.*;

public class Main {

    private Vegetable[] vegetables = new Vegetable[7];

    public static void main(String[] args) {
        Main app = new Main();
        app.start();
    }

    private void start() {

        File file = new File("src/resources/com/epam/anna_shafeeva/java/lesson6/task1/ingredients.txt");
        try {
            if (!file.exists()) {
                file.createNewFile();
                writeObject(file, vegetables);
            } else {
                vegetables = (Vegetable[]) readObject(file);
            }
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }

        int positionForNextVegetable = 8;
        for (int i = 0; i < vegetables.length; i++) {
            if (vegetables[i] == null) {
                positionForNextVegetable = i;
                break;
            }
        }
        int quantityVegetables = (int) (Math.random() * (8 - positionForNextVegetable));

        int sizeOfVegetable = ListOfVegetables.values().length;
        for (int i = 0; i < quantityVegetables; i++) {
            int currentPositionVegetable = (int) (Math.random() * sizeOfVegetable);
            Vegetable currentVegetable = takeVegetable(currentPositionVegetable);
            vegetables[positionForNextVegetable++] = currentVegetable;
        }
        try {
            writeObject(file, vegetables);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Salad salad = new Salad();

        if (positionForNextVegetable != 8) {
            System.out.println("Not all vegetables in the salad");
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

    private Vegetable takeVegetable(int position) {
        int weightOfVegetable = (int) (Math.random() * 500 + 10);
        Vegetable vegetable = null;
        switch (position) {
            case 0: {
                vegetable = new Beet(weightOfVegetable, "boiled");
                break;
            }
            case 1: {
                vegetable = new Carrot(weightOfVegetable, "boiled");
                break;
            }
            case 2: {
                vegetable = new Potato(weightOfVegetable, "boiled");
                break;
            }
            case 3: {
                vegetable = new Cabbage(weightOfVegetable, "conserved");
                break;
            }
            case 4: {
                vegetable = new Cucumber(weightOfVegetable, "conserved");
                break;
            }
            case 5: {
                vegetable = new Onion(weightOfVegetable, "fresh");
                break;
            }
            case 6: {
                vegetable = new GreenPea(weightOfVegetable, "conserved");
                break;
            }
        }
        return vegetable;
    }

    public static void writeObject(File file, Object object) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(object);
        }
    }

    public static Object readObject(File file) throws IOException, ClassNotFoundException {
        Object result = null;
        try (ObjectInputStream oin = new ObjectInputStream(new FileInputStream(file))) {
            result = oin.readObject();
        }
        return result;
    }
}
