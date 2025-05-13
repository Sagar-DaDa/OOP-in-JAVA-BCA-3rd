package unit_11;

import javax.swing.*;

public class JLabelExample {
    public static void main(String[] args) {
        // Create a new frame
        JFrame f = new JFrame("JLabel Example");

        // Create a label
        JLabel label = new JLabel(); // blank label
        label.setText("Label Text");

        // Add label to a panel
        JPanel panel = new JPanel();
        panel.add(label);

        // Add panel to frame
        f.add(panel);

        // Set frame size
        f.setSize(300, 300);

        // Set default close operation
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Show the frame
        f.setVisible(true);
    }
}

