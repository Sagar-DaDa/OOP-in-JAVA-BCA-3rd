package unit_6;

public class StringIndexOfSubstring {
    public static void main(String[] args) {
        String strOrig = "Hello Birat Kshitiz College";
        int id = strOrig.indexOf("Birat");
        
        if (id == -1)
            System.out.println("Birat not found");
        else
            System.out.println("Found 'Birat' at index " + id);
    }
}