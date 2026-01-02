package gr.aueb.cf.cf9.review_challenges;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Δοθέντος ενός ταξινομημένου πίνακα ακεραίων, να επιστρέψετε τους δείκτες των
 * δύο αριθμών που αθροίζονται ώστε να δώσουν έναν συγκεκριμένο στόχο (target).
 *
 * Χρησιμοποιούμε Map ως μνήμη του τι έχει διαβαστεί και για κάθε ακέραιο που
 * διαβάζουμε ψάχνουμε στο map αν αθροίζεται στο target.
 */

public class IntsSumToTarget {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
