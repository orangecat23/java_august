package filehandling;

import java.io.File;
import java.io.IOException;

public class CreateFolderAndFile {
    public static void main(String[] args) {
        try {
            File folder = new File("D:\\github_projects\\java_august\\filehandling2");

            if (!folder.exists()) {
                folder.mkdir();
            }

            File file = new File(folder, "employee.txt");

            if (file.createNewFile()) {
                System.out.println("File created successfully: " + file.getAbsolutePath());
            } else {
                System.out.println("File already exists.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}