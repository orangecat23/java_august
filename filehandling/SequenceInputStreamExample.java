package filehandling;

import java.io.FileInputStream;
import java.io.SequenceInputStream;

public class SequenceInputStreamExample {
    public static void main(String[] args) {
        try {
            FileInputStream fis1 = new FileInputStream("demo.txt");
            FileInputStream fis2 = new FileInputStream("sample.txt");
            FileInputStream fis3 = new FileInputStream("output.txt");

            SequenceInputStream sis = new SequenceInputStream(fis1, fis2);
            SequenceInputStream sis2 = new SequenceInputStream(sis, fis3);

            int i;
            while ((i = sis2.read()) != -1) {
                System.out.print((char) i);
            }

            sis2.close();
            fis1.close();
            fis2.close();
            fis3.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}