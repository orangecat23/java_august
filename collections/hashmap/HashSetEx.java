package collections.hashmap;

import java.util.HashSet;

public class HashSetEx {

    public static void main(String[] args) {

        HashSet<String> set1 = new HashSet<>();

        set1.add("Java");
        set1.add("Python");
        set1.add("C#");
        set1.add("Java");

        System.out.println(set1);
    }
}