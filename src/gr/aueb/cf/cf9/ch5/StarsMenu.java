package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

/**
 *  Shows a menu with 6 choices ( 6th is the termination) and asks the user to choose how would the user like the stars be printed and then
 *  to give the number of stars the user wants printed
 * @author Giannis
 * @version 1.0.0
 */

public class StarsMenu {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int choice;
        int num;
        boolean run = true;
        while (run) {
            printMenu();
            choice = reader.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Give the number of stars you want to be printed: ");
                    num = reader.nextInt();
                    printHorizontalStars(num);
                    System.out.println();
                    break;
                case 2:
                    System.out.print("Give the number of stars you want to be printed: ");
                    num = reader.nextInt();
                    printVerticalStars(num);
                    System.out.println();
                    break;
                case 3:
                    System.out.print("Give the number of stars you want to be printed: ");
                    num = reader.nextInt();
                    printSquareStars(num);
                    System.out.println();
                    break;
                case 4:
                    System.out.print("Give the number of stars you want to be printed: ");
                    num = reader.nextInt();
                    printAscendingStars(num);
                    System.out.println();
                    break;
                case 5:
                    System.out.print("Give the number of stars you want to be printed: ");
                    num = reader.nextInt();
                    printDescendingStars(num);
                    System.out.println();
                    break;
                case 6:
                    System.out.println("//...Program exiting...//");
                    run = false;
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }

        }

    }

    public static void printMenu() {
        System.out.printf("1.Εμφάνισε n αστεράκια οριζόντια%n" +
                "2. Εμφάνισε n αστεράκια κάθετα%n" +
                "3. Εμφάνισε n γραμμές με n αστεράκια%n" +
                "4. Εμφάνισε n γραμμές με αστεράκια 1 έως n%n" +
                "5. Εμφάνισε n γραμμές με αστεράκια n έως 1%n" +
                "6. Έξοδος από το πρόγραμμα%n");
        System.out.print("Give a choice: ");
    }

    public static void printHorizontalStars(int num) {
        char star = '*';
        for (int i =1; i <= num; i++) {
            System.out.print(star);
        }
    }
    public static void printVerticalStars(int num) {
        char star = '*';
        for (int i =1; i <= num; i++) {
            System.out.println(star);
        }
    }
    public static void printSquareStars(int num) {
        for (int i =1; i <= num; i++) {
            printHorizontalStars(num);
            System.out.println();
        }
    }
    public static void printAscendingStars(int num) {
        for (int i = 1; i <= num; i++) {
            printHorizontalStars(i);
        }
    }
    public static void printDescendingStars(int num) {
        for (int i = num; i >= 1; i--) {
            printHorizontalStars(i);
        }
    }
}
