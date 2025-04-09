package unit_6;

public class StringIndexOfUsingIndex {
    public static void main(String[] args) {
        String str = "Java is fun, Java is powerful";
        int index = str.indexOf("Java", 5);  // Search for "Java" starting from index 5
        System.out.println("Index of 'Java' after position 5: " + index);
    }
}
