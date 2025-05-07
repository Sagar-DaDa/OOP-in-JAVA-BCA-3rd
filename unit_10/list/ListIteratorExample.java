package unit_10.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        // Create an ArrayList with values 0 to 9
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 100; i < 1000; i+=100) {
            list.add(i);
        }
        
        // Get the ListIterator
        ListIterator<Integer> itr = list.listIterator();

        // Traverse the list
        while (itr.hasNext()) {
            int val = itr.next();
            System.out.print(val + " ");
        }
    }
}

