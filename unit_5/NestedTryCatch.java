package unit_5;

public class NestedTryCatch {
    public static void main(String args[]) {
        // Main try-block
        try {
            // Nested try-block 1
            try {
                // Nested try-block 2
                try {
                    int arr[] = {1, 2, 3, 4};
                    System.out.println(arr[10]); // This will throw ArrayIndexOutOfBoundsException
                } 
                catch (ArithmeticException e) {  // This won't execute as no ArithmeticException occurs
                    System.out.print("Arithmetic Exception");
                    System.out.println(" handled in try-block 3");
                }
            } 
            catch (ArithmeticException e) {  // This won't execute as well
                System.out.print("Arithmetic Exception");
                System.out.println(" handled in try-block 2");
            }
        } 
        catch (ArithmeticException e) {  // Again, won't execute because no ArithmeticException occurs
            System.out.print("Arithmetic Exception");
            System.out.println(" handled in main try-block");
        } 
        catch (ArrayIndexOutOfBoundsException e) {  // This will execute
            System.out.print("ArrayIndexOutOfBoundsException");
            System.out.println(" handled in main try-block");
        } 
        catch (Exception e) {  // General catch block for any remaining exceptions
            System.out.print("Exception");
            System.out.println(" handled in main try-block");
        }
    }
}

