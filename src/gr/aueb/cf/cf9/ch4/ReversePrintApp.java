package gr.aueb.cf.cf9.ch4;

/**
 * Prints the numbers 1 through 10 in reverse
 * @author Giannis
 * @version 1.0.0
 */

public class ReversePrintApp {
    public static void main(String[] args) {
        for (int i = 10; i >=1; i--) {
            System.out.printf(" %d",i);
        }
        System.out.println();
    }
}
