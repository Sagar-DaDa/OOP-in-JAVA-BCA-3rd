package unit_7.combining_runnable_and_thread;

public class DisplayMessage implements Runnable {
    private String message;

    // Constructor to set the message
    public DisplayMessage(String message) {
        this.message = message;
    }

    // Override the run() method to display the message
    public void run() {
        while (true) {
            System.out.println(message);
        }
    }
}
