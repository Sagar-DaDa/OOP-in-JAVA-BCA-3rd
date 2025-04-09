package unit_7;

class ThreadDemo extends Thread {
    private String threadName;
    private Thread thread;

    // Constructor to initialize the thread name
    ThreadDemo(String name) {
        threadName = name;
        System.out.println("Creating " + threadName);
    }

    // Override the run() method
    public void run() {
        System.out.println("Running " + threadName);
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("Thread: " + threadName + ", " + i);
                // Let the thread sleep for a while
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + " interrupted.");
        }
        System.out.println("Thread " + threadName + " exiting.");
    }

    // Start the thread
    public void startThread() {
        System.out.println("Starting " + threadName);
        if (thread == null) {
            thread = new Thread(this, threadName);
            thread.start();
        }
    }
}

public class ThreadByExtendingThread {
    public static void main(String[] args) {
        // Create thread objects
        ThreadDemo T1 = new ThreadDemo("Thread-1");
        T1.startThread(); // Start the thread
        ThreadDemo T2 = new ThreadDemo("Thread-2");
        T2.startThread(); // Start the thread
    }
}

// Thread Methods in the Example:
// In this example, the following thread methods are used:
// start(): This method is used to begin the thread's execution. It internally calls the run() method, which contains the logic to be executed by the thread.
// run(): The run() method is overridden to provide the thread's task. This is the entry point for the thread's execution.
// sleep(): The sleep() method pauses the execution of the thread for a specified amount of time (in milliseconds).

