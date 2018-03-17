package com.epam.anna_shafeeva.java.lesson1.task3;

import java.util.Scanner;

public class Task3 {

    public void calculation() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two number: a, b");
        int a, b;

        try {
            a = scanner.nextInt();
            b = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Wrong number");
            return;
        }

        System.out.println("Enter the operation: +, -, *, /");

        String meth = scanner.next();
        if (meth.equals("+") || meth.equals("-") || meth.equals("*") || meth.equals("/")) {

            switch (meth) {
                case "+": {
                    System.out.println(addition(a, b));
                    break;
                }
                case "-": {
                    System.out.println(subtraction(a, b));
                    break;
                }
                case "*": {
                    System.out.println(multiplication(a, b));
                    break;
                }
                case "/": {
                    System.out.println(division(a, b));
                    break;
                }
            }
        } else {
            System.out.println("Wrong operation");
        }
    }

    private int addition(int a, int b) {
        return a + b;
    }

    private int subtraction(int a, int b) {
        return a - b;
    }

    private int multiplication(int a, int b) {
        return a * b;
    }

    private double division(int a, int b) {
        return (a * 1.0) / b;
    }
}
