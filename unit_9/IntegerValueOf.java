package unit_9;

public class IntegerValueOf {
    public static void main(String[] args) {
        System.out.println("valueOf(int i): " + Integer.valueOf(50));
        System.out.println("valueOf(String s): " + Integer.valueOf("333"));
        System.out.println("valueOf(String s, int radix): " + Integer.valueOf("333", 8));
        
        Long l = Long.valueOf("51688245", 16);
        System.out.println("Hex to Long: " + l);

        // Uncommenting below lines will throw NumberFormatException
        // Integer a = Integer.valueOf("Geeks");
        // Integer b = Integer.valueOf("Geeks", 16);
    }
}

