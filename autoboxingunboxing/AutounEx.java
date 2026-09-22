package autoboxingunboxing;

import java.util.ArrayList;

public class AutounEx {
    public static void main(String[] args) {
        int a = 10;
        Integer obj = a; // autoboxing
        System.out.println(a); // 10

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10); // autoboxing
        int b = list.get(0);// unboxing
        System.out.println(b);
        System.out.println(list);
    }

}
