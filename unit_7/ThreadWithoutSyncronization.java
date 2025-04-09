package unit_7;

class First {
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

class Second extends Thread {
    String msg;
    First fobj;

    Second(First f, String str) {
        fobj = f;
        msg = str;
        start();
    }

    public void run() {
        fobj.display(msg);
    }
}

public class ThreadWithoutSyncronization {
    public static void main(String[] args) {
        First fnew = new First();
        new Second(fnew, "welcome");
        new Second(fnew, "new");
        new Second(fnew, "programmer");
    }
}

