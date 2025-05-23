package unit_7.combining_runnable_and_thread;

public class GuessANumber extends Thread {
    private int number;

    // Constructor to set the target number
    public GuessANumber(int number) {
        this.number = number;
    }

    // Override the run() method to guess the number
    public void run() {
        int counter = 0;
        int guess = 0;
        do {
            guess = (int) (Math.random() * 100 + 1);
            System.out.println(this.getName() + " guesses " + guess);
            counter++;
        } while (guess != number);
        System.out.println("** Correct! " + this.getName() + " in " + counter + " guesses **");
    }
}
