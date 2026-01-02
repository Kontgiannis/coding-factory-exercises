package gr.aueb.cf.cf9.review_challenges;

import java.util.Arrays;

/**
 * Δίνεται ένας πίνακας ακεραίων.
 * Να υπολογιστεί το άθροισμα των στοιχείων του.
 */

public class SumOfArray {
    public static void main(String[] args) {}

    public static int sumOfArray(int[] arr) {
        return Arrays.stream(arr).sum();
    }
}
