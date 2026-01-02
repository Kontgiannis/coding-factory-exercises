package gr.aueb.cf.cf9.review_challenges;

/**
 * Γράψτε μια μέθοδο που αντικαθιστά όλα τα κενά (' ')
 * σε ένα String με "%20" (όπως γίνεται σε URLs).
 *
 */

public class URLEncoding {
    public static void main(String[] args) {
        String s = "Athens Uni of Econ and Business";
        System.out.println(urlEncoding(s));
    }
    public static String urlEncoding(String s) {
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (ch == ' ') {
                sb.append("%20");
            }
            sb.append(ch);
        }
        return sb.toString();
    }
}
