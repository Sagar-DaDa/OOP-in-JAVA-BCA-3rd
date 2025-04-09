package unit_4;

class Example {
    int id;
    String name;

    Example(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Example[id=" + id + ", name=" + name + "]";
    }
}

public class ObjectClassMethodsExample {
    public static void main(String[] args) {
        Example obj1 = new Example(1, "Java");
        Example obj2 = new Example(2, "Python");

        System.out.println(obj1.toString()); // Calls overridden toString()
        System.out.println(obj2.getClass()); // Returns class info
        System.out.println(obj1.hashCode()); // Returns hashcode
        System.out.println(obj1.equals(obj2)); // Compares objects
    }
}

