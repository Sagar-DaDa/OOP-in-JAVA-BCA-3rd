package unit_6;

public class StringGetBytes {
    public static void main(String[] args) {
        String str = "ABC";
        byte[] byteArray = str.getBytes();
        for (byte b : byteArray) {
            System.out.print(b + " ");  // Output: 65 66 67
        }
    }
}
