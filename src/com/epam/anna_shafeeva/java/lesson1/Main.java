package com.epam.anna_shafeeva.java.lesson1;

import com.epam.anna_shafeeva.java.lesson1.task1.Task1;
import com.epam.anna_shafeeva.java.lesson1.task2.Task2;
import com.epam.anna_shafeeva.java.lesson1.task3.Task3;

import java.util.Scanner;

public class Main {

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Main app = new Main();
        app.start();
    }

    private void start() {

        System.out.println("Enter the task number: \n 1 - task1 \n 2 - task2 \n 3 - task3");
        int t = scanner.nextInt();

        switch (t) {
            case 1: {
                Task1 task1 = new Task1();
                task1.workWithArrays();
                break;
            }
            case 2: {
                Task2 task2 = new Task2();
                task2.workWithStrings();
                break;
            }
            case 3: {
                Task3 task3 = new Task3();
                task3.calculation();
                break;
            }
            default:
                System.out.println("Invalid command");
        }
    }
}