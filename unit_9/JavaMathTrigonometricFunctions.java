package unit_9;

public class JavaMathTrigonometricFunctions {
    public static void main(String[] args) {
        double a = 30;
        double radians = Math.toRadians(a);  // Convert degrees to radians

        System.out.println("Sine value of a is: " + Math.sin(radians));
        System.out.println("Cosine value of a is: " + Math.cos(radians));
        System.out.println("Tangent value of a is: " + Math.tan(radians));
        System.out.println("Arc Sine value of 0.5 is: " + Math.asin(0.5));
        System.out.println("Arc Cosine value of 0.5 is: " + Math.acos(0.5));
        System.out.println("Arc Tangent value of 1 is: " + Math.atan(1));
        System.out.println("Hyperbolic Cosine of a is: " + Math.cosh(a));
        System.out.println("Hyperbolic Tangent of a is: " + Math.tanh(a));
    }
}

