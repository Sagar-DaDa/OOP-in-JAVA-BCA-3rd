package unit_9;

public class JavaLangMathExample {
    public static void main(String[] args) {
        // Absolute value
        System.out.println("abs(-5): " + Math.abs(-5));

        // Trigonometry
        System.out.println("cos(0): " + Math.cos(0));

        // Power and Square root
        System.out.println("pow(2, 3): " + Math.pow(2, 3));
        System.out.println("sqrt(16): " + Math.sqrt(16));

        // Rounding
        System.out.println("ceil(4.3): " + Math.ceil(4.3));
        System.out.println("floor(4.7): " + Math.floor(4.7));
        System.out.println("round(4.5): " + Math.round(4.5));

        // Min and Max
        System.out.println("min(3, 9): " + Math.min(3, 9));
        System.out.println("max(3, 9): " + Math.max(3, 9));

        // Random number
        System.out.println("random(): " + Math.random());

        // Degree/Radian conversion
        System.out.println("toRadians(180): " + Math.toRadians(180));
        System.out.println("toDegrees(Math.PI): " + Math.toDegrees(Math.PI));
    }
}
