package gr.aueb.cf.cf9.review_challenges;

/**
 * Γράψτε μια μέθοδο που ελέγχει αν δύο Strings
 * είναι αναγραμματισμός το ένα του άλλου
 * (δηλαδή περιέχουν τους ίδιους χαρακτήρες σε διαφορετική σειρά).
 *
 * Παράδειγμα
 * 'listen', 'silent'
 */

public class SameCharsDiffOrder {
    public static void main(String[] args) {
        String s1 = "abb";
        String s2 = "bab";
        System.out.println(areAnagrams(s1, s2));
    }
    public static boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        int[] frequency = new int[128];
        for(char c : s1.toCharArray()) frequency[c]++;
        for(char c : s2.toCharArray()) {
            if(--frequency[c] < 0) return false;
        }
        return true;
    }
}
