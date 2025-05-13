package unit_11;

import java.awt.*;
import javax.swing.*;

public class JPanelExample extends JFrame {
    public static void main(String[] args) {
        // Create a new frame
        JFrame f = new JFrame("JPanel Example");

        // Create components
        JLabel label = new JLabel("Panel Label");
        JButton b1 = new JButton("Button 1");
        JButton b2 = new JButton("Button 2");
        JButton b3 = new JButton("Button 3");

        // Create a JPanel
        JPanel panel = new JPanel(); // Uses FlowLayout by default

        // Add components to the panel
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(label);

        // Set background color
        panel.setBackground(Color.RED);

        // Add panel to the frame
        f.add(panel);

        // Set frame size and default close operation
        f.setSize(300, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Display the frame
        f.setVisible(true);
    }
}

