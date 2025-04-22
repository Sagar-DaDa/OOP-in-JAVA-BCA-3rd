package unit_9.package_example_one;

import unit_9.package_example_one.myPackage.MyClass;

public class PrintName {
    public static void main(String[] args) {
        String name = "My name is Khan";
        MyClass obj = new MyClass();
        obj.getNames(name);
    }
}
