package unit_2;

public class LiteralExamples {
    public static void main(String[] args) {
        
        // Character Literals
        char letter = 'A';  
        char symbol = '%';  
        char unicodeChar = '\u0041';  // Unicode for 'A'
        System.out.println("Character Literals: " + letter + ", " + symbol + ", " + unicodeChar);
        
        // String Literals
        String name = "Alice";  
        String message = "Welcome to Java!";  
        System.out.println("String Literals: " + name + " says: " + message);

        // Floating-Point Literals
        float pi = 3.14f;  // Float literal
        double gravity = 9.80665;  // Double literal (D is optional)
        double expValue = 1.23e3;  // Exponent form (1.23 * 10^3)
        System.out.println("Floating-Point Literals: Pi = " + pi + ", Gravity = " + gravity + ", Exponential Value = " + expValue);

        // Boolean Literals
        boolean isJavaFun = true;
        boolean isRaining = false;
        System.out.println("Boolean Literals: Is Java fun? " + isJavaFun + ", Is it raining? " + isRaining);

        // Null Literals
        String city = null;
        if (city == null) {
            System.out.println("Null Literal: City is not assigned a value.");
        }

        // Class Literals
        Class<?> scannerClass = java.util.Scanner.class;
        System.out.println("Class Literal: " + scannerClass.getName());

        // Invalid Literals (Uncomment to see errors)
        // float g = 6_.674f;  // Error: Underscore adjacent to decimal point
        // int x = 77_;        // Error: Underscore at the end
        // int y = 0_x76;      // Error: Underscore after 0x prefix

        System.out.println("Program executed successfully.");
    }
}

