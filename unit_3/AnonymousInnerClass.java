package unit_3;

class OuterClassDemo {
    void greet() {
        System.out.println("Hello from OuterClass!");
    }
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        // Anonymous inner class implementation of a method
        OuterClassDemo obj = new OuterClassDemo() {
            @Override
            void greet() {
                System.out.println("Hello from Anonymous Inner Class!");
            }
        };
        
        obj.greet();  // Calling the overridden method
    }
}

