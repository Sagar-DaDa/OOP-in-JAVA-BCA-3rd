package unit_4;

class SuperclassOne {
    int num = 100;
}

class SuperAccessParentVariables extends SuperclassOne {
    int num = 200;

    void display() {
        System.out.println(super.num); // Access parent class variable
        System.out.println(num);       // Access child class variable
    }

    public static void main(String args[]) {
        SuperAccessParentVariables obj = new SuperAccessParentVariables();
        obj.display();
    }
}

