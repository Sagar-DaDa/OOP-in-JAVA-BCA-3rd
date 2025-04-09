package unit_8.serialization;

import java.io.*;

public class DeserializationExample {
    public static void main(String[] args) {
        Employee employee = null;

        try {
            FileInputStream fileIn = new FileInputStream("unit_8/serialization/employee.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            employee = (Employee) in.readObject();  // Deserializing the object
            in.close();
            fileIn.close();
        } catch(IOException i) {
            i.printStackTrace();
            return;
        } catch(ClassNotFoundException c) {
            System.out.println("Employee class not found");
            c.printStackTrace();
            return;
        }

        // Printing the deserialized object
        System.out.println("Deserialized Employee...");
        System.out.println("Name: " + employee.name);
        System.out.println("Address: " + employee.address);
        System.out.println("SSN: " + employee.SSN);
        System.out.println("Number: " + employee.number);
    }
}

