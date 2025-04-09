package unit_5;

public class MultipleCatchExample {
    public static void main(String[] args) {
        try {
            int arr[] = {10, 20, 30};
            System.out.println(arr[5]);  // Throws ArrayIndexOutOfBoundsException
            
            int result = 10 / 0;  // Throws ArithmeticException
        } 
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds.");
        } 
        catch (Exception e) {
            System.out.println("Some other exception occurred.");
        }
    }
}

