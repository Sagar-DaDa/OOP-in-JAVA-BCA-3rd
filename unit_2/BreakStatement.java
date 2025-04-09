package unit_2;

public class BreakStatement {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break; // Exit the loop when i equals 5
            }
            System.out.println(i);
        }
    }
}
