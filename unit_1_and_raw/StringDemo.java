package unit_1_and_raw;
public class StringDemo {
    public static void main(String[] args) {
        // String name = "Sumit Bhujel";
        // String name1 = new String("Sumit Bhujel");
        // System.out.println("Value of name: " + name);
        // System.out.println("Value of name1: " + name1);

        Car creata = new Car();
        creata.name = "Hyundai";
        creata.model = "2025-HW";
        creata.color = "White";
        creata.size = "XL";
        creata.year = "2025";
        creata.price = 6000000;

        Car bmwX6M = new Car();
        bmwX6M.name = "X6 M";
        bmwX6M.model = "2025-X6";
        bmwX6M.color = "Black";
        bmwX6M.size = "XL";
        bmwX6M.year = "2025";
        bmwX6M.price = 20000000;


        System.out.println("Car name: " + creata.name);
        System.out.println("Model: " + creata.model);
        System.out.println("Color: " + creata.color);
        System.out.println("Year: " + creata.year);
        System.out.println("Price: " + creata.price);
        System.out.println("\n\n");

        System.out.println("Car name: " + bmwX6M.name);
        System.out.println("Model: " + bmwX6M.model);
        System.out.println("Color: " + bmwX6M.color);
        System.out.println("Year: " + bmwX6M.year);
        System.out.println("Price: " + bmwX6M.price);
        System.out.println("\n\n");
    }
}
