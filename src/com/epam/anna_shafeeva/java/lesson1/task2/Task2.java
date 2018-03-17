package com.epam.anna_shafeeva.java.lesson1.task2;

import javafx.util.Pair;

import java.util.*;

public class Task2 {

    private List<String> str = new ArrayList<>();
    private int sizeMinStr = Integer.MAX_VALUE, sizeMaxStr = 0, posMinStr = 0, posMaxStr = 0, midSize = 0, n = 0;
    private List<Pair<String, Integer>> difSymbols = new ArrayList<>();

    public void workWithStrings() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of strings");
        n = scanner.nextInt();

        System.out.println("Enter " + n + " strings");
        for (int i = 0; i < n; i++) {
            String s = scanner.next();
            if (s.length() > sizeMaxStr) {
                sizeMaxStr = s.length();
                posMaxStr = i;
            }
            if (s.length() < sizeMinStr) {
                sizeMinStr = s.length();
                posMinStr = i;
            }
            midSize += s.length();
            HashSet<Character> characters = new HashSet<>();
            for (int j = 0; j < s.length(); j++) {
                characters.add(s.charAt(j));
            }
            difSymbols.add(new Pair<>(s, characters.size()));
            str.add(s);
        }
        midSize /= n;

        minStrMaxStr();
        sizeGreaterMiddle();
        sizeLessMiddle();
        minDifferentCharacters();
        onlyDifferentCharacters();
        onlyDigits();
    }

    private void minStrMaxStr() {

        System.out.println("1. Minimum and maximum strings and their lengths:");
        System.out.println(str.get(posMinStr) + " length=" + str.get(posMinStr).length());
        System.out.println(str.get(posMaxStr) + " length=" + str.get(posMaxStr).length() + "\n");
    }

    private void sizeGreaterMiddle() {

        boolean flag = false;
        System.out.println("2. Strings whose length is greater than the average and their length.");
        for (int i = 0; i < n; i++) {
            if (str.get(i).length() > midSize) {
                System.out.println(str.get(i) + " length=" + str.get(i).length());
                flag = true;
            }
        }
        if (!flag)
            System.out.println("There is no such string.");
        System.out.println();
    }

    private void sizeLessMiddle() {

        boolean flag = false;
        System.out.println("3. Strings whose length is less than the average and their length.");
        for (int i = 0; i < n; i++) {
            if (str.get(i).length() < midSize) {
                System.out.println(str.get(i) + " length=" + str.get(i).length());
                flag = true;
            }
        }
        if (!flag)
            System.out.println("There is no such string.");
        System.out.println();
    }

    private void minDifferentCharacters() {

        System.out.println("4. The first string in which the number of different characters is minimal.");
        int minDiff = sizeMaxStr;
        for (int i = 0; i < n; i++) {
            if (difSymbols.get(i).getValue() < minDiff)
                minDiff = difSymbols.get(i).getValue();
        }
        for (int i = 0; i < n; i++) {
            if (difSymbols.get(i).getValue() == minDiff) {
                System.out.println(difSymbols.get(i).getKey());
                break;
            }
        }
        System.out.println();
    }

    private void onlyDifferentCharacters() {

        boolean flag = false;
        System.out.println("5. The first string in which all characters are different.");
        for (int i = 0; i < n; i++) {
            if (difSymbols.get(i).getValue() == difSymbols.get(i).getKey().length()) {
                System.out.println(difSymbols.get(i).getKey());
                flag = true;
                break;
            }
        }
        if (!flag)
            System.out.println("There is no such string.");
        System.out.println();
    }

    private void onlyDigits() {

        boolean flag = false;
        System.out.println("6. The string consisting only of digits (the second, if there are several of them).");
        int number = 0;
        String string = "";
        for (int i = 0; i < n; i++) {
            int numb = 0;
            for (int j = 0; j < str.get(i).length(); j++) {
                if (Character.isDigit(str.get(i).charAt(j))) {
                    numb++;
                    flag = true;
                }
            }
            if (numb == str.get(i).length()) {
                if (number == 1) {
                    System.out.println(str.get(i));
                    return;
                }
                number++;
                string = str.get(i);
            }
        }
        if (!flag)
            System.out.println("There is no such string.");
        else
            System.out.println(string);
    }
}