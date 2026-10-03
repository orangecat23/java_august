package filehandling;

import java.io.File;

public class PathmkdirEx {
    public static void main(String[] args) {

        File folder = new File("D:\\github_projects\\java_august\\filehandling\\newfolder");

        if (folder.mkdir()) {
            System.out.println("Folder created successfully.");
        } else {
            System.out.println("Folder already exists or failed.");
        }
    }

}
