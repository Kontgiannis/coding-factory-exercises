package gr.aueb.cf.cf9.ch4;

/**
 * Prints the sum of the numbers 1 through 50
 * @author Giannis
 * @version 1.0.0
 */

public class SumCalcApp {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <=50; i++) {
            sum +=i;
        }
        System.out.printf("The sum of the integers 1 through 50 is: %d",sum);
    }
}
/**
 * sum = (n*(n+1))/2 in one line....
 */