package filehandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DeleteFileNIO {
    public static void main(String[] args) {
        try {
            Files.delete(Path.of("data.txt"));
            System.out.println("File deleted");
        } catch (IOException e) {
            System.out.println("Error deleting file: " + e.getMessage());
        }
    }

}
