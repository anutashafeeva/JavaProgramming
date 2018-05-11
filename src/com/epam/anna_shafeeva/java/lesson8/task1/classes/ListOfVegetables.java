package com.epam.anna_shafeeva.java.lesson8.task1.classes;

public enum ListOfVegetables {
    BEET("Beet"),
    CABBAGE("Cabbage"),
    CARROT("Carrot"),
    CUCUMBER("Cucumber"),
    GREENPEA("GreenPea"),
    ONION("Onion"),
    POTATO("Potato");

    String name;

    ListOfVegetables(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
