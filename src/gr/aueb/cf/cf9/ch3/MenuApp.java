package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Prints a menu and user selects one of the  5 available options and informs ( via printing a message)
 * of the choice the user made
 * @author Giannis
 * @version 1.0.0
 */

public class MenuApp {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        boolean run = true;
        while (run) {
            System.out.println("//...Choose an option..//");
            System.out.printf("1. Εισαγωγή%n2. Διαγραφή%n3. Ενημέρωση%n4. Αναζήτηση%n5. Έξοδος%n ");
            System.out.print("Selection is : ");
            int select = reader.nextInt();
            if (select <= 0 || select > 5 ) {
                System.out.println("Non existant option.Please choose a valid option");
                continue;
            }
            switch (select) {
                case 1:
                    System.out.println(" You chose Εισαγωγή");
                    break;
                case 2:
                    System.out.println("You chose Διαγραφή");
                    break;
                case 3:
                    System.out.println("You chose Ενημέρωση");
                    break;
                case 4:
                    System.out.println("You chose Αναζήτηση");
                    break;
                case 5:
                    System.out.println("You chose Έξοδος");
                    run = false;
                    break;
            }
        }
        reader.close();
    }
}
