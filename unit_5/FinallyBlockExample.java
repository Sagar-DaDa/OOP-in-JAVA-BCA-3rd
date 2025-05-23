package unit_5;

public class FinallyBlockExample {
    public static void main(String[] args) {
        try {
            int num = 121 / 11; // This will throw ArithmeticException
            System.out.println(num);
        } catch (ArithmeticException e) {
            System.out.println("Number should not be divided by zero");
        } finally {
            System.out.println("This is finally block");
        }
        System.out.println("Out of try-catch-finally");
    }
}

