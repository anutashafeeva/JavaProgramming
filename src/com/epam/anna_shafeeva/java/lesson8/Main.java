package com.epam.anna_shafeeva.java.lesson8;

import com.epam.anna_shafeeva.java.lesson8.task1.classes.*;
import javafx.util.Pair;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.*;

public class Main {

    private Vegetable[] vegetables = new Vegetable[7];

    public static void main(String[] args) {
        Main app = new Main();
        app.start();
    }

    private void start() {

        File file = new File("src/resources/com/epam/anna_shafeeva/java/lesson8/task1/ingredients.xml");

        ListOfVegetables[] listOfVegetables = ListOfVegetables.values();
        for (int i = 0; i < listOfVegetables.length; i++) {
            String nameOfVegetable = listOfVegetables[i].getName();
            Pair<Integer, String> parametersOfVegetable = getParametersOfVegetablesByXMLFile(file, nameOfVegetable);
            Vegetable vegetable = takeVegetable(i, parametersOfVegetable);
            vegetables[i] = vegetable;
        }

        Salad salad = new Salad();
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

    private Vegetable takeVegetable(int position, Pair<Integer, String> parametersOfVegetable) {
        Vegetable vegetable = null;
        switch (position) {
            case 0: {
                vegetable = new Beet(parametersOfVegetable.getKey(), parametersOfVegetable.getValue());
                break;
            }
            case 1: {
                vegetable = new Carrot(parametersOfVegetable.getKey(), parametersOfVegetable.getValue());
                break;
            }
            case 2: {
                vegetable = new Potato(parametersOfVegetable.getKey(), parametersOfVegetable.getValue());
                break;
            }
            case 3: {
                vegetable = new Cabbage(parametersOfVegetable.getKey(), parametersOfVegetable.getValue());
                break;
            }
            case 4: {
                vegetable = new Cucumber(parametersOfVegetable.getKey(), parametersOfVegetable.getValue());
                break;
            }
            case 5: {
                vegetable = new Onion(parametersOfVegetable.getKey(), parametersOfVegetable.getValue());
                break;
            }
            case 6: {
                vegetable = new GreenPea(parametersOfVegetable.getKey(), parametersOfVegetable.getValue());
                break;
            }
        }
        return vegetable;
    }

    public static Pair<Integer, String> getParametersOfVegetablesByXMLFile(File file, String vegetableName) {
        Pair<Integer, String> result = null;
        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder;
            dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(file);
            doc.getDocumentElement().normalize();
            NodeList nList = doc.getElementsByTagName("vegetable");
            for (int id = 0; id < nList.getLength(); id++) {
                Node nNode = nList.item(id);
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    if (eElement.getElementsByTagName("name").item(0).getTextContent().equals(vegetableName)) {
                        Integer weight = Integer.parseInt(eElement.getElementsByTagName("weight").item(0).getTextContent());
                        String state = eElement.getElementsByTagName("state").item(0).getTextContent();
                        result = new Pair<>(weight, state);
                    }
                }
            }
        } catch (ParserConfigurationException | SAXException | IOException
                | SecurityException | IllegalArgumentException e) {
            e.printStackTrace();
        }
        return result;
    }
}
