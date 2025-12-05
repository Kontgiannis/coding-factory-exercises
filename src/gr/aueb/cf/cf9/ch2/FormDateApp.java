package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

/**
 * User gives 3 numbers Date Month Year and prints them in the form DD/MM/YYY
 * @author Giannis
 * @version 1.0.0
 */

public class FormDateApp {
    public static void main(String[] args) {
        int day;
        int month;
        int year;
        Scanner reader = new Scanner(System.in);
        System.out.print("Give today's day (number only): ");
        day = reader.nextInt();
        System.out.print("Give today's month (number only): ");
        month = reader.nextInt();
        System.out.print("Give today's year (number only): ");
        year = reader.nextInt();
        System.out.printf("Today's date is: %02d / %02d / %d", day, month, year);

    }
}
