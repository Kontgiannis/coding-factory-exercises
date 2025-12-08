package gr.aueb.cf.cf9.ch13;

/**
 * Utility class that provides common mathematical operations
 * on arrays of integers, such as finding the maximum, minimum,
 * and average value.
 * @author Giannis
 * @version 1.0.0
 */

public class MathHelper {
    private  MathHelper() {}

    /**
     * Checks if the given array is null or empty
     * @param arr the given array
     * @throws NullPointerException if the array is null or empty
     */
    public static void checkArray(int [] arr){
        if(arr.length == 0 || arr == null){
            throw new NullPointerException("Array is null or empty");
        }
    }

    /**
     * Returns the maximum value in the given array.
     * * @param arr The array of integers.
     * @return The maximum element in the array.
     * @throws IllegalArgumentException If the array is null or empty.
     */

     public static int getMax(int[] arr) {
         int max = arr[0];
         for (int i = 0; i < arr.length; i++) {
             if (arr[i] > max) {
                 max = arr[i];
             }
         }
         return max;
     }

    /**
     * Returns the minimum value in the given array.
     * * @param arr The array of integers.
     * @return The minimum element in the array.
     * @throws IllegalArgumentException If the array is null or empty.
     */

     public static int getMin(int[] arr) {
         checkArray(arr);
         int min = arr[0];
         for (int i = 0; i < arr.length; i++) {
             if (arr[i] < min) {
                 min = arr[i];
             }
         }
         return min;
     }

    /**
     * Calculates the average (mean) value of the elements in the array.
     * * @param arr The array of integers.
     * @return The average value as a double.
     * @throws IllegalArgumentException If the array is null or empty.
     */

     public static double getAverage(int[] arr) {
        checkArray(arr);
        int sum = 0;
        for(int element : arr){
            sum += element;
        }
        return (double) sum/arr.length;
     }
}
