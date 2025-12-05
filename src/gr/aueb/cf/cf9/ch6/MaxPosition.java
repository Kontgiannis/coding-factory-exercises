package gr.aueb.cf.cf9.ch6;

/**
 * Takes an array and returns the position of the max element
 * @author Giannis
 * @version 1.0.0
 */

public class MaxPosition {
    public static void main(String[] args) {
        int[] arr = {10, 5, 42, 8, 25};
        int maxPos = getMaxPosition(arr, 0, arr.length - 1);
        if (maxPos == -1) {
            System.out.println("There is not such element cause the array is either null or zero length or bad input ");
        }else {
            System.out.printf("The max element of the array is at the %d position",maxPos);
        }
    }

    /**
     * finds the position of the max element
     * @param arr sopurce array
     * @param low start searching postition
     * @param high end searching position
     * @return maxPosition of the max elemnt or -1 if array is null or bad input during method call
     */
    public static int getMaxPosition(int[] arr, int low, int high) {

        if ((arr.length == 0) || (arr == null)) return -1;
        if ((low < 0) || (low > high) || (high > arr.length -1)) return -1;

        int maxvalue = arr[low];
        int maxPosition = low;
        for (int i = low + 1; i <= high; i++){
            if(arr[i] > maxvalue) {
                maxvalue = arr[i];
                maxPosition = i;
            }
        }
        return maxPosition;


    }
}
