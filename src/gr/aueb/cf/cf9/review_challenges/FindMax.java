package gr.aueb.cf.cf9.review_challenges;

import java.util.*;

/**
 * Γράψτε μια μέθοδο που δέχεται έναν πίνακα ακεραίων
 * και επιστρέφει τον μεγαλύτερο αριθμό.
 */

public class FindMax {
    public static void main(String[] args) {
        int[] arr = {1,2,3,8,4,12,7};
        int max =0;
        max =  findMax(arr);
        System.out.println("Max value is: "+ max);
        max = arr[findMaxPosition(arr)];
        System.out.println("Max: "+ max);
    }
    /**
     * Solution with collection.
     *
     * @param arr   the input array.
     * @return      the max or 0 if array is null.
     */
    private static int findMax(int[] arr){
        return Arrays.stream(arr).max().orElseThrow(() -> new RuntimeException("Array is empty!"));
    }
    /**
     * Finds array max position with iterating
     * through the elements of the array and making
     * comparisons. Time complexity is O(n).
     * @param arr
     * @return
     */
    private static int findMaxPosition(int[] arr){
        int max;
        int maxPosition;
        if (arr.length == 0 ||arr == null){
            throw new RuntimeException("Array is empty!");
        }
        maxPosition = 0;
        max = arr[maxPosition];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > max){
                maxPosition = i;
                max = arr[maxPosition];
            }
        }
        return maxPosition;
    }

}
