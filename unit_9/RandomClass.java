package unit_9;

import java.util.Random;

public class RandomClass {
    public static void main(String[] args) {
        Random random = new Random();

        System.out.println("Random int (0–9): " + random.nextInt(10));
        System.out.println("Random boolean: " + random.nextBoolean());
        System.out.println("Random double: " + random.nextDouble());
        System.out.println("Random float: " + random.nextFloat());
        System.out.println("Random Gaussian (Normal Distribution): " + random.nextGaussian());

        // Generate random bytes
        byte[] bytes = new byte[10];
        random.nextBytes(bytes);
        System.out.print("Random bytes: [");
        for (int i = 0; i < bytes.length; i++) {
            System.out.print(bytes[i] + (i < bytes.length - 1 ? ", " : ""));
        }
        System.out.println("]");

        System.out.println("Random long: " + random.nextLong());
        System.out.println("Random int: " + random.nextInt());

        // Set seed for reproducibility
        long seed = 95L;
        random.setSeed(seed);
        System.out.println("Re-seeded Random int (0–9): " + random.nextInt(10));
    }
}

