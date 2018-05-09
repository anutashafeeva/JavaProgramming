package com.epam.anna_shafeeva.java.lesson4.task1.exceptions;

public class InvalidWeightOfVegetableException extends Exception {
    public InvalidWeightOfVegetableException() {
        super();
    }

    public InvalidWeightOfVegetableException(String message) {
        super(message);
    }
}
