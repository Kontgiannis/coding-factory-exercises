package gr.aueb.cf.cf9.review_challenges;

import java.util.*;
/**
 * Γράψτε μια μέθοδο που επιστρέφει τον χαρακτήρα που εμφανίζεται
 * πιο συχνά σε ένα String.
 */

public class HighestFrequencyChar {
    public static void main(String[] args) {
        String s = "aaaabbcccddddddddddddd";
        System.out.println("Char: " + highestFrequency(s));
    }
    public static char highestFrequency(String s) {
        int[] frequency = new int[128];
        s.chars().forEach(ch -> frequency[ch]++);
        int max = Arrays.stream(frequency).max().getAsInt();
        return (char) s.chars()
                .filter(ch -> frequency[ch] == max)
                .findFirst()
                .orElseThrow();
    }
}
