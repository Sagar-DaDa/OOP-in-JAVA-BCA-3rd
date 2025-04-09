package unit_7;

class FirstClass {
    public void display(String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("]");
    }
}

class SecondClass extends Thread {
    String msg;
    FirstClass fobj;

    SecondClass(FirstClass f, String str) {
        fobj = f;
        msg = str;
        start();
    }

    public void run() {
        synchronized (fobj) {
            fobj.display(msg);
        }
    }
}

public class ThreadSynchronization {
    public static void main(String[] args) {
        FirstClass fnew = new FirstClass();
        new SecondClass(fnew, "welcome");
        new SecondClass(fnew, "new");
        new SecondClass(fnew, "programmer");
    }
}

