package unit_2;

public class DefaultVariablesValue {
    int intValue;       // Default value: 0
    double doubleValue; // Default value: 0.0
    boolean boolValue;  // Default value: false
    char charValue;     // Default value: '\u0000'
    String stringValue; // Default value: null

    public void printValues() {
        System.out.println("int: " + intValue);
        System.out.println("double: " + doubleValue);
        System.out.println("boolean: " + boolValue);
        System.out.println("char: " + charValue);
        System.out.println("String: " + stringValue);
    }

    public static void main(String[] args) {
        DefaultVariablesValue obj = new DefaultVariablesValue();
        obj.printValues();
    }
}

