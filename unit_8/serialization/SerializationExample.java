package unit_8.serialization;

import java.io.*;

public class SerializationExample {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name = "Sumit Bhujel";
        employee.address = "Biratnagar";
        employee.SSN = 11122333;
        employee.number = 101;

        try {
            FileOutputStream fileOut = new FileOutputStream("unit_8/serialization/sumit.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(employee);  // Serializing the object
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in employee.ser");
        } catch(IOException i) {
            i.printStackTrace();
        }
    }
}

