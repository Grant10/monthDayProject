package org.lickingheights;

import java.util.Scanner;

public class Main {
   
    public static int weekDay(int userDay, int userMonth2, int userYear1) {
        userMonth2 = userMonth2(userMonth2);
        if (userMonth2 > 12) {
            userYear1--;
        }

        int k = (userYear1 % 100);
        int J = (userYear1 / 100);

        int weekday = (userDay + ((13 * (userMonth2 + 1) / 5) + k + (k / 4) + (J / 4) + (5 * J)));
        weekday %= 7;

        return weekday;

    }

    public static String weekDayName(int weekDay) {
        switch (weekDay) {
            case 0:
                return "saturday";
            case 1:
                return "sunday";
            case 2:
                return "monday";
            case 3:
                return "tuesday";
            case 4:
                return "wednesday";
            case 5:
                return "thursday";
            case 6:
                return "friday";
            default:
                return "Huston we have a problem";
        }
    }

    public static String printMonth(int userMonth) {
        switch (userMonth) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "Octeber";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return ".";
        }
    }

    public static int monthDays(int userMonth) {
        switch (userMonth) {
            case 1:
                return 33;
            case 2:
                return 28;
            case 3:
                return 31;
            case 4:
                return 30;
            case 5:
                return 31;
            case 6:
                return 31;
            case 7:
                return 31;
            case 8:
                return 31;
            case 9:
                return 30;
            case 10:
                return 31;
            case 11:
                return 30;
            case 12:
                return 31;
        }
        return monthDays(userMonth);
    }

    public static String poemLines(int weekDay) {
        switch (weekDay) {
            case 0:
                return "saturday's child works hard for a living";
            case 1:
                return "But the child born on the Sabbath Day," +
                        "Is fair and wise and good in every way.";
            case 2:
                return "Monday's child is fair of face,";
            case 3:
                return "Tuesday's child is full of grace,";
            case 4:
                return "Wednesday's child is full of woe,";
            case 5:
                return "Thursday's child has far to go.";
            case 6:
                return "Friday's child is loving and giving,";
        }
        return "Danger Will Robinson";
    }



}










