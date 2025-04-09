package unit_4;

// Interface definition
interface ParentInterface {
    void display(); // abstract method
}

// Implementing the interface in class ChildClassOne
class ChildClassOne implements ParentInterface {
    public void display() {
        System.out.println("Derived class ChildClassOne");
    }
}

// Implementing the interface in class ChildClassTwo
class ChildClassTwo implements ParentInterface {
    public void display() {
        System.out.println("Derived class ChildClassTwo");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        ParentInterface obj = new ChildClassTwo(); // Reference variable of type ParentInterface
        obj.display(); // Calling the display method of class ChildClassTwo
    }
}

