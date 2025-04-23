package unit_10;

import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {
        List<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("Python");

        Set<Integer> ids = new HashSet<>();
        ids.add(101);
        ids.add(102);

        Map<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 90);
        scores.put("Bob", 85);

        System.out.println(languages); // [Java, Python]
        System.out.println(ids);       // [101, 102]
        System.out.println(scores);    // {Alice=90, Bob=85}
    }
}

