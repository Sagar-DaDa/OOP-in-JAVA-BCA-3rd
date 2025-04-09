package unit_3;

class OuterClass {
    void outerMethod() {
        final int number = 100; // Local variable must be final or effectively final

        // Local inner class
        class LocalInnerClass {
            void display() {
                System.out.println("Local inner class accessing outer method variable: " + number);
            }
        }

        // Creating an instance of LocalInnerClass
        LocalInnerClass localInner = new LocalInnerClass();
        localInner.display();
    }
}

public class LocalInnerClassDemo {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.outerMethod(); // Calling the method that defines the local inner class
    }
}
