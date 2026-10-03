package filehandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class NioCreateFileExample {
    public static void main(String[] args) {
        try {
            Path path = Path.of("modernFile.txt");
            Files.createFile(path);
            System.out.println("File created successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}