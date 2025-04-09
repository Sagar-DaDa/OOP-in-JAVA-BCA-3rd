package unit_4;

class Person {
    void message() {
        System.out.println("This is Person class");
    }
}

class SuperCallingParentMethod extends Person {
    void message() {
        System.out.println("This is SuperCallingParentMethod class");
    }

    void display() {
        message();       // Calls child class method
        super.message(); // Calls parent class method
    }

    public static void main(String args[]) {
        SuperCallingParentMethod s = new SuperCallingParentMethod();
        s.display();
    }
}

