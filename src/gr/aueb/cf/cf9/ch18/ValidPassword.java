package gr.aueb.cf.cf9.ch18;

import java.util.*;
import java.util.regex.Pattern;

/**
 * Checks if the given password has
 * at least 8 chars
 * at least 1 small letter
 * at least 1 capital letter
 * at least 1 number
 * at least 1 special character #?!@$%^&*-
 */

public class ValidPassword {
    public static void main(String[] args) {
        String pass = "hantom7@Tet";
        System.out.printf("The given password is %s\n", (isValidPassword(pass)) ? "Valid" : "Invalid");
    }

    private static boolean isValidPassword(String pass) {
        if (pass == null) return false;
        Pattern p = Pattern.compile("(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])^.{8,}$");
        return p.matcher(pass).matches();
    }
}
