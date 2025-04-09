package unit_4;

class ParentClass {
    ParentClass() {
        System.out.println("Constructor of Parent class");
    }
}

class SuperCallParentConstructor extends ParentClass {
    SuperCallParentConstructor() {
        super(); // Optional: Java calls it automatically
        System.out.println("Constructor of Child class");
    }

    public static void main(String args[]) {
        SuperCallParentConstructor obj = new SuperCallParentConstructor();
    }
}

