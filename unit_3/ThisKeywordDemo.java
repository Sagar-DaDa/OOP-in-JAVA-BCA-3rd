package unit_3;

public class ThisKeywordDemo {
    int a;
    int b;

    // Parameterized constructor
    ThisKeywordDemo(int a, int b)
	{
		this.a = a;
		this.b = b;
	}

    void display() {
        // Displaying value of variables a and b
        System.out.println("a = " + a + " b = " + b);
    }

    public static void main(String[] args) {
        ThisKeywordDemo object = new ThisKeywordDemo(10, 20);
        object.display();
    }

}
