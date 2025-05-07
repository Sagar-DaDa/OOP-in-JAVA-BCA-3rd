package unit_10.set;

import java.util.*;

class HashSetExample {
    public static void main(String[] args) {
        // Creating a HashSet
        HashSet<String> h = new HashSet<String>();

        // Adding elements to the HashSet
        h.add("India");
        h.add("Nepal");
        h.add("Australia");
        h.add("South Africa");
        h.add("Nepal"); // Duplicate element, will not be added

        // Displaying the HashSet
        System.out.println("HashSet: " + h);

        // Checking if "India" is present
        System.out.println("List contains Nepal or not: " + h.contains("Nepal"));

        // Removing an element
        h.remove("Australia");
        System.out.println("List after removing Australia: " + h);

        // Iterating through HashSet
        System.out.println("Iterating over set:");
        Iterator<String> i = h.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}

