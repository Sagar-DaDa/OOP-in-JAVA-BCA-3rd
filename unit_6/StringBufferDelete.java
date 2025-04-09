package unit_6;

public class StringBufferDelete {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello World");
        sb.delete(5, 11);  // Removes " World"
        System.out.println(sb);  // Output: Hello
        sb.deleteCharAt(0);  // Removes 'H'
        System.out.println(sb);  // Output: ello
    }
}
