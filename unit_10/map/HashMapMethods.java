package unit_10.map;

import java.util.*;

public class HashMapMethods {
    public static void main(String[] args) {
        // Creating a HashMap of Integer keys and String values
        HashMap<Integer, String> hmap = new HashMap<>();

        // Inserting key-value pairs
        hmap.put(12, "Srinkhala");
        hmap.put(2, "Sumit");
        hmap.put(7, "Sujit");
        hmap.put(49, "Sailesh");

        // Displaying all key-value pairs
        System.out.println("Initial Map Entries:");
        for (Map.Entry<Integer, String> entry : hmap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " & Value: " + entry.getValue());
        }

        // Retrieving value by key
        String valueAt2 = hmap.get(2);
        System.out.println("\nValue at key 2: " + valueAt2);

        // Removing an entry
        hmap.remove(7);
        System.out.println("\nMap after removing key 7:");

        for (Map.Entry<Integer, String> entry : hmap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " & Value: " + entry.getValue());
        }

        // Checking if key exists
        System.out.println("\nContains key 49? " + hmap.containsKey(49));

        // Checking if value exists
        System.out.println("Contains value 'Sailesh'? " + hmap.containsValue("Sailesh"));

        // Displaying all keys
        System.out.println("Keys in the map: " + hmap.keySet());

        // Displaying all values
        System.out.println("Values in the map: " + hmap.values());

        // Checking map size
        System.out.println("Map size: " + hmap.size());

        // Cloning the map
        HashMap<Integer, String> clonedMap = (HashMap<Integer, String>) hmap.clone();
        System.out.println("Cloned Map: " + clonedMap);

        // Clearing the map
        hmap.clear();
        System.out.println("Is original map empty after clear()? " + hmap.isEmpty());
    }
}

