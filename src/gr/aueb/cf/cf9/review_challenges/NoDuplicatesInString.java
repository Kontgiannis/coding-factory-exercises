package gr.aueb.cf.cf9.review_challenges;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Γράψτε μια μέθοδο που αφαιρεί τους διπλότυπους χαρακτήρες
 * από ένα String και επιστρέφει το νέο String χωρίς επαναλήψεις
 * (case sensitive).
 */

public class NoDuplicatesInString {
    public static void main(String[] args) {
        String s1 = "Hello World";
        System.out.println(noDuplicates(s1));
    }
    public static String noDuplicates(String s1) {
        Set<Character> set = new LinkedHashSet<>();
        StringBuilder sb = new StringBuilder();
        s1.chars().forEach(c -> set.add((char) c));
        set.forEach(sb::append);
        return sb.toString();
    }
}
