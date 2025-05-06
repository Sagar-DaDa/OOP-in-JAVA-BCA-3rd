package unit_10.list;

import java.util.*;

public class ListSearchExample {
    public static void main(String[] args) {
        List<String> l = new ArrayList<String>();
        l.add("Apple");
        l.add("Banana");
        l.add("Apple");

        System.out.println("First index of Apple: " + l.indexOf("Apple")); // 0
        System.out.println("Last index of Apple: " + l.lastIndexOf("Apple")); // 2
        System.out.println("Index of Orange (not present): " + l.indexOf("Orange")); // -1
    }
}

