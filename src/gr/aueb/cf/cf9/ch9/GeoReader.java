package gr.aueb.cf.cf9.ch9;

import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Takes geo cordiantes from a text and writes em to a knew text in the form
 * {Loation:'...', Latitude:'...',Longitude: '...'}
 * @author Giannis
 * @version 1.0.0
 */

public class GeoReader {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:/tmp/locations.txt");
        PrintWriter pw = new PrintWriter(new File("C:/tmp/locations_formated.txt"));
        String[][] geoData;

        try {
            geoData = getGeoData(file);
            for (String[] geoDatum : geoData ) {
                pw.printf("{ Location: \' %s \' , Latitude: %s, Longitude: %s }, %n", geoDatum[0], geoDatum[1], geoDatum[2]);
            }
        }catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        pw.close();
    }

    /**
     * Reads the geo data from a file and returns them in the form of an array
     * @param file the file where the unformatted geo data are stored
     * @return the geo data from the file in the form of an array
     * @throws FileNotFoundException
     */

    public static String[][] getGeoData(File file) throws FileNotFoundException {
        String line = null;
        String [] parts;
        int count = -1;
        String[][] returnedArray = new String[10000][3];
        try (Scanner scanner = new Scanner(file)) {
            if(scanner.hasNextLine()){
                scanner.nextLine();
            }
            while(scanner.hasNextLine()) {
                count++;
                line = scanner.nextLine();
                parts = line.split(",");
                returnedArray[count] = parts;
            }
            return Arrays.copyOf(returnedArray, count + 1);
        }catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
            throw e;
        }
    }
}

