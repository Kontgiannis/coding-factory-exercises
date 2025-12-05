package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

/**
 * Converts integer temperature reading in Fahrenheit given by user to integer temperature reading in Celsius
 * @author Giannis
 * @version 1.0.0
 */

public class TempConApp {
    public static void main(String[] args) {
        int fTemp;
        Scanner reader = new Scanner(System.in);
        System.out.print("Give the temperature in Fahrenheit: ");
        fTemp = reader.nextInt();
        int cTemp = 5 * (fTemp - 32) / 9;
        System.out.println("The temperature in Celsius is: " + cTemp + "\u00B0C");
        reader.close();
    }

}
