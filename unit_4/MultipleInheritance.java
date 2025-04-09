package unit_4;

// First Interface
interface FirstInterface {
    void methodA();
}

// Second Interface
interface SecondInterface {
    void methodB();
}

// Class C implements both interfaces
class MultipleInheritance implements FirstInterface, SecondInterface {
    public void methodA() {
        System.out.println("Within class MultipleInheritance, method A");
    }

    public void methodB() {
        System.out.println("Within class MultipleInheritance, method B");
    }

    public static void main(String[] args) {
        MultipleInheritance obj = new MultipleInheritance();
        obj.methodA();
        obj.methodB();
    }
}

