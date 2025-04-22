package unit_9;

public class NumberCompareTo {
    public static void main(String[] args) {
        Integer i = new Integer("10");
        System.out.println(i.compareTo(7));   // Output: 1
        System.out.println(i.compareTo(11));  // Output: -1
        System.out.println(i.compareTo(10));  // Output: 0
    }
}
