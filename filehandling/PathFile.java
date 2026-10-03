package filehandling;

import java.io.File;
import java.io.IOException;

public class PathFile {
    public static void main(String[] args) {
        try {
            File file = new File("D:\\github_projects\\java_august\\filehandling\\newfile.txt"); // this line doesnt
                                                                                                 // create file
            if (file.createNewFile()) { // this method return boolean value
                // this method throws IOException so we must handle it with exception handling
                System.out.println("File created successfully: " + file.getName());

            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }

    }
}
