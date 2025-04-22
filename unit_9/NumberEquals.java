package unit_9;

public class NumberEquals {
    public static void main(String[] args) {
        Short s = new Short("15");
        Short x = 10;
        Integer y = 15;
        Short z = 15;

        System.out.println(s.equals(x)); // false
        System.out.println(s.equals(y)); // false
        System.out.println(s.equals(z)); // true
    }
}

