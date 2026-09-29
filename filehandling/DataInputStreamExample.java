package filehandling;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataInputStreamExample {
    public static void main(String[] args) {
        try {
            DataInputStream dis = new DataInputStream(new FileInputStream("data.txt"));
            int a = dis.readInt();
            double b = dis.readDouble();
            boolean c = dis.readBoolean();
            String d = dis.readUTF();
            dis.close();
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
