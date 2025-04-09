package unit_3;

public class AbstractionDemo {
    public static void main(String[] args) {
        Features remote = new TVRemote();
        remote.turnOn();   
        remote.turnOff();
    }
}

// Demonstrating Abstraction in Java
abstract class Features {
    abstract void turnOn();
    abstract void turnOff();
}

// Concrete class implementing the abstract methods
class TVRemote extends Features {
    @Override
    void turnOn() {
        System.out.println("TV is turned ON.");
    }

    @Override
    void turnOff() {
        System.out.println("TV is turned OFF.");
    }
}

