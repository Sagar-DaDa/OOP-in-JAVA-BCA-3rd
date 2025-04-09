package unit_3;

public class ObjectExample {
    public static void main(String[] args) {
        // Object creation (instantiating the Student class)
        Student s1 = new Student();
        
        // Setting object data using an instance method
        s1.setDetails("Alice", 20);
        
        // Accessing object data using an instance method
        s1.displayDetails();

        // Calling a method that returns a value
        System.out.println("Student's age: " + s1.getAge());

        // Calling a static method (does not require an instance)
        Student.greet();
    }
}

// Class definition
class Student {
    // Instance variables (each object will have its own copy)
    String name;
    int age;

    // Method to set student details (modifies object state)
    void setDetails(String n, int a) {
        name = n;
        age = a;
    }

    // Method to display student details (accesses object data)
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    
    // Method that returns a value (demonstrates method return type)
    int getAge() {
        return age;
    }
    
    // Static method (belongs to the class, not an instance)
    static void greet() {
        System.out.println("Welcome to the Student Management System!");
    }
}