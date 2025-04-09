package unit_4;

class A {
    int i, j;

    A(int x, int y) {
        i = x;
        j = y;
    }

    void display() {
        System.out.println("i and j: " + i + " " + j);
    }
}

class B extends A {
    int k;

    B(int x, int y, int z) {
        super(x, y); // Calls A's constructor
        k = z;
    }

    // Overriding the display() method
    void display() {
        super.display(); // Calls display() in A
        System.out.println("k: " + k);
    }
}

public class MethodOverriding {
    public static void main(String args[]) {
        B subObj = new B(10, 20, 30);
        subObj.display(); // Calls the overridden method in B
    }
}
