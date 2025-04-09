package unit_3;

public class ParameterizedConstructorDemo {
    public static void main(String[] args) {
        StudentDemo ram = new StudentDemo("Ram Kumar", 20);
        System.out.println("Name: " + ram.name);
        System.out.println("Age: " + ram.age);
        System.out.println("Address: " + ram.address);
    }
}

class StudentDemo {
    String name;
    int age;
    String address;

    // Parameterized Constructor
    StudentDemo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    StudentDemo(String name, int age, String address){
        this.name= name;
        this.age = age;
        this.address = address;
    }
}
