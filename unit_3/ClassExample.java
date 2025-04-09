package unit_3;

public class ClassExample {
    // Instance variables
    static String employeeName;
    static float employeeSalary;

    // Methods Declared
    static void setEmployee(String n, float p) {
        employeeName = n;
        employeeSalary = p;
    }

    static void getEmployee() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Salary: " + employeeSalary);
    }

    // Main Method
    public static void main(String args[]) {
        ClassExample.setEmployee("Sagar Shrestha", 200000.0f);
        ClassExample.getEmployee();
    }
}
