package collections.vector;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

public class VectorEx {

    public static void main(String[] args) {
        Vector<String> names = new Vector<>();
        names.add("Tanaya");
        names.add("Ram");
        names.add("Lakshman");
        names.add("Hanuman");
        names.add(1, "Sita");
        System.out.println("does it contain Hanuman " + names.contains("Hanuman"));
        System.out.println("is it empty  " + names.isEmpty());

        // names.set(1, "Narayan");
        System.out.println(names);

        // indexOf lastIndexOf

        System.out.println("size of list " + names.size());
        System.out.println("element at 2nd index " + names.get(2));
        names.remove(0);
        // names.remove("Tanaya");
        System.out.println(names);
        System.out.println("size of list " + names.size());

        ArrayList<Integer> age = new ArrayList<>();
        age.add(1);
        age.add(2);
        age.add(3);
        age.add(4);
        System.out.println(age);

        for (String num : names) {
            System.out.println(num);
        }

        // Enumeration
        Enumeration<String> elements = names.elements();

        while (elements.hasMoreElements()) {
            String name = elements.nextElement();
            System.out.println(name);
        }

        // ArrayList<String> names2 = new ArrayList<>();
        // names2.add("Ganpati");
        // names2.addAll(names);
        // System.out.println(names2);
        // System.out.println(names.removeAll(names2));
        // System.out.println(names);

    }

}