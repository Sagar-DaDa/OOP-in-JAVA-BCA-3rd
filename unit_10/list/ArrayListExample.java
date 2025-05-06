package unit_10.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(0, 1); // adds 1 at index 0
        l1.add(1, 2); // adds 2 at index 1
        System.out.println(l1); // [1, 2]

        List<Integer> l2 = new ArrayList<Integer>();
        l2.add(1);
        l2.add(2);
        l2.add(3);

        l1.addAll(1, l2); // insert l2 at index 1
        System.out.println(l1); // [1, 1, 2, 3, 2]

        l1.remove(1); // remove element at index 1
        System.out.println(l1); // [1, 2, 3, 2]

        System.out.println(l1.get(3)); // get element at index 3 => 2

        l1.set(0, 5); // replace index 0 with 5
        System.out.println(l1); // [5, 2, 3, 2]
    }
}
