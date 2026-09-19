package collections.linkedList;

import java.util.LinkedList;

public class Link {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        // add()
        list.add("Java");
        list.add("Python");
        list.add("C");
        list.add("C++");

        // addFirst()
        list.addFirst("C#");

        // addLast()
        list.addLast("Ruby");

        System.out.println("List: " + list);

        // get()
        System.out.println("get(2): " + list.get(2));

        // getFirst()
        System.out.println("First: " + list.getFirst());

        // getLast()
        System.out.println("Last: " + list.getLast());

        // contains()
        System.out.println("Contains Java: " + list.contains("Java"));

        // size()
        System.out.println("Size: " + list.size());

        // indexOf()
        System.out.println("Index of Java: " + list.indexOf("Java"));

        // set()
        list.set(1, "JavaScript");
        System.out.println("After set(): " + list);

        // remove()
        list.remove("C");
        System.out.println("After remove(): " + list);

        // removeFirst()
        list.removeFirst();
        System.out.println("After removeFirst(): " + list);

        // removeLast()
        list.removeLast();
        System.out.println("After removeLast(): " + list);

        // Second list for addAll(), removeAll(), retainAll()
        LinkedList<String> list2 = new LinkedList<>();

        list2.add("Java");
        list2.add("Python");

        // addAll()
        list.addAll(list2);
        System.out.println("After addAll(): " + list);

        // removeAll()
        list.removeAll(list2);
        System.out.println("After removeAll(): " + list);

        // retainAll()
        list.retainAll(list2);
        System.out.println("After retainAll(): " + list);

        // isEmpty()
        System.out.println("Is empty: " + list.isEmpty());

        // clear()
        list.clear();
        System.out.println("After clear(): " + list);

        System.out.println("Is empty: " + list.isEmpty());
    }
}