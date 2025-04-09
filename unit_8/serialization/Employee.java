package unit_8.serialization;

import java.io.Serializable;

public class Employee implements Serializable {
    public String name;
    public String address;
    public transient int SSN; // This field will not be serialized
    public int number;

    public void mailCheck() {
        System.out.println("Mailing a check to " + name + " " + address);
    }
}

