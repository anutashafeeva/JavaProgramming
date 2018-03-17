package com.epam.anna_shafeeva.java.lesson1.task1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Task1 {

    private int minPositive = 10, posMinPos = 0, maxNegative = -10, posMaxNeg = 0, evenSum = 0, minElem = 10;
    private float averageArithmetical = 0;
    private List<Integer> mas = new ArrayList<>();
    private HashMap<Integer, Integer> calc = new HashMap<>();

    public void workWithArrays() {

        for (int i = 0; i < 20; i++) {
            mas.add((int) (-10 + Math.random() * 21));
            if (!calc.containsKey(mas.get(i)))
                calc.put(mas.get(i), 1);
            else {
                calc.put(mas.get(i), calc.get(mas.get(i)) + 1);
            }
            if (mas.get(i) > 0 && mas.get(i) < minPositive) {
                minPositive = mas.get(i);
                posMinPos = i;
            }
            if (mas.get(i) < 0 && mas.get(i) > maxNegative) {
                maxNegative = mas.get(i);
                posMaxNeg = i;
            }
            if (mas.get(i) < minElem)
                minElem = mas.get(i);
            if (i % 2 == 0)
                evenSum += mas.get(i);
            averageArithmetical += mas.get(i);
        }
        averageArithmetical /= 20;

        System.out.print("The generated array: \n");
        for (int i = 0; i < 20; i++) {
            System.out.print(mas.get(i) + " ");
        }
        System.out.println("\n");

        maxNegativeMinPositive();
        sumElementsOnEvenPos();
        negativeElementsToNull();
        triplePositiveElementsFacingNegative();
        differenceAverageArithmeticalAndMinElement();
        elementsMeetMoreOnceAndOnOddPos();
    }

    private void maxNegativeMinPositive() {

        System.out.println("1. Swap the maximum negative and minimum positive elements.");
        for (int i = 0; i < 20; i++) {
            if (i == posMinPos)
                System.out.print(maxNegative + " ");
            else if (i == posMaxNeg)
                System.out.print(minPositive + " ");
            else
                System.out.print(mas.get(i) + " ");
        }
        System.out.println("\n");
    }

    private void sumElementsOnEvenPos() {

        System.out.println("2. The sum of the elements on even positions");
        System.out.println(evenSum);
        System.out.println();
    }

    private void negativeElementsToNull() {

        System.out.println("3. Replace the negative elements with '0'");
        for (int i = 0; i < 20; i++) {
            if (mas.get(i) < 0)
                System.out.print("0 ");
            else
                System.out.print(mas.get(i) + " ");
        }
        System.out.println("\n");
    }

    private void triplePositiveElementsFacingNegative() {

        System.out.println("4. Triple the positive element facing the negative.");
        for (int i = 0; i < 20; i++) {
            if (i != 19 && mas.get(i) > 0 && mas.get(i + 1) < 0)
                System.out.print(3 * mas.get(i) + " ");
            else
                System.out.print(mas.get(i) + " ");
        }
        System.out.println("\n");
    }

    private void differenceAverageArithmeticalAndMinElement() {

        System.out.println("5. Calculate the difference between the average of the arithmetic and the minimum element.");
        System.out.println(averageArithmetical - minElem + "\n");
    }

    private void elementsMeetMoreOnceAndOnOddPos() {

        System.out.println("6. Output elements that meet more than once and stand on odd positions.");
        for (int i = 0; i < 20; i++) {
            if (calc.get(mas.get(i)) > 1 && i % 2 != 0)
                System.out.print(mas.get(i) + " ");
        }
    }

}