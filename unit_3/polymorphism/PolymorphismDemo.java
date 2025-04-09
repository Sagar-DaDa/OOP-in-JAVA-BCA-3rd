package unit_3.polymorphism;

public class PolymorphismDemo {
    public static void main(String[] args) {
        Person p = new Father();
        Person obj = new Person();
        p.role();  
        obj.role();
    }
}

class Person {
    void role() {
        System.out.println("I am a person.");
    }
}

class Father extends Person {
    @Override
    void role() {
        System.out.println("I am a father.");
    }
}
