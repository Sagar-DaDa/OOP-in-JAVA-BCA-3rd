package unit_10.map;

import java.util.*;

public class LinkedHashMapExample {
    public static void main(String[] args)
    {
        // Creating an empty LinkedHashMap
        Map<String, Integer> map = new LinkedHashMap<>();

        // Inserting pair entries in above Map
        // using put() method
        map.put("Srikhala", 10);
        map.put("Sumit", 30);
        map.put("Sujit", 20);

        // Iterating over Map
        for (Map.Entry<String, Integer> e : map.entrySet())
            // Printing key-value pairs
            System.out.println(e.getKey() + " : " + e.getValue());
    }
}

