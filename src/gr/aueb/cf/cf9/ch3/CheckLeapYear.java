package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * User gives a year and a check is run to determine whether the given year is a leap year or not
 * @author Giannis
 * @version 1.0.0
 */


public class CheckLeapYear {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Give a year which you want to check if it's a leap year: ");
        int year = reader.nextInt();
        boolean isLeap = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));

        if (isLeap) {
            System.out.printf("The year %d is a leap year",year);
        } else {
            System.out.printf("The year %d is not a leap year",year);
        }
        reader.close();

    }
}
