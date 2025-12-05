package gr.aueb.cf.cf9.ch4;

import java.util.Scanner;

/**
 * User gives a number 1 - 7 and the programm returns the day of the week the number corresponds to
 * @author Giannis
 * @version 1.0.0
 */

public class DayOfWeekApp {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Give a number between 1 -7 to see its corresponding day of the week: ");
        int num = reader.nextInt();
        switch (num) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }
    }
}
