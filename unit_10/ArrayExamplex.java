package unit_10;

public class ArrayExamplex {
    public static void main(String[] args) {
        int[] arr = new int[5]; // declaration and memory allocation

        // Initializing array elements
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        // Accessing and displaying array elements
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at index " + i + ": " + arr[i]);
        }
    }
}

