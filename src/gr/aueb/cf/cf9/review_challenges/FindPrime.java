package gr.aueb.cf.cf9.review_challenges;

/**
 * Γράψτε μια μέθοδο που ελέγχει αν ένας αριθμός είναι πρώτος
 * (δηλαδή διαιρείται μόνο με το 1 και τον εαυτό του).
 */

public class FindPrime {
    public static void main(String[] args) {
        int num =11;
        System.out.printf("Num %d is %s", num, (isPrime(num) ? "prime" : "not prime"));
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
