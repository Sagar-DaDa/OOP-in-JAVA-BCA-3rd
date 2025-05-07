package unit_10.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // Creating a TreeSet of Strings
        TreeSet<String> fruits = new TreeSet<>();

        // Adding elements
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Pineapple");
        fruits.add("Orange");

        
        System.out.println("Fruits Set: " + fruits);

        // Trying to add a duplicate
        fruits.add("Apple");
        System.out.println("After adding duplicate element \"Apple\": " + fruits);

        // Adding a similar-looking but different-case element
        fruits.add("banana");
        System.out.println("After adding \"banana\": " + fruits);

        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}

