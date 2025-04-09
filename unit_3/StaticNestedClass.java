package unit_3;

public class StaticNestedClass {
    public static void main(String[] args) {
        // Creating object of Static Nested Class without an instance of OuterClass
        OuterClassOne.StaticNestedClass nestedObject = new OuterClassOne.StaticNestedClass();
        nestedObject.display();
    }
}

class OuterClassOne {
    static int outerStaticVar = 10;  // Static variable in outer class
    int outerInstanceVar = 20;       // Instance variable in outer class

    // Static Nested Class
    static class StaticNestedClass {
        void display() {
            System.out.println("Outer Static Var: " + outerStaticVar);  // Accessing outer static variable
            // System.out.println("Outer Instance Var: " + outerInstanceVar); // This will cause a compile-time error
        }
    }
}
