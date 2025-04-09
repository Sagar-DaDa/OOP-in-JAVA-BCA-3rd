package unit_3.recursion;

class Recursion {
    int fact(int n) {
        int result;

        if (n == 1)
            return 1;
        result = fact(n - 1) * n;
        return result;
    }
}

public class Factorial {
    public static void main(String[] args) {
        Recursion recursionMethod = new Recursion();

        System.out.println(String.format("Factorial of 3 is %d", recursionMethod.fact(3)));
        
        System.out.println("Factorial of 3 is " + recursionMethod.fact(3));
        System.out.println("Factorial of 4 is " + recursionMethod.fact(4));
        System.out.println("Factorial of 5 is " + recursionMethod.fact(5));
    }
}
