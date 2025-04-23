package unit_10.map;

import java.util.*;

public class TreeMapExample {
    public static void main(String[] args)
    {
        // Creating an empty TreeMap
        Map<String, Integer> map = new TreeMap<>();

        // Inserting custom elements in the Map
        // using put() method
        map.put("Sumit", 10);
        map.put("Sailesh", 30);
        map.put("Srinkhala", 20);

        // Iterating over Map using for each loop
        System.out.println("// Output");
        for (Map.Entry<String, Integer> e : map.entrySet())
            // Printing key-value pairs
            System.out.println(e.getKey() + " : " + e.getValue());
    }
}
