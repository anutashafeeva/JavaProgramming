package com.epam.anna_shafeeva.java.lesson3.task1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Report {

    public void makeReport(Date startDate, List<Course> courses, int parameterOfReport) {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
        SimpleDateFormat simpleHourFormat = new SimpleDateFormat("HH");
        Date currentDate = new Date();
        Date currentHour = new Date();
        simpleDateFormat.format(currentDate);
        simpleHourFormat.format(currentHour);

        int allHoursOfCourse = 0;
        for (Course course : courses) {
            allHoursOfCourse += course.durationCourse;
        }

        int daysOfCourse = allHoursOfCourse / 8;
        int hoursOfCourse = allHoursOfCourse % 8;

        long differenceBetweenDates = currentDate.getTime() - startDate.getTime();
        int passedDays = (int) (differenceBetweenDates / (24 * 60 * 60 * 1000));
        int passedHours = Integer.parseInt(simpleHourFormat.format(currentHour));

        if (parameterOfReport == 1) {
            if (passedDays > daysOfCourse || (passedDays == daysOfCourse && passedHours >= hoursOfCourse + 10)) {
                System.out.println("Обучение завершено.");
            } else {
                System.out.println("Обучение не завершено.");
            }
        } else {
            System.out.println("Длительность программы в часах - " + allHoursOfCourse + " ч");
            System.out.println("Дата старта: " + simpleDateFormat.format(startDate));

            Calendar calendar = Calendar.getInstance();
            calendar.setTime(startDate);
            int addDays = daysOfCourse;
            if (hoursOfCourse != 0)
                addDays++;
            calendar.add(Calendar.DAY_OF_MONTH, addDays - 1);
            Date finishDate = calendar.getTime();
            System.out.println("Дата завершения: " + simpleDateFormat.format(finishDate));

            if (passedDays > daysOfCourse || (passedDays == daysOfCourse && Integer.parseInt(String.valueOf(currentHour)) >= hoursOfCourse + 10)) {
                int laterDays = passedDays - daysOfCourse;
                int laterHours = Math.min(18, passedHours) - (hoursOfCourse + 10);
                System.out.print("После окончания прошло ");
                System.out.print(laterDays + " д ");
                System.out.println(laterHours + " ч" + "\n");
            } else {
                int leftDays = daysOfCourse - passedDays;
                if (passedHours >= 18) {
                    leftDays--;
                }
                int leftHours = (hoursOfCourse + 10) - Math.min(10, Math.max(10, passedHours));
                System.out.print("До окончания осталось ");
                System.out.print(leftDays + " д ");
                System.out.println(leftHours + " ч" + "\n");
            }
        }
    }
}
