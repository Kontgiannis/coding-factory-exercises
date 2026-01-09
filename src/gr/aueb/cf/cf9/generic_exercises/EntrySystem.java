package gr.aueb.cf.cf9.ex;

/**
 * Checks Age and ticket type given by user and determenance if they enter and if yes to which type Regular ( ticket type 1 or VIP ticket type 2)
 * age >= 18
 * @author Giannis
 * @version 1.0.0
 */
import java.util.Scanner;

public class EntrySystem {
    public static void main(String[] args){
        final int VIP = 2;
        final int AGE = 18;
        Scanner scanner = new Scanner(System.in);
        int age;
        int type;
        int retries = 0;
        type =0;
        do {
            System.out.print("Give your age: ");
            age = scanner.nextInt();
            if (age <= 0 ) {
                System.out.println("Your age can't be negative or zero...");
                continue;
            }

            retries = 3;
            do {
                System.out.print("Give your type of ticket: ");
                type = scanner.nextInt();
                retries-- ;
                if  (type != 1 && type != 2) {
                    System.out.println("Your ticket type can only be 1 ( Regular )  OR 2 (VIP)");
                    System.out.println("You have " + retries + " tries before information reset");
                } else break;
            }  while (retries > 0);

                if (retries < 0 ) {
                    System.out.println("Information reset please re - enter it");
                    continue;
                }

                if (type == 1 || type == 2) break;

            break;
        } while (true);
        if (age < AGE) {
            System.out.print("Access Denied");
        } else if (type != VIP) {
            System.out.print("Regular access granted - but not VIP");
        } else {
            System.out.print("Welcome Sir");
        }
        scanner.close();
    }

}
