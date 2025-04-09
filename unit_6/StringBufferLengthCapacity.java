package unit_6;

public class StringBufferLengthCapacity {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("Length: " + sb.length());      // Output: 5
        System.out.println("Capacity: " + sb.capacity());  // Output: 21 (16 default + 5)
    }
}
