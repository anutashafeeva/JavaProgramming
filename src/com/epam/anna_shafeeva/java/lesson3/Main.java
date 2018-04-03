package com.epam.anna_shafeeva.java.lesson3;

import com.epam.anna_shafeeva.java.lesson3.task1.Course;
import com.epam.anna_shafeeva.java.lesson3.task1.Report;
import com.epam.anna_shafeeva.java.lesson3.task1.Student;
import javafx.util.Pair;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {

        Main app = new Main();
        app.start();
    }

    private void start() throws ParseException {

        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");

        Student firstStudent = new Student("Ivan", "Ivanov", "J2EE Developer", simpleDateFormat.parse("27.03.2018"));
        Student secondStudent = new Student("Petr", "Petrov", "Java Developer", simpleDateFormat.parse("02.04.2018"));

        Course technologyJavaServlets = new Course("Технология Java Servlets", 16);
        Course strutsFramework = new Course("Struts Framework", 24);
        Course reviewTechnologyJava = new Course("Обзор технологий Java", 8);
        Course libraryJFCSwing = new Course("Библиотека JFC/Swing", 16);
        Course technologyJDBC = new Course("Технология JDBC", 5);

        List<Course> firstStudentCourses = new ArrayList<>();
        firstStudentCourses.add(technologyJavaServlets);
        firstStudentCourses.add(strutsFramework);

        List<Course> secondStudentCourses = new ArrayList<>();
        secondStudentCourses.add(reviewTechnologyJava);
        secondStudentCourses.add(libraryJFCSwing);
        secondStudentCourses.add(technologyJDBC);

        List<Pair<Student, List<Course>>> fullStudentData = new ArrayList<>();
        fullStudentData.add(new Pair(firstStudent, firstStudentCourses));
        fullStudentData.add(new Pair(secondStudent, secondStudentCourses));

        System.out.println("1 - short report");
        System.out.println("2 - detailed report");
        int parameterOfReport = scanner.nextInt();

        for (Pair<Student, List<Course>> studentListPair : fullStudentData) {
            System.out.println(studentListPair.getKey().toString());
            Report report = new Report();
            report.makeReport(studentListPair.getKey().getStartDate(), studentListPair.getValue(), parameterOfReport);
        }
    }
}
