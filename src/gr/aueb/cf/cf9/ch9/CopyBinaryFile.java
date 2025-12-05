package gr.aueb.cf.cf9.ch9;

import java.util.Scanner;
import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.UUID;

/**
 * Creates a copy of a binary file
 * @author Giannis
 * @version 1.0.0
 */

public class CopyBinaryFile {
    public static void main(String[] args) throws IOException {
        try  {
            Scanner reader = new Scanner(System.in);
            System.out.print("GIve the name of the file you want to copy: ");
            String fileName = reader.nextLine();
            Path userInputFile = Path.of("C:/tmp/", fileName);
            String newName = "C:/tmp/" + UUID.randomUUID().toString().replace(":", "_") + "_"
                    + userInputFile.getFileName();
            Path target = Paths.get(newName);
            Files.copy(userInputFile, target);
            String sourceFile = userInputFile.toAbsolutePath().toString();
            String extension = fileName.substring(fileName.lastIndexOf(".") + 1);
            System.out.println("/** PRINTING METADATA **/");
            System.out.println("Source file absolute path: " + sourceFile);
            System.out.println("Full name of copied file: " + newName);
            System.out.println("The extension of the source file is: " + extension);
        } catch (IOException e) {
            System.out.println("Error copying the file" + e.getMessage());
        }
    }
}
