package gr.aueb.cf.cf9.ch6;

/**
 * Returns the position of the seocnd min elemnt of the array
 * @author Giannis
 * @version 1.0.0
 */

public class SecondMinPosition {
    public static void main(String[] args) {
        int[] arr = {5,12,3,8,2,42,10,3};
         int secMinPos = getSecondMinPosition (arr);
        if (secMinPos == -1) {
            System.out.println("There is not such element cause the array is either null or zero length ");
        }else {
            System.out.printf("The second min element of the array is at the %d position",secMinPos);
        }
    }

    /**
     * Finds the position of the secong min value in the array
     * @param arr source array
     * @return secMinPosition or -1 if array is null or has a length smaller than 2
     */
    public static int getSecondMinPosition(int[] arr) {

        if ((arr.length < 2) || (arr == null)) return -1;
        int min = 0;
        int minValue = 0;
        int secMinValue =0;
        int secMin = 1;
        minValue = Integer.MAX_VALUE;
        secMinValue = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] < minValue) && (arr[i] < secMinValue)) {
               secMin = min;
                secMinValue = minValue;
                min = i;
                minValue = arr[i];
            } else if ((arr[i] > minValue) && (arr[i] < secMinValue)) {
                secMin = i;
                secMinValue = arr[i];
            }
        }
        return secMin;

    }
}
