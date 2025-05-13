package unit_11;

import javax.swing.*;       // Import Swing components
import java.awt.*;          // Import AWT layout classes

public class JFrameExample {
    public static void main(String[] args) {
        // Step 1: Create a new frame with a title
        JFrame frame = new JFrame("Welcome to Frame Demo");

        // Step 2: Define what happens when the user closes the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // This means the program will terminate when the frame is closed

        // Step 3: Create a label to display a message
        JLabel label = new JLabel("This is a basic Java Frame!", SwingConstants.CENTER);

        // Step 4: Add the label to the center of the frame's content area
        frame.getContentPane().add(label, BorderLayout.CENTER);

        // Step 5: Size the frame to fit its contents automatically
        frame.pack(); // Uses layout manager's preferred size

        // Step 6: Center the frame on the screen
        frame.setLocationRelativeTo(null); // null centers it on the screen

        // Step 7: Make the frame visible on screen
        frame.setVisible(true);
    }
}

