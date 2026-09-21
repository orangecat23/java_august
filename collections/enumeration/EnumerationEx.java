package collections.enumeration;

import java.util.Enumeration;
import java.util.Hashtable;

public class EnumerationEx {
    public static void main(String[] args) {
        Hashtable<Integer, String> map = new Hashtable<>();
        map.put(101, "Tanaya");
        map.put(102, "Tanaya2");
        map.put(103, "Tanaya3");

        System.out.println(map.get(102)); // gets value for key 102
        System.out.println(map.containsKey(102)); // boolean
        map.remove(102);
        System.out.println(map);

        // for (Integer key : map.keySet()) {
        // System.out.println(key + " : " + map.get(key));
        // }

        Enumeration<Integer> keys = map.keys(); // get all ids
        while (keys.hasMoreElements()) {
            Integer id = keys.nextElement();
            System.out.println(id);
        }
        Enumeration<String> values = map.elements(); // get all ids
        while (values.hasMoreElements()) {
            String name = values.nextElement();
            System.out.println(name);
        }
    }
}