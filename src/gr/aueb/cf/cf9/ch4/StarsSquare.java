package gr.aueb.cf.cf9.ch4;

import java.util.Scanner;

/**
 * User gives a number n and prints nxn square of stars
 * @author Giannis
 * @version 1.0.0
 */

public class StarsSquare {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Give the number of horizontal starts you want to print: ");
        int num = reader.nextInt();
        char star = '*';
        for (int i =1; i <= num; i++) {
            for (int j =1; j <= num; j++) {
                System.out.print(star);
            }
            System.out.println();
        }
        System.out.println();
        reader.close();
    }
}
