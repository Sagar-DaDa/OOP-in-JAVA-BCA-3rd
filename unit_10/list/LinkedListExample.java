package unit_10.list;

import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        // Adding elements
        list.add("A");
        list.add("B");
        list.addLast("C");
        list.addFirst("D");
        list.add(2, "E");
        list.add("F");
        list.add("G");

        System.out.println("Linked list: " + list); // [D, A, E, B, C, F, G]

        // Removing elements
        list.remove("B");
        list.remove(3);
        list.removeFirst();
        list.removeLast();

        System.out.println("After deletion: " + list);

        // Checking element presence
        if (list.contains("E")) {
            System.out.println("List contains the element 'E'");
        } else {
            System.out.println("List doesn't contain the element 'E'");
        }

        // Getting size and elements
        int size = list.size();
        System.out.println("Size = " + size);

        Object element = list.get(2);
        System.out.println("Element at index 2: " + element);

        // Changing element
        list.set(2, "Y");
        System.out.println("After update: " + list);
    }
}

