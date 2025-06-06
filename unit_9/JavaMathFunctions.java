package unit_9;

public class JavaMathFunctions {
    public static void main(String[] args) {
        double x = 28;
        double y = 4;

        System.out.println("Maximum number of x and y is: " + Math.max(x, y));
        System.out.println("Square root of y is: " + Math.sqrt(y));
        System.out.println("Power of x and y is: " + Math.pow(x, y));
        System.out.println("Logarithm of x is: " + Math.log(x));
        System.out.println("Logarithm of y is: " + Math.log(y));
        System.out.println("log10 of x is: " + Math.log10(x));
        System.out.println("log10 of y is: " + Math.log10(y));
        System.out.println("log1p of x is: " + Math.log1p(x));   // log(1 + x)
        System.out.println("exp of x is: " + Math.exp(x));       // e^x
        System.out.println("expm1 of x is: " + Math.expm1(x));   // e^x - 1
    }
}

