package unit_2;

public class TypeConversionCasting {
    public static void main(String[] args) {
        // Implicit Casting (Type Conversion)
        int intValue = 100;
        double doubleValue = intValue; // Automatic conversion from int to double
        System.out.println("Implicit Casting: int " + intValue + " to double " + doubleValue);

        // Explicit Casting (Type Casting)
        double pi = 3.14159;
        int truncatedPi = (int) pi; // Explicit conversion from double to int
        System.out.println("Explicit Casting: double " + pi + " to int " + truncatedPi);

        // Potential Data Loss Example
        int largeValue = 130;
        byte smallValue = (byte) largeValue; // Data loss occurs
        System.out.println("Data Loss Example: int " + largeValue + " to byte " + smallValue);

        // Casting char to int
        char letter = 'A';
        int asciiValue = (int) letter;
        System.out.println("Casting char to int: 'A' to " + asciiValue);
    }
}

