package gr.aueb.cf.cf9.review_challenges;

import java.util.*;

/**
 * Δίνεται ένας τετραγωνικός πίνακας.
 * Να υπολογιστεί η απόλυτη διαφορά μεταξύ των αθροισμάτων των διαγωνίων του.
 * Παράδειγμα:

 *     {1, 2, 3},
 *     {4, 5, 6},
 *     {9, 8, 9}
 *
 * Κύρια Διαγώνιος (1, 5, 9):
 * 1 + 5 + 9 = 15
 *
 * Δευτερεύουσα Διαγώνιος (3, 5, 9):
 * 3 + 5 + 9 = 17
 *
 * Διαφορά:
 * |15 - 17| = 2
 */

public class DiagonalDiiff {
    public static void main(String[] args) {
        int[][] arr = { {1, 4, 15},
                        {2, 1, 8},
                        {3, 3, 1}};
        System.out.println(diagonalDiff(arr));
    }
    private static int diagonalDiff(int[][] arr) {
        int diag1 = 0;
        int diag2 = 0;
        int diff =0;
        for (int i = 0; i < arr.length; i++) {
            diag1 += arr[i][i];
            diag2 += arr[i][arr[i].length - i - 1];
        }
        return Math.abs(diag1 - diag2);
    }
}
