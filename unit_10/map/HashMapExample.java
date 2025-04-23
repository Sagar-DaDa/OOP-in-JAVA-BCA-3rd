package unit_10.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Creating a HashMap with String keys and Integer values
        Map<String, String> map = new HashMap<>();

        // Adding key-value pairs to the map
        map.put("studentName", "Sumit Bhujel");
        map.put("address", "Biratnagar");
        map.put("phone", "9841234567");
        map.put("email", "sumit@bkc.com");


        // Iterating over Map
        System.out.println("//Output");
        for(Map.Entry<String, String> entry : map.entrySet()){
            String key = entry.getKey(); // Get the key
            String value = entry.getValue(); // Get the value
            System.out.println(key + ": " + value); // Print the key-value pair
        }
    }
}
