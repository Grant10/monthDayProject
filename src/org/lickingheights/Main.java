package org.lickingheights;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int userYear1;
        int userMonth;
        int userDay2;
        int userDay1;
        int UserYear1;
        int k;
        int j;

        while (true)

        {
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");

            System.out.println("Monday's child is full of face");
            System.out.println("Tuesday's child is full of grace");
            System.out.println("Wednasday's child is full of woe");
            System.out.println("Thursday's child has far to go");
            System.out.println("Friday's child is loving and giving");
            System.out.println("Saturday's child works hard for a living");
            System.out.println("but the child born on sabath day, is fair and good in evry way");
            System.out.println("");
            System.out.println("let's see what day you were born on.  What month were you born (number only please)");
            userMonth = keyboard.nextInt();

            System.out.println("What day number in " + printMonth(userMonth) + "");
            userDay1 = keyboard.nextInt();
            System.out.println("what year were you born");
            userYear1 = keyboard.nextInt();
            System.out.println("There are " + (userMonth) + " day in " + printMonth(userMonth) + "");
            int tempIntValue = weekDay(userDay1, userMonth, userYear1);


            System.out.println("According to the poem you are " + poemLines(tempIntValue));


        }


    }
}
