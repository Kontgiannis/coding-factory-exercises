package gr.aueb.cf.cf9.ch4;

import java.util.Scanner;

/**
 * User gives a number n and prints n stars horizontal using i--
 * @author Giannis
 * @version 1.0.0
 */

public class StarsPrintReversed {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Give the number of horizontal starts you want to print: ");
        int num = reader.nextInt();
        char star = '*';
        for (int i =num; i >= 1; i--) {
            System.out.print(star);
        }
        System.out.println();
        reader.close();
    }
}
