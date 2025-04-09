package unit_8;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your gender (M/F): ");
        char gender = sc.next().charAt(0);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your mobile number: ");
        long mobileNo = sc.nextLong();

        System.out.print("Enter your CGPA: ");
        double cgpa = sc.nextDouble();

        System.out.println("\n--- User Details ---");
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Mobile Number: " + mobileNo);
        System.out.println("CGPA: " + cgpa);

        sc.close();
    }
}

