package gr.aueb.cf.cf9.ch13;

/**
 * Utility class providing static methods for common String manipulation tasks,
 * such as reversing, changing case, and checking for palindromes.
 */

public class StringUtils {
    private StringUtils() {}

    /**
     * Checks if the given string is a palindrome, ignoring case (case-insensitive).
     * Returns true if the string reads the same forwards and backwards.
     * * @param s The string to check.
     * @return True if the string is a palindrome, false otherwise.
     */

    public static boolean isPallindrome(String s) {
        if(s == null || s.length() == 0) {return true;}
        StringBuilder sb = new StringBuilder(s);
        String reversed = sb.reverse().toString();
        return s.equalsIgnoreCase(reversed);
    }

    /**
     * Reverses the order of characters in the given string.
     * * @param s The string to be reversed.
     * @return The reversed string.
     * @throws IllegalArgumentException If the input string is null.
     */

    public static String reverse(String s) {
        if(s == null) {throw new IllegalArgumentException("String is null");}
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }

    /**
     * Converts all characters in the string to uppercase.
     * * @param s The string to convert.
     * @return A new string with all characters in uppercase.
     * @throws IllegalArgumentException If the input string is null.
     */

    public static String UpperCaseString(String s) {
        if(s == null) {throw new IllegalArgumentException("String is null");}
        String upper = s.toUpperCase();
        return upper;
    }
}
