package gr.aueb.cf.cf9.review_challenges;

/**
 * Δίνεται ένας πίνακας ακεραίων.
 * Να υπολογιστούν οι αναλογίες (σε δεκαδικό με 6 ψηφία) των:
 *
 * Θετικών αριθμών (> 0).
 * Αρνητικών αριθμών (< 0).
 * Μηδενικών (== 0).
 *
 * Παράδειγμα:
 *
 * int[] arr = {1, -2, 0, 3, 0, -4};
 * Έξοδος:
 *
 * Έξοδος
 * 0.333333  // Θετικά (2/6)
 * 0.333333  // Αρνητικά (2/6)
 * 0.333333  // Μηδενικά (2/6)
 */

public class Frequencies {
    public static void main(String[] args) {
        int[] arr = {1,2,0,0,-1,-3};
        printFrequencies(arr);
    }
    public static void printFrequencies(int[] arr){
        int pos =0;
        int negs =0;
        int zeroes =0;
        int total = arr.length;
        if(arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is null");
        }
        if (total == 0) {
            System.out.println("Array is empty can't calculate frequencies");
        }
        for( int item : arr) {
            if (item > 0) pos++;
            else if (item < 0) negs++;
            else zeroes++;
        }
        System.out.printf("Positives %.6f\n", pos / ( double) total);
        System.out.printf("Negatives %.6f\n", negs / ( double) total);
        System.out.printf("Zeroes %.6f\n", zeroes / ( double) total);
    }

}
