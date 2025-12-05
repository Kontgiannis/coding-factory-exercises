package gr.aueb.cf.cf9.ch7;

import java.util.Scanner;

/**
 * Encodes a string and returns the encoded one
 * Decodes a string and returns the decoded one
 * @author Giannis
 * @version 1.0.0
 *
 */

public class JuliousCaesarEncDec {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String s1 = "HelloPhantom2025..";
        String enc = null;
        String dec;
        boolean run = true;

        while (run) {
            System.out.print("Select 1 for string Encode or 2 for string Decode or 0 to Exit: ");
            int option = reader.nextInt();
            switch (option) {
                case 0 :
                    run = false;
                    break;
                case 1 :
                    enc = encodeString(s1);
                    if ( enc == null){
                        System.out.println("The given string is ether a null or an empty string");
                    } else {
                        System.out.println("The string encoded is: " + enc);
                    }
                    break;
                case 2 :
                    if ( enc == null) {
                        System.out.println("There isn't any string to decode");
                    } else {
                        dec = decodeString(enc);
                        System.out.println("The string decoded is: " + dec);
                    }
                    break;
                default :
                    System.out.println("Invalid option");
            }
        }
    }

    /**
     * Encodes a string by replacing each char with the word next one
     * @param s input string
     * @return encoded string
     */
    public static String encodeString(String s) {

        if ( (s == null) || (s.length() == 0)) return null;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c) || (!Character.isLetterOrDigit(c))) {
                sb.append(c);
            } else if ((c >= 'A' && c <= 'Z')) {
                c = (char)((c - 'A' + 3) % 26 + 'A');
                sb.append(c);
            } else if ((c >= 'a' && c <= 'z')) {
                c = (char)((c - 'a' + 3) % 26 + 'a');
                sb.append(c);
            }
        }
        return sb.toString();
    }

    /**
     * Decodes a string by replacing each char with the word previous one
     * @param s input string
     * @return decoded string
     */

    public static String decodeString(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c) || (!Character.isLetterOrDigit(c))) {
                sb.append(c);
            } else if ((c >= 'A' && c <= 'Z')) {
                c = (char)((c - 'A' - 3 + 26) % 26 + 'A');
                sb.append(c);
            } else if ((c >= 'a' && c <= 'z')) {
                c = (char)((c - 'a' - 3 + 26) % 26 + 'a');
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
