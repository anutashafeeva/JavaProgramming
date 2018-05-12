package com.epam.anna_shafeeva.java.lesson4.task1.exceptions;

import com.epam.anna_shafeeva.java.lesson2.task1.vegetables.Vegetable;

public class VegetableIsNotExistExeption extends Exception {

    public VegetableIsNotExistExeption(Vegetable[] vegetables) {
        super();
    }

    public VegetableIsNotExistExeption(String message) {
        super(message);
    }
}
