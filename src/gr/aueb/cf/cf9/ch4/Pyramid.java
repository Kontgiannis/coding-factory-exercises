package gr.aueb.cf.cf9.ch4;

/**
 * Prints  pyramid with 4 rows
 * @author Giannis
 * @version 1.0.0
 */

public class Pyramid {
    public static void main(String[] args) {
        String star = "*";
        String space = " ";
        final int ROWS = 4;

        for (int i = 1; i <= ROWS; i ++) {
            int starsInRow = 2*i-1;
            int spacesInRow = ROWS-i;
            System.out.println( space.repeat(spacesInRow) + star.repeat(starsInRow));
        }
    }
}

