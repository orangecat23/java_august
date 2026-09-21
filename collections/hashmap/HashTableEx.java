package collections.hashmap;

import java.util.Hashtable;

public class HashTableEx {
    public static void main(String[] args) {
        Hashtable<Integer, String> map = new Hashtable<>();
        map.put(101, "Tanaya");
        map.put(102, "Tanaya2");
        map.put(103, "Tanaya3");

        System.out.println(map.get(102)); // wrong key gives null
        System.out.println(map.containsKey(102)); // boolean
        map.remove(102);
        System.out.println(map);

        for (Integer key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }

    }

}
