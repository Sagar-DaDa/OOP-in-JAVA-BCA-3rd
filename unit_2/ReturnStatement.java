package unit_2;

public class ReturnStatement {
    public static int findMax(int a, int b) {
        if (a > b) {
            return a;  // Return a if it's greater
        } else {
            return b;  // Return b if it's greater
        }
    }
    public static void main(String[] args) {
        int max = findMax(10, 20);
        System.out.println("Maximum: " + max);
    }
    
}
