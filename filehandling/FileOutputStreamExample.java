package filehandling;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("demo.txt", true);

            String message = "Hello Pranav, this is FileOutputStream.";

            byte[] data = message.getBytes();

            fos.write(data);
            fos.close();
            /*
             * Why close is important?
             * 1. data may not fully written
             * 2. resource leak can happen
             * 3. file corruption can happen
             * 4. file may stay locked for some system .
             */

            System.out.println("Data written successfully.");
        } catch (IOException e) {
            System.out.println("Exception handled: " + e.getMessage());
        }
    }
}
