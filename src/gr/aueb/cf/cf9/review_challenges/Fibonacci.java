package gr.aueb.cf.cf9.review_challenges;

/**
 * Γράψτε μια μέθοδο που επιστρέφει τον n-οστό
 * αριθμό Fibonacci (0, 1, 1, 2, 3, 5, 8, ...).
 *
 * Παράδειγμα
 * Είσοδος: n = 0
 * Έξοδος: 0
 *
 * Είσοδος: n = 5
 * Έξοδος: 5
 *
 * Είσοδος: n = 7
 * Έξοδος: 13
 */

public class Fibonacci {
    public static void main(String[] args) {
        int n =10;
        System.out.println(fibonacci(n));
    }
    private static int fibonacci(int n) {
        if(n < 0) throw new IllegalArgumentException("n must be >= 1");
        int fibo =0;
        int prev = 0; //F(0)
        int next = 1; // F(1)
        for(int i = 2; i <= n; i++){
            fibo = prev + next;
            prev = next;
            next = fibo;
        }

        // recursive
        // if(n==0) return 0;
        // else if(n==1) return 1;
        // else return fibonacci(n-1) + fibonacci(n-2);

        return next;
    }
}
